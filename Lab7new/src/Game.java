public class Game {
    private String name = "none";
    private Rule[] rules = new Rule[100];
    private int numRules = 0;
    private int teams = 0;
    private int teamSize = 0;

    //constructors:
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


    //setters & getters:
    public String getName(){
        return name;
    }
    public int getTeams(){
        return teams;
    }
    public int getTeamSize(){
        return teamSize;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setTeams(int teams){
        this.teams = teams;
    }
    public void setTeamSize(int teamSize){
        this.teamSize = teamSize;
    }

    //methods:
    public boolean addRule(Rule r){

        if(numRules > rules.length){
            return false;
        }
        else{
            rules[numRules++] = r;
            return true;
        }
    }
    public Rule[] getRules(){          //This is a getter for rules. Notice that there is no setter for rules! This is because, in
        return rules;                  // keeping with the object-oriented principles of encapsulation and data hiding, we intend for rules to
    }                                   // be modified only through the addRule method

    public int getNumRules(){           //This is a getter for numRules. For reasons identical to those in the discussion of
        return numRules;                                // "getRules" above^^ , there is no setter for numRules
    }
}
