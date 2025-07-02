public class BoardGame extends TableTopGame{

    private double boardWidth = 0.0;
    private double boardLength = 0.0;

    //constructor
    public BoardGame(double bw, double bl){
        //setting boardWidth to bw & boardLength to bl
        this.boardWidth = bw;
        this.boardLength = bl;
    }

    public BoardGame(String n){
        super(n); //- to access a constructor from the base class in a derived class
    }

    public BoardGame(String n, Rule[] rs){
        super(n, rs);
    }

    public BoardGame(String n, Rule[] rs, int t, int ts){
        super(n, rs, t, ts);
    }

    public BoardGame(){

    }

    //methods:

    // getters & setters
    public double getBoardWidth(){
        return boardWidth;
    }
    public void setBoardWidth(double boardWidth){
        this.boardWidth = boardWidth;
    }
    public double getBoardLength(){
        return boardLength;
    }
    public void setBoardLength(double boardLength){
        this.boardLength = boardLength;
    }

    //this method returns the String "Board: <value of the instance variable 'name'"
    public String toString() {
        return "Board: " + getBoardLength() + " x " + getBoardWidth();
    }


}
