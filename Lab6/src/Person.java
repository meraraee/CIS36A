public class Person {
    //private instance variables
    private String firstName;
    private String lastName;
    private String birthDate;
    private String address;
    private String nationality;
    //instance variable of type PhoneNumber class
    private PhoneNumber phoneNumber;

    //GETTERS
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getBirthDate(){
        return birthDate;
    }
    public String getAddress(){
        return address;
    }
    public String getNationality(){
        return nationality;
    }
    public PhoneNumber getPhonenumber(){
        return phoneNumber;
    }

    //SETTERS
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    public void setPhoneNumber(PhoneNumber phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    //CONSTRUCTORS
    public Person(String firstName, String lastName, String birthDate, String address,PhoneNumber phoneNumber, String nationality){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person(String firstName, String lastName, String birthDate, String nationality){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.nationality = nationality;
    }

    //INSTANCE METHOD
    public String prettyPrint(){
        return firstName + " " + lastName + "\n"
                + birthDate + "\n"
                + address + "\n"
                + phoneNumber.prettyPrint() + "\n"    //method call on phoneNumber object
                + nationality;
    }
}
