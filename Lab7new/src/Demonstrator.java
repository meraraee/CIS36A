public class Demonstrator {
    public static void main(String[] args){

        //Carefully-considered: 5 rules for CardGame
        Rule[] cardGameRules = {                                //array that holds multiple instances of the Rule class
                new Rule("Shuffle the cards."),
                new Rule("Deal 5 cards to each player."),
                new Rule("Take turns playing."),
                new Rule("The best set of cards wins."),
                new Rule("Draw a card if you have less than 5.")
        };

        CardGame poker = new CardGame(52);
        poker.setName("Poker");                 //set.Name(): giving the game a name (setter usage)
        for (Rule r : cardGameRules) poker.addRule(r);

        //another game with 2 simple rules
        Rule[] extraRules = {
                new Rule("Take turns."),
                new Rule("Follow the rules.")
        };

        BoardGame chess = new BoardGame(8.0, 8.0);
        chess.setName("Chess");
        for (Rule r : extraRules) chess.addRule(r);

        PhysicalSport soccer = new PhysicalSport(true);
        soccer.setName("Soccer");
        for (Rule r : extraRules) soccer.addRule(r);

        MotorizedSport k1Speed = new MotorizedSport("K1 Speed", "land");
        for (Rule r : extraRules) k1Speed.addRule(r);

        //outputting
        System.out.println(poker);
        System.out.println(chess);
        System.out.println(soccer);
        System.out.println(k1Speed);
    }
}
