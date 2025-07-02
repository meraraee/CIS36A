public class Demonstrator {
    public static void main(String[] args) {


        //Rule Instances:
        Rule rule01 = new Rule("No phones allowed!");
        Rule rule02 = new Rule("No cheating.");


        //Game Instances: 5 objects, each one an instance of a different class in the games classes
        Game game01 = new Game("Pac-man", new Rule[]{rule01, rule02});
        CardGame cardGame01 = new CardGame(52);
        PhysicalSport physicalSport01 = new PhysicalSport(true);
        Sport sport01 = new Sport(true, 2.5);
        MotorizedSport motorizedSport01 = new MotorizedSport("Car Racing", "land");
        BoardGame boardGame01 = new BoardGame(5.0, 10.0);
        DiceGame diceGame01 = new DiceGame(4, 2);

        //outputting all instances
        System.out.println(game01);
        System.out.println(cardGame01);
        System.out.println(physicalSport01);
        System.out.println(sport01);
        System.out.println((motorizedSport01));
        System.out.println(boardGame01);
        System.out.println(diceGame01);

    }
}

