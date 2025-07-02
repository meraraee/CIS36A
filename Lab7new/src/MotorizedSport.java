public class MotorizedSport extends Sport{

    private String medium = "land";

    //4 CONSTRUCTORS (INHERITED)
    public MotorizedSport(String n) {
        super(n);                           //super(): to access a constructor from the base class in a derived class
    }
    public MotorizedSport(String n, Rule[] rs) {
        super(n, rs);
    }
    public MotorizedSport(String n, Rule[] rs, int t, int ts) {
        super(n, rs, t, ts);
    }
    public MotorizedSport() {
    }

    //constructors:
    public MotorizedSport(String n, String m){
        super(n);
        this.medium = m;
    }

    //getter & setters:
    public String getMedium(){
        return medium;
    }
    public void setMedium(String medium){
        this.medium = medium;
    }

    @Override
    public String toString(){
        return "MotorizedSport: " + getName();
    }
}
