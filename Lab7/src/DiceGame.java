public class DiceGame extends TableTopGame{

    //instance variables with their default value
    private int numDice;
    private int numDiceSides  = 6 ;

    //constructor
    public DiceGame(int nd, int nds){
        this.numDice = nd;
        this.numDiceSides = nds;
    }
    public DiceGame(String n){
        super(n);
    }

    public DiceGame(String n, Rule[] rs){
        super(n, rs);
    }

    public DiceGame(String n, Rule[] rs, int t, int ts){
        super(n, rs, t, ts);
    }

    public DiceGame(){

    }

    //methods:

    //getters & setters
    public int getNumDice(){
        return numDice;
    }
    public void setNumDice(int numDice){
        this.numDice = numDice;
    }
    public int getNumDiceSides(){
        return numDiceSides;
    }
    public void setNumDiceSides(int numDiceSides){
        this.numDiceSides = numDiceSides;
    }

    public String toString(){
        return "DiceGame: " + getName();
    }

}
