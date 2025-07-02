public class Candy {

    //private instance variables
    private String name;
    private String type;
    private double pricePerPound;
    private double quantityInStock;
    private boolean containsNuts;

    //constructors
    public Candy(String name, String type, double pricePerPound, boolean containsNuts){
        this.name = name;
        this.type = type;
        this.pricePerPound = pricePerPound;
        this.containsNuts = containsNuts;
        quantityInStock = 0.0;

        if(name == null || name.isEmpty()){
           throw new IllegalArgumentException("Name cannot be empty.");
        }
        if(type == null || type.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if(pricePerPound <= 0){
            throw new IllegalArgumentException("Error: Price per Pound cannot be less than zero.");
        }
    }

    //getters
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public double getPricePerPound(){
        return pricePerPound;
    }
    public double getQuantityInStock(){
        return quantityInStock;
    }
    public boolean getContainsNuts() {
        return containsNuts;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setPricePerPound(double pricePerPound){
        this.pricePerPound = pricePerPound;
    }
    public void setContainsNuts(boolean containsNuts){
        this.containsNuts = containsNuts;
    }

    //instance methods:

    public void addStock(double amount){
        //adding specified amount to quantityInStock
        quantityInStock += amount;

        if(amount <= 0){
            throw new IllegalArgumentException("Amount to add cannot be less than zero.");
        }
    }

    public double removeStock(double amount){

        if(amount <= 0){
            throw new IllegalArgumentException("Amount to remove must be greater than zero.");
        } //this if-statement must be first or else it will skip and go into the no other choice but to "else{..}"


        //if amount is greater than quantityInStock, it removes and returns all remaining stock
        if(amount >= quantityInStock){
            double removed;
            removed = quantityInStock;
            quantityInStock = 0;
            return removed;
        }
        else{    //else removed what is asking for
            quantityInStock = quantityInStock - amount;
            return amount;
        }
    }

    public String toString(){
        String containsNutsStatus = containsNuts ? "Yes" : "No";
        return "Name: " + name + " \n" + "Type: " + type + " \n" + "Price per Pound: " + pricePerPound + " \n" + "Contains nuts: " + containsNutsStatus;
    }

}
