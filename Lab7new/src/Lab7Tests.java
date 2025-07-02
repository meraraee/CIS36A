// v2.0

// Version history:
// v1.0 (Oct. 8, 2024)
// v2.0 (Oct. 10, 2024):
//  * Corrected tests of BoardGame(double, double) to properly use first argument as
//  boardWidth, and second argument as boardLenth, as specified in Lab 7.
//  (order of arguments was reversed in v1.0)
//  * Corrected use of Rule class' getter getText (was previously incorrectly invoked
//  as getRuleText)
//  * Removed tests of constructors PhysicalSport(boolean, double) and MotorizedSport(boolean, double)
//  because these constructors were not specified in assignment.


import org.junit.jupiter.api.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Lab7Tests {

    String ruleText1 = "You gotta roll dice";
    String ruleText2 = "You gotta take some cards";
    String ruleText3 = "Get ten victory points to win";
    String ruleText4 = "Get five victory points to win";
    String ruleText5 = "You gotta pass some cards";
    String ruleText6 = "You gotta discard some cards";

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
    assertEquals(dg.getNumDieSides(), 101);
    dg.setNumDice(13);
    assertEquals(dg.getNumDice(), 13);
    dg.setNumDieSides(500);
    assertEquals(dg.getNumDieSides(), 500);



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
