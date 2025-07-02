public class Sport extends Game{

    private boolean olympic = false;
    private double riskLevel = 0.0;

    //4 CONSTRUCTORS (INHERITED)
    public Sport(String n){
        super(n);                           //super(): to access a constructor from the base class in a derived class
    }
    public Sport(String n, Rule[] rs){
        super(n, rs);
    }
    public Sport(String n, Rule[] rs, int t, int ts){
        super(n, rs, t, ts);
    }
    public Sport(){
    }

    //constructors:
    public Sport(boolean o, double rl){
        this.olympic = o;
        this.riskLevel = rl;
    }

    //getter & setters:
    public boolean getOlympic(){
        return olympic;
    }
    public double getRiskLevel(){
        return riskLevel;
    }
    public void setOlympic(boolean olympic){
        this.olympic = olympic;
    }
    public void setRiskLevel(double riskLevel) {
        this.riskLevel = riskLevel;
    }

    //methods:
    public String toString(){
        return "Sport: " + getName();
    }
}
