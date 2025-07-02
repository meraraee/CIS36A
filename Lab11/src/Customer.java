public class Customer {
    //instance variables
    private String name;
    private String loyaltyNumber;
    private double loyaltyPoints = 0.0;

    //Constructors
    public Customer(String name, String loyaltyNumber){
        this.name = name;
        this.loyaltyNumber = loyaltyNumber;

        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
    }

    //getters
    public String getName(){
        return name;
    }
    public String getLoyaltyNumber(){
        return loyaltyNumber;
    }
    public double getLoyaltyPoints(){
        return loyaltyPoints;
    }

    //setters
    public void setLoyaltyPoints(double loyaltyPoints){
        this.loyaltyPoints = loyaltyPoints;
    }

    //instance methods:
    public void addPoints(double points){

        if(points < 0){
            throw new IllegalArgumentException("Added Points cannot be less than zero.");
        }
        //adding the specified points to loyaltyPoints
        loyaltyPoints += points;
    }

    public void removePoints(double points){
        if(points < 0 ){
            throw new IllegalArgumentException("Removed points cannot be less than zero.");
        }
        //otherwise, subtracting the specified points from loyaltyPoints
        loyaltyPoints -= points;
    }
}
