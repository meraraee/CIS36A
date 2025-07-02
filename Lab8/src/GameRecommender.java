public class GameRecommender {

    private Game[] listOfGames;
    private int numGames;

    //constructors:
    public GameRecommender(){

        //initializing listOfGames to a new array of size 100, all values set to null
        this.listOfGames = new Game[100];

        //setting numGames to 0
        this.numGames = 0;
    }
    public GameRecommender(Game[] ig){
        if(ig.length > 100){
        System.out.println("Error: not enough space.");
        System.exit(1);
        }

        //initializing the listOfGames array with length 100
        listOfGames = new Game[100];
        numGames = 0; //setting value to 0

        //adding each game from the ig array to listOfGames
        for(int i = 0; i < ig.length; i++){
            listOfGames[i] = ig[i];
        }
        //setting numGames to the length of ig
        numGames = ig.length;
    }

    //Instance methods:
    public boolean addGame(Game g){
        // Check if there is space in listOfGames to add a new game
        if(numGames < 100){
            listOfGames[numGames] = g;  //game g is added to the next available position in the listOfGames array
            numGames++;  //incrementing the number of games
            return true;
        }
        return false; //if no space left
    }
    private double calculateAppealForPlayer(Player p, Game g){

        //calls the calculateAppeal instance method from the AppealAlgorithm class within calculateAppealForPlayer instance method
        return AppealAlgorithm.calculateAppeal(p,g);
    }

    public Game recommendOne(Player p){

        Game recommendedGame = null;
        double highestAppeal = 0;

        //looping through each game in the list
        for (int i = 0; i < numGames; i++) {
            Game currentGame = listOfGames[i];  //get the current game
            double currentAppeal = calculateAppealForPlayer(p, currentGame);  //calculate the appeal of the current game

            // If the current game's appeal is higher than the previous highest, update the recommendation
            if (currentAppeal > highestAppeal) {
                highestAppeal = currentAppeal;  // Update the highest appeal value
                recommendedGame = currentGame;  // Update the recommended game
            }
        }

        return recommendedGame;
    }


    //STRETCH GOAL:
    public Game[] recommendN(Player p, int n) {

        //  calculating e the appeal for each game
        Game[] recommendedGames = new Game[Math.min(n, numGames)];
        double[] appeals = new double[numGames];

        for (int i = 0; i < numGames; i++) {
            appeals[i] = calculateAppealForPlayer(p, listOfGames[i]);
        }

        //finding the top 'n' games with the highest appeal
        for (int i = 0; i < recommendedGames.length; i++) {
            double maxAppeal = -1; // setting initial value to a number that is guaranteed to be lower than any appeal
            int maxIndex = -1;

            //finding the game with the highest appeal that hasn't been picked yet
            for (int j = 0; j < numGames; j++) {
                if (appeals[j] > maxAppeal) {
                    maxAppeal = appeals[j];
                    maxIndex = j;
                }
            }

            //add the game with the highest appeal to the recommended list
            recommendedGames[i] = listOfGames[maxIndex];

            //setting the appeal of the chosen game to -1, marking it as "used"
            appeals[maxIndex] = -1;
        }

        return recommendedGames;
    }

}
