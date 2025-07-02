public class MotorizedSport extends Sport{

    private String medium = "land";

    //constructors
    public MotorizedSport(String n, String m){
        super(n); // Call the superclass constructor with the name
        this.medium = m; // Set the medium value for the specific instance

    }

    //4 constructors
    public MotorizedSport(String n){
        super(n);
    }

    public MotorizedSport(String n, Rule[] rs){
        super(n, rs);
    }

    public MotorizedSport(String n, Rule[] rs, int t, int ts){
        super(n, rs, t, ts);
    }

    public MotorizedSport(){

    }

    //methods:

    //getter & setter
    public String getMedium(){
        return medium;
    }
    public void setMedium(String medium){
        this.medium = medium;
    }

    public String toString(){
        return "MotorizedSport: " + getName();
    }
}
