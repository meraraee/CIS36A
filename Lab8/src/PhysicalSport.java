public class PhysicalSport extends Sport{

    private boolean aerobic;

    //constructor
    public PhysicalSport(boolean a){
        super(true, 2.0);
        this.aerobic = a;
    }

    public PhysicalSport(String n){
        super(n);
    }

    public PhysicalSport(String n, Rule[] rs){
        super(n, rs);
    }

    public PhysicalSport(String n, Rule[] rs, int t, int ts){
        super(n, rs, t, ts);
    }

    public PhysicalSport(){

    }

    //methods:

    //getters & setters

    //use "is" for boolean properties instead of "get"
    public boolean getAerobic(){
        return aerobic;
    }
    public void setAerobic(boolean aerobic){
        this.aerobic = aerobic;
    }

    public String toString(){
        return "PhysicalSport: " + getName();
    }
}
