public class Game {
    //instance variables
    private String name = "none";
    private int numRules = 0;
    private int teams = 0;
    private int teamSize = 0;
    private Rule[] rules = new Rule[100];    //rules (name of array) is an array that will hold 100 objects of type Rules

    //4 CONSTRUCTORS:
    public Game(String n){
        this.name = n;
    }

    public Game(String n, Rule[] rs){
        this.name = n;

        //Check to see that instance has long enough array rules to fit all rules in rs.
        //If instance does not have long enough array rules to receive all rules in rs, print error message and
        //exit program
        if(rs.length > rules.length){
            System.out.println("ERROR: not enough space for rules!");
            System.exit(1);
        }

        //if instance has long enough array rules to receive all rules in rs, add all rules in rs to rules
        // ensuring that numRules is correctly increased to match the number of rules added
        //USING FOR LOOP: Loop through the array of rules (rs) and add each rule to the rules array
        for(int i = 0 ;i < rs.length; i++){

            rules[i] = rs[i];

            numRules++;
        }
    }

    public Game(String n, Rule[] rs, int t, int ts){

        this.name = n;

        if(rs.length > rules.length){
            System.out.println("ERROR: not enough space for rules!");
            System.exit(1);
        }

        for(int i = 0 ;i < rs.length; i++){

            rules[i] = rs[i];

            numRules++;
        }

        //Set instance’s teams to t
        this.teams = t;
        this.teamSize = ts;
    }

    public Game(){

    }

    //METHODS:

    // getters & setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getTeams(){
        return teams;
    }
    public void setTeams(int teams){
        this.teams = teams;
    }
    public int getTeamSize(){
        return teamSize;
    }
    public void setTeamSize(int teamSize){
        this.teamSize = teamSize;
    }

    public boolean addRule(Rule r){

        //if statement checks to see that rules has enough space remaining to accept another Rule, and returns false if it does not
        if(numRules >= rules.length){
            return false;
        }

        //if it does have enough space, it adds r to rules, increments numRules, and returns true
        rules [numRules++] = r;
        return true;
    }

    //getter for rules
    public Rule[] getRules(){
        return rules;

    }

    public int getNumRules(){
        return numRules;
    }

    public String toString(){
        return "Game: " + getName();
    }
}
