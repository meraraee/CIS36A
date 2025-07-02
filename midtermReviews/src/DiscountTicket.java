public class DiscountTicket  extends Ticket{

    public DiscountTicket(double p){
        super(p);
    }

    @Override
    public double getPrice() {
        return super.getPrice() / 2.0;
    }
}
