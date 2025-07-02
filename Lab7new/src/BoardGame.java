public class BoardGame extends TableTopGame{

    private double boardWidth = 0.0;
    private double boardLength = 0.0;

    //4 CONSTRUCTORS(INHERITED)
    public BoardGame(String n){
        super(n);                           //super(): to access a constructor from the base class in a derived class
    }
    public BoardGame(String n, Rule[] rs){
        super(n, rs);
    }
    public BoardGame(String n, Rule[] rs, int t, int ts){
        super(n, rs, t, ts);
    }
    public BoardGame(){
    }

    //constructors:
    public BoardGame( double bw, double bl){
        this.boardWidth = bw;
        this.boardLength = bl;
    }

    //getter & setters:
    public double getBoardWidth(){
        return boardWidth;
    }
    public double getBoardLength(){
        return boardLength;
    }
    public void setBoardWidth(double boardWidth){
        this.boardWidth = boardWidth;
    }
    public void setBoardLength(double boardLength){
        this.boardLength = boardLength;
    }

    //methods:
    public String toString(){
        return "BoardGame: " + getName();
    }
}
