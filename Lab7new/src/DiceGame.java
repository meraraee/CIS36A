public class DiceGame extends TableTopGame{

    private int numDice = 0;
    private int numDieSides = 6;

    //4 CONSTRUCTORS (INHERITED)
    public DiceGame(String n){
        super(n);                           //super(): to access a constructor from the base class in a derived class
    }
    public DiceGame(String n, Rule[] rs){
        super(n, rs);
    }
    public DiceGame(String n, Rule[] rs, int t, int ts){
        super(n, rs, t, ts);
    }
    public DiceGame(){
    }

    //constructors:
    public DiceGame(int nd, int nds){
        this.numDice = nd;
        this.numDieSides = nds;
    }

    //getter & setters:
    public int getNumDice(){
        return numDice;
    }
    public int getNumDieSides(){
        return numDieSides;
    }
    public void setNumDice(int numDice){
        this.numDice = numDice;
    }
    public void setNumDieSides(int numDieSides){
        this.numDieSides = numDieSides;
    }

    @Override
    //method
    public String toString(){
        return "DiceGame: " + getName();
    }
}


