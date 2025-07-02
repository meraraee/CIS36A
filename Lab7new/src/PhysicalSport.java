public class PhysicalSport extends Sport {

    private boolean aerobic = false;

    //4 CONSTRUCTORS (INHERITED)
    public PhysicalSport(String n) {
        super(n);                           //super(): to access a constructor from the base class in a derived class
    }
    public PhysicalSport(String n, Rule[] rs) {
        super(n, rs);
    }
    public PhysicalSport(String n, Rule[] rs, int t, int ts) {
        super(n, rs, t, ts);
    }
    public PhysicalSport() {
    }

    //constructors:
    public PhysicalSport(boolean a) {
        this.aerobic = a;
    }

    //getter & setter
    public boolean getAerobic() {
        return aerobic;
    }
    public void setAerobic(boolean aerobic) {
        this.aerobic = aerobic;
    }

    @Override
    public String toString() {
        return "PhyiscalSport: " + getName();
    }
}
