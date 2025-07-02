public class CardGame extends TableTopGame{

    private int numCards = 52;

    //constructors:

    public CardGame(int nc){
        this.numCards = nc;
    }

    //all 4 constructors(derived)
    public CardGame(String n){
        super(n); //- to access a constructor from the base class in a derived class
    }
    public CardGame(String n, Rule[] rs){
        super(n, rs);
    }
    public CardGame(String n, Rule[] rs, int t, int ts){
        super(n, rs, t, ts);
    }
    public CardGame(){

    }


    //methods:

    //getters & setters
    public int getNumCards(){
        return numCards;
    }
    public void setNumCards(int numCards){
        this.numCards = numCards;
    }

    public String toString(){
        //getName(): the value of the instance variable 'name'
        return "CardGame: " + getNumCards();
    }

}
