public class Restaurant {

    private String name;
    private String foodType;
    private String address;
    private String owner;
    private int phoneNumber;
    private int businessLicenseNumber;
    private double yearlyGrossRevenue;

    //Getters
    public String getName(){
        return name;
    }

    public String getFoodType(){
        return foodType;
    }

    public String getAddress(){
        return address;
    }

    public String getOwner(){
        return owner;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public int getBusinessLicenseNumber(){
        return businessLicenseNumber;
    }

    public double getYearlyGrossRevenue(){
        return yearlyGrossRevenue;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setFoodType(String foodType){
        this.foodType = foodType;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setBusinessLicenseNumber(int businessLicenseNumber){
        this.businessLicenseNumber = businessLicenseNumber;
    }

    public void setYearlyGrossRevenue(double yearlyGrossRevenue){
        this.yearlyGrossRevenue = yearlyGrossRevenue;
    }

    //constructor - basically a method(function) with the name of the class that's in
    public Restaurant(String name, String foodType, String address, String owner, int phoneNumber, int businessLicenseNumber, double yearlyGrossRevenue){
        this.name = name;
        this.foodType = foodType;
        this.address = address;
        this.owner = owner;
        this.phoneNumber = phoneNumber;
        this.businessLicenseNumber = businessLicenseNumber;
        this.yearlyGrossRevenue = yearlyGrossRevenue;
    }

    //String-valued instance methods
    public String invite(){
        return "Welcome to " + name + ", that serves " + foodType + "! We are located at " + address + "!";
    }

    public String getTaxInfo(){
        return name + " / " + owner + " / " + businessLicenseNumber + " / " + yearlyGrossRevenue;
    }

}


