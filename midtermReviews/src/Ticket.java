public class Ticket {
    private double price;

    public Ticket(double p){
        price = p;
    }

    public double getPrice(){
        return price;
    }

    public String toString(){
        return "Price is " + getPrice();
    }

}
