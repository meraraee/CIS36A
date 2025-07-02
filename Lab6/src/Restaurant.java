public class Restaurant {
    private String name;
    private String foodType;
    private String address;
    private Person person;
    private PhoneNumber phoneNumber;
    private int businessLicenseNumber;
    private double yearlyGrossRevenue;

    private String firstName;
    private String lastName;

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

    public Person getPerson(){
        return person;
    }

    public PhoneNumber getPhoneNumber(){
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

    public void setOwner(Person person){
        this.person = person;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setBusinessLicenseNumber(int businessLicenseNumber){
        this.businessLicenseNumber = businessLicenseNumber;
    }

    public void setYearlyGrossRevenue(double yearlyGrossRevenue){
        this.yearlyGrossRevenue = yearlyGrossRevenue;
    }

    //constructor - basically a method(function) with the name of the class that's in
    public Restaurant(String name, String foodType, String address,Person person, PhoneNumber phoneNumber, int businessLicenseNumber, double yearlyGrossRevenue){
        this.name = name;
        this.foodType = foodType;
        this.address = address;
        this.person = person;
        this.phoneNumber = phoneNumber;
        this.businessLicenseNumber = businessLicenseNumber;
        this.yearlyGrossRevenue = yearlyGrossRevenue;
    }

    //String-valued instance methods
    public String invite(){
        return "Welcome to " + name + ", that serves " + foodType + "! We are located at " + address + "!";
    }

    public String getTaxInfo(){
        return name + " / " + person + " / " + businessLicenseNumber + " / " + yearlyGrossRevenue;
    }

}


