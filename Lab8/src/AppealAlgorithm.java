public class AppealAlgorithm {

    //using instance method to calculate the appeal of a game for a player
    public static double calculateAppeal(Player player, Game game) {

        double appeal = 1.0;  // Starting value to 1.0

        //2. increasing appeal by player’s complexityLiking * game’s numRules
        appeal += player.getComplexityLiking() * game.getNumRules();

        //3. Increasing appeal by player’s competitiveness * game’s teams
        appeal += player.getCompetitiveness() * game.getTeams();

        //4. Increasing appeal by player’s competitiveness * game’s teamSize
        appeal += player.getCompetitiveness() * game.getTeamSize();

        //5. If game is a Sport
        if (game instanceof Sport) {

            Sport sportGame = (Sport) game;

            //5.1 increase appeal by player’s riskTaking * game’s riskLevel
            appeal += player.getRiskTaking() * sportGame.getRiskLevel();

            //5.2 if game is Olympic, increase appeal by player’s competitiveness
            if (sportGame.getOlympic()) {
                appeal += player.getCompetitiveness();
            }
        }

        //6. if the game is a PhysicalSport
        if (game instanceof PhysicalSport) {
            PhysicalSport physicalSportGame = (PhysicalSport) game;

            //6.1 if the game is an aerobic sport, increase appeal by player’s workoutLiking
            if (physicalSportGame.getAerobic()) {
                appeal += player.getWorkoutLiking();
            }
        }

        //7. if the game is a MotorizedSport
        if (game instanceof MotorizedSport) {
            MotorizedSport motorizedSportGame = (MotorizedSport) game;

            //7.1 if the medium is "air", increase appeal by player’s riskTaking
            if ("air".equals(motorizedSportGame.getMedium())) {
                appeal += player.getRiskTaking();
            }
        }

        //8. if the game is a BoardGame
        if (game instanceof BoardGame) {
            BoardGame boardGame = (BoardGame) game;

            //8.1 Increase appeal by 0.1 * board area * complexityLiking
            appeal += 0.1 * boardGame.getBoardLength() * boardGame.getBoardWidth() * player.getComplexityLiking();
        }

        //9. if the game is a DiceGame
        if (game instanceof DiceGame) {
            DiceGame diceGame = (DiceGame) game;

            //9.1 increase appeal by player’s complexityLiking * game’s numDice
            appeal += player.getComplexityLiking() * diceGame.getNumDice();

            //9.2 increase appeal by player’s complexityLiking * game’s numDieSides
            appeal += player.getComplexityLiking() * diceGame.getNumDiceSides();
        }

        // 0. if the game is a CardGame
        if (game instanceof CardGame) {
            CardGame cardGame = (CardGame) game;

            //10.1 increase appeal by 0.01 * numCards * complexityLiking
            appeal += 0.01 * cardGame.getNumCards() * player.getComplexityLiking();
        }

        //11. for each game in player's specialLikes, multiply the appeal by 1.25 if the game is of the same type
        for (Game likedGame : player.getSpecialLikes()) {
            if (game.getClass().equals(likedGame.getClass())) {
                appeal *= 1.25;
            }
        }

        // 2. for each game in player's specialDislikes, multiply the appeal by 0.8 if the game is of the same type
        for (Game dislikedGame : player.getSpecialDislikes()) {
            if (game.getClass().equals(dislikedGame.getClass())) {
                appeal *= 0.8;
            }
        }

        return appeal;
    }




}
