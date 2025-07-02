public class CardGame extends TableTopGame{

    private int numCards = 52;

    //4 CONSTRUCTORS (INHERITED)
    public CardGame(String n){
        super(n);                           //super(): to access a constructor from the base class in a derived class
    }
    public CardGame(String n, Rule[] rs){
        super(n, rs);
    }
    public CardGame(String n, Rule[] rs, int t, int ts){
        super(n, rs, t, ts);
    }
    public CardGame(){
    }

    //constructors:
    public CardGame(int nc){
        this.numCards = nc;
    }

    //getter & setters;
    public int getNumCards(){
        return numCards;
    }
    public void setNumCards(int numCards){
        this.numCards = numCards;
    }

    //methods;
    public String toString(){
        return "CardGame: " + getName();
    }


}
