// v2: Corrected BoardGame constructor test to expect (bw, bl) per spec. (Oct. 30)

import org.junit.jupiter.api.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Constructor;

import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;

import static org.junit.jupiter.api.Assertions.*;

@TestClassOrder(ClassOrderer.OrderAnnotation.class)
public class Lab8Tests {

    String ruleText1 = "You gotta roll dice";
    String ruleText2 = "You gotta take some cards";
    String ruleText3 = "Get ten victory points to win";
    String ruleText4 = "Get five victory points to win";
    String ruleText5 = "You gotta pass some cards";
    String ruleText6 = "You gotta discard some cards";


    @Nested
    @DisplayName("Lab 7 Tests, to ensure all classes in the Game hierarchy work as expected")
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    @Order(1)
    class Lab7Tests {


        void testGame(String className) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

            Constructor[] constructors = Class.forName("Game").getConstructors();

            Class thisClass = null;
            try {
                thisClass = Class.forName(className);
            } catch (ClassNotFoundException e) {
                fail("Class " + className + " not found. Is there one in your project?");
            }
            Class[] noargs = {};
            Class[] string = {Class.forName("java.lang.String")};
            Class[] stringAndRules = {Class.forName("java.lang.String"), Rule[].class};
            Class[] stringAndRulesAndInts = {Class.forName("java.lang.String"), Rule[].class, int.class, int.class};

            Constructor noargsc = thisClass.getConstructor(noargs);
            Constructor stringc = thisClass.getConstructor(string);
            Constructor stringAndRulesc = thisClass.getConstructor(stringAndRules);
            Constructor stringAndRulesAndIntsc = thisClass.getConstructor(stringAndRulesAndInts);

            // Test no args constructor
            Game game = (Game) noargsc.newInstance();

            assertEquals(game.getName(), "none");
            assertEquals(game.getTeams(), 0);
            assertEquals(game.getTeamSize(), 0);

            // Test setters and getters
            String newName = "new name";
            int newTeams = 5;
            int newTeamSize = 10;
            game.setName(newName);
            game.setTeams(newTeams);
            game.setTeamSize(newTeamSize);
            assertEquals(game.getName(), newName);
            assertEquals(game.getTeams(), newTeams);
            assertEquals(game.getTeamSize(), newTeamSize);

            // Test String constructor
            game = (Game) stringc.newInstance(newName);
            assertEquals(game.getName(), newName);
            assertEquals(game.getTeams(), 0);
            assertEquals(game.getTeamSize(), 0);

            // Test String and Rule[] constructor
            Rule[] initRules = {
                    new Rule(ruleText1),
                    new Rule(ruleText2),
                    new Rule(ruleText3),
            };

            game = (Game) stringAndRulesc.newInstance(newName, initRules);
            assertEquals(game.getName(), newName);
            assertEquals(game.getTeams(), 0);
            assertEquals(game.getTeamSize(), 0);
            assertNotEquals(game.getRules(), initRules); // initRules should be added via addRule, not by giving direct reference to arg array
            assertEquals(game.getNumRules(), 3);
            assertEquals(game.getRules()[0].getText(), ruleText1);
            assertEquals(game.getRules()[1].getText(), ruleText2);
            assertEquals(game.getRules()[2].getText(), ruleText3);

            // Test addRule
            game.addRule(new Rule(ruleText4));
            assertEquals(game.getRules()[3].getText(), ruleText4);
            assertEquals(game.getNumRules(), 4);
            game.addRule(new Rule(ruleText5));
            assertEquals(game.getRules()[4].getText(), ruleText5);
            assertEquals(game.getNumRules(), 5);

            // Test String, Rule[], int, int constructor
            int initTeams = 121;
            int initTeamSize = 358;

            game = (Game) stringAndRulesAndIntsc.newInstance(newName, initRules, initTeams, initTeamSize);
            assertEquals(game.getName(), newName);
            assertEquals(game.getTeams(), initTeams);
            assertEquals(game.getTeamSize(), initTeamSize);
            assertNotEquals(game.getRules(), initRules); // initRules should be added via addRule, not by giving direct reference to arg array
            assertEquals(game.getNumRules(), 3);
            assertEquals(game.getRules()[0].getText(), ruleText1);
            assertEquals(game.getRules()[1].getText(), ruleText2);
            assertEquals(game.getRules()[2].getText(), ruleText3);

        }

        @Test
        @Order(1)
        @DisplayName("Construct and test instances of Game")
        void Game() throws InvocationTargetException, InstantiationException, IllegalAccessException {
            String className = "Game";
            try {
                testGame(className);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }

        }

        @Test
        @Order(2)
        @DisplayName("Construct and test instances of TableTopGame")
        void TableTopGame() throws InvocationTargetException, InstantiationException, IllegalAccessException {
            String className = "TableTopGame";
            try {
                testGame(className);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }

        }


        @Test
        @Order(3)
        @DisplayName("Construct and test instances of BoardGame")
        void BoardGame() throws InvocationTargetException, InstantiationException, IllegalAccessException {
            String className = "BoardGame";
            try {
                testGame(className);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }

            BoardGame bg = new BoardGame(3.86, 2.5);
            assertEquals(bg.getBoardLength(), 2.5);
            assertEquals(bg.getBoardWidth(), 3.86);

            bg.setBoardLength(6.5);
            assertEquals(bg.getBoardLength(), 6.5);
            bg.setBoardWidth(11.3);
            assertEquals(bg.getBoardWidth(), 11.3);
        }


        @Test
        @Order(4)
        @DisplayName("Construct and test instances of DiceGame")
        void DiceGame() throws InvocationTargetException, InstantiationException, IllegalAccessException {
            String className = "DiceGame";
            try {
                testGame(className);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }

            DiceGame dg = new DiceGame(54, 101);
            assertEquals(dg.getNumDice(), 54);
            assertEquals(dg.getNumDiceSides(), 101);
            dg.setNumDice(13);
            assertEquals(dg.getNumDice(), 13);
            dg.setNumDiceSides(500);
            assertEquals(dg.getNumDiceSides(), 500);


        }

        @Test
        @Order(5)
        @DisplayName("Construct and test instances of CardGame")
        void CardGame() throws InvocationTargetException, InstantiationException, IllegalAccessException {
            String className = "CardGame";
            try {
                testGame(className);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }

            CardGame cg = new CardGame(984);
            assertEquals(cg.getNumCards(), 984);
            cg.setNumCards(81);
            assertEquals(cg.getNumCards(), 81);
        }

        @Test
        @Order(6)
        @DisplayName("Construct and test instances of Sport")
        void Sport() throws InvocationTargetException, InstantiationException, IllegalAccessException {
            String className = "Sport";
            try {
                testGame(className);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }

            Sport s = new Sport(true, 4.5);
            assertTrue(s.getOlympic());
            assertEquals(s.getRiskLevel(), 4.5);
            s.setOlympic(false);
            assertFalse(s.getOlympic());
            s.setRiskLevel(98.4);
            assertEquals(s.getRiskLevel(), 98.4);


        }

        @Test
        @Order(7)
        @DisplayName("Construct and test instances of PhysicalSport")
        void PhysicalSport() throws InvocationTargetException, InstantiationException, IllegalAccessException {
            String className = "PhysicalSport";
            try {
                testGame(className);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }

            PhysicalSport ps = new PhysicalSport(true);
            assertTrue(ps.getAerobic());
            ps.setAerobic(false);
            assertFalse(ps.getAerobic());
            ps.setRiskLevel(4.5);
            assertEquals(ps.getRiskLevel(), 4.5);
            ps.setOlympic(false);
            assertFalse(ps.getOlympic());
            ps.setRiskLevel(98.4);
            assertEquals(ps.getRiskLevel(), 98.4);

        }

        @Test
        @Order(8)
        @DisplayName("Construct and test instances of MotorizedSport")
        void MotorizedSport() throws InvocationTargetException, InstantiationException, IllegalAccessException {
            String className = "MotorizedSport";
            try {
                testGame(className);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }

            MotorizedSport ms = new MotorizedSport("Boat Racing", "water");
            assertEquals(ms.getName(), "Boat Racing");
            assertEquals(ms.getMedium(), "water");
            ms.setOlympic(true);
            assertTrue(ms.getOlympic());
            ms.setRiskLevel(4.5);
            assertEquals(ms.getRiskLevel(), 4.5);
            ms.setOlympic(false);
            assertFalse(ms.getOlympic());
            ms.setRiskLevel(98.4);
            assertEquals(ms.getRiskLevel(), 98.4);

        }

        @Test
        @Order(9)
        @DisplayName("Construct and test instance of Rule")
        void Rule() {
            String ruleText = "Test rule";
            Rule r = new Rule(ruleText);
            assertEquals(r.getText(), ruleText);
        }


    }

    @Nested
    @DisplayName("Lab 8 tests")
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class Lab8SpecificTests {

        private GameRecommender recommender;
        private Player[] players;
        private Rule[] oneRule, threeRules, fiveRules;
        Player riskSeeker, complexityLiker, athlete, competitor;

        @BeforeEach
        public void setUp() {
            recommender = new GameRecommender();
            players = new Player[]{new Player(2.0, 0.0, 0.0, 0.0),
                    new Player(0.0, 2.0, 0.0, 0.0),
                    new Player(0.0, 0.0, 2.0, 0.0),
                    new Player(0.0, 0.0, 0.0, 2.0)};
            riskSeeker = players[0];
            complexityLiker = players[1];
            athlete = players[2];
            competitor = players[3];

            for (Player p : players) {
                p.setSpecialLikes(new Game[]{new Sport()});
                p.setSpecialDislikes(new Game[]{new CardGame()});
            }

            oneRule = new Rule[]{new Rule(ruleText1)};
            threeRules = new Rule[]{new Rule(ruleText1), new Rule(ruleText2), new Rule(ruleText3)};
            fiveRules = new Rule[]{new Rule(ruleText1), new Rule(ruleText2), new Rule(ruleText3), new Rule(ruleText4), new Rule(ruleText5)};

        }

        @Test
        @Order(2)
        @DisplayName("Construct Instance of GameRecommender")
        void ConstructInstancesOfGameRecommender() {
            GameRecommender gr = new GameRecommender();
            assertNotNull(gr);
        }

        @Test
        @Order(3)
        @DisplayName("Test GameRecommender.addGame")
        void testAddGame() {
            // Test adding 101 games (should fail on last add)
            for (int i = 0; i < 101; i++) {
//              System.out.println(i);
                Sport game = new Sport();
                if (i == 100) {
                    assertFalse(recommender.addGame(game));
                } else {
                    assertTrue(recommender.addGame(game));
                }
            }
        }

        @Nested
        @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
        @DisplayName("Test GameRecommender.recommendOne (indirect test of calculateAppealForPlayer):")
        class testRecommendOne {

            @Test
            @DisplayName("recommendOne test case 1")
            @Order(1)
            void recommendOne1() {
                // Create different types of physical activities
                PhysicalSport aerobicSport = new PhysicalSport("Running", oneRule, 1, 1);
                aerobicSport.setAerobic(true);
                aerobicSport.setOlympic(true);

                PhysicalSport nonAerobicSport = new PhysicalSport("Weightlifting", oneRule, 1, 1);
                nonAerobicSport.setOlympic(true);
                nonAerobicSport.setAerobic(false);

                recommender.addGame(aerobicSport);
                recommender.addGame(nonAerobicSport);

                // For athlete (workoutLiking = 2.0):
                // Running appeal = 1.0 + risk/comp adjustments + 2.0 (aerobic bonus)
                // Weightlifting appeal = 1.0 + risk/comp adjustments (no aerobic bonus)
                Game recommendation = recommender.recommendOne(athlete);
                assertEquals(aerobicSport, recommendation);
            }

            @Test
            @DisplayName("recommendOne test case 2")
            @Order(2)
            void recommendOne2() {
//                 Create games with varying risk levels
                Sport lowRisk = new Sport("Tennis", fiveRules, 2, 1);
                Sport highRisk = new Sport("Skydiving", fiveRules, 1, 1);
                lowRisk.setRiskLevel(1.0);
                highRisk.setRiskLevel(2.0);

                recommender.addGame(lowRisk);
                recommender.addGame(highRisk);

                // For riskSeeker (riskTaking = 2.0):
                // Tennis appeal = 1.0 + (2.0 * 2) + comp adjustments = ~5.0
                // Skydiving appeal = 1.0 + (2.0 * 10) + comp adjustments = ~21.0
                Game recommendation = recommender.recommendOne(riskSeeker);
                assertEquals(highRisk, recommendation);
            }

            @Test
            @DisplayName("recommendOne test case 3")
            @Order(3)
            void recommendOne3() {
//                Create games with varying complexity
                BoardGame simpleGame = new BoardGame("Tic-tac-toe", threeRules, 2, 2);
                BoardGame complexGame = new BoardGame("Chess", fiveRules, 2, 2);
                simpleGame.setBoardWidth(3.0); // Bigger board, but this game is still simpler due to less rules!
                simpleGame.setBoardLength(3.0);
                complexGame.setBoardWidth(1.0);
                complexGame.setBoardLength(1.0);

                recommender.addGame(simpleGame);
                recommender.addGame(complexGame);

                Game recommendation = recommender.recommendOne(complexityLiker);
                assertEquals(complexGame, recommendation);
            }

            @Test
            @DisplayName("recommendOne test case 4")
            @Order(4)
            void recommendOne4() {
                // Create player with mixed preferences
                Player mixedPlayer = new Player(-0.5, 1.0, 0.2, 0.8);
                mixedPlayer.setSpecialDislikes(new Game[0]);
                mixedPlayer.setSpecialLikes(new Game[0]);

                // Complex games
                MotorizedSport airSport = new MotorizedSport("Airplane Racing", oneRule, 2, 2);
                CardGame poker = new CardGame("Poker", fiveRules, 40, 1); // 40 teams!
                DiceGame craps = new DiceGame("Craps", threeRules, 2, 1);
                craps.setNumDice(2);
                craps.setNumDiceSides(6);

                airSport.setMedium("air");
                airSport.setRiskLevel(8.0);

                recommender.addGame(craps);
                recommender.addGame(poker);
                recommender.addGame(airSport);



                new Player(-0.5, 1.0, 0.2, 0.8);

        /* Appeal calculations for mixedPlayer:
           Airplane Racing:
           - Base: 1.0
           - Rules: +(1.0 * 1)
           - Teams: +(0.8 * 2)
           - Team Size: +(0.8 * 2)
           - Risk: +(-0.5 * 8)
           - Medium is "air": -(0.5)
           = 0.7

           Poker:
           - Base: 1.0
           - Rules: +(1.0 * 5)
           - Teams: +(0.8 * 40)
           - Team Size: +(0.8 * 1)
           - Cards: +(0.01 * 52 * 1.0)
           = 39.32

           Craps:
           - Base: 1.0
           - Rules: +(1.0 * 3)
           - Teams: +(0.8 * 2)
           - Team Size: +(0.8 * 1)
           - Dice: +(1.0 * 2) + (1.0 * 6)
           = 14.4
        */
                Game recommendation = recommender.recommendOne(mixedPlayer);
                assertEquals(poker, recommendation);

            }

            @Test
            @DisplayName("recommendOne test case 5")
            @Order(5)
            void recommendOne5() {
                // Create player with mixed preferences
                Player mixedPlayer = new Player(2.0, 3.0, 0.5, 1.0);
                mixedPlayer.setSpecialDislikes(new Game[0]);
                mixedPlayer.setSpecialLikes(new Game[0]);

                // Complex games
                MotorizedSport airSport = new MotorizedSport("Airplane Racing", oneRule, 2, 2);
                CardGame poker = new CardGame("Poker", fiveRules, 4, 1);
                DiceGame craps = new DiceGame("Craps", threeRules, 2, 1);
                airSport.setMedium("air");
                craps.setNumDice(2);
                craps.setNumDiceSides(6);

                airSport.setRiskLevel(8.0);

                recommender.addGame(airSport);
                recommender.addGame(poker);
                recommender.addGame(craps);


        /* Appeal calculations for mixedPlayer:
           Airplane Racing:
           - Base: 1.0
           - Rules: +(3.0 * 1)
           - Teams: +(1.0 * 2)
           - Team Size: +(1.0 * 2)
           - Risk: +(2.0 * 8)
           - Medium is "air": +(2.0)
           = 26.0

           Poker:
           - Base: 1.0
           - Rules: +(3.0 * 5)
           - Teams: +(1.0 * 4)
           - Team Size: +(1.0 * 1)
           - Cards: +(0.01 * 52 * 1.0)
           = 21.52

           Craps:
           - Base: 1.0
           - Rules: +(3.0 * 3)
           - Teams: +(1.0 * 2)
           - Team Size: +(1.0 * 1)
           - Dice: +(3.0 * 2) + (3.0 * 6)
           = 37.0
        */
                Game recommendation = recommender.recommendOne(mixedPlayer);
                assertEquals(craps, recommendation);
            }


        }


    }


}
