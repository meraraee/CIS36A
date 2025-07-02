public class TableTopGame extends Game{//DERIVED CLASS

    //4 CONSTRUCTORS(INHERITED)
    public TableTopGame(String n){
        super(n);                           //super(): to access a constructor from the base class in a derived class
    }
    public TableTopGame(String n, Rule[] rs){
        super(n, rs);
    }
    public TableTopGame(String n, Rule[] rs, int t, int ts){
        super(n, rs, t, ts);
    }
    public TableTopGame(){

    }
}



