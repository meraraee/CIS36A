public class Sport extends Game{        //DERIVED CLASS

    private boolean olympic;
    private double riskLevel;

    //constructor
    public Sport(boolean o, double rl){
        super("Sport");
        this.olympic = o;
        this.riskLevel = rl;
    }

    public Sport(String n){
        super(n);
    }

    public Sport(String n, Rule[] rs){
        super(n, rs);
    }

    public Sport(String n, Rule[] rs, int t, int ts){
        super(n, rs, t, ts);
    }

    public Sport(){

    }

    //methods:

    //getters & setters

    public boolean getOlympic(){
        return olympic;
    }
    public void setOlympic(boolean olympic){
        this.olympic = olympic;
    }
    public double getRiskLevel(){
        return riskLevel;
    }
    public void setRiskLevel(double riskLevel){
        this.riskLevel = riskLevel;
    }

    public String toString(){
        return "Sport: " + getName();
    }

}

