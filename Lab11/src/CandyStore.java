import java.util.ArrayList;

public class CandyStore {

    //private instance variables
    private final ArrayList<Candy> inventory; //private variable named inventory, which is an ArrayList that stores Candy objects
    private final ArrayList<Customer> customers; //private variable named customers, which is an ArrayList that stores Customer objects
    private static final int MAX_INVENTORY = 1000;   //static - All instances of CandyStore will share the same value for MAX_CUSTOMERS
    private static final int MAX_CUSTOMERS = 1000;      //final - value cannot be changed once it's initialized.

    //constructors
    public CandyStore() {
        //Initializing inventory and customers as new empty instances of ArrayList
        //each with the correct type parameter, meaning the type of objects the collection will store (between these "< >")
        inventory = new ArrayList<Candy>();
        customers = new ArrayList<Customer>();
    }

    //getters
    public ArrayList<Candy> getInventory() {
        return inventory;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public static int getMAX_INVENTORY() {
        return MAX_INVENTORY;
    }

    public static int getMAX_CUSTOMERS() {
        return MAX_CUSTOMERS;
    }

    //instance methods:
    public int getInventorySize() {
        //returns the current number of candy items in inventory
        return inventory.size();
    }

    public int getCustomerCount() {
        return customers.size();
    }

    public void addCandy(Candy candy) {
        //check if inventory size exceeds the max allowed
        if (inventory.size() >= MAX_INVENTORY) {
            throw new IllegalStateException("Cannot add candy. Inventory size exceeds the maximum limit.");
        }

        //checks if a candy with the same name already exists in the inventory
        for (Candy existingCandy : inventory) {
            if (existingCandy.getName().equals(candy.getName())) {
                throw new IllegalStateException("Candy with the same name already exists in the inventory.");
            }
        }
        //if no exceptions were thrown, add the candy to the inventory
        inventory.add(candy);
    }

    public Candy findCandy(String name) {

        //this for loop iterate over the inventory to find the first candy that matches the given name
        for (Candy candy : inventory) {
            if (candy.getName().equals(name)) {
                return candy; //returning the first matching candy
            }
        }

        //else if no candy with the given name is found, throw an IllegalArgumentException
        throw new IllegalArgumentException("No candy found with the name: " + name);
    }

    public void addCustomer(String name, String loyaltyNumber) {
        //checks if the number of customers exceeds MAX_CUSTOMERS
        if (customers.size() >= MAX_CUSTOMERS) {
            throw new IllegalStateException("Cannot add customer. Customer list exceeds maximum limit.");
        }

        //checks if any existing customer has the same loyaltyNumber
        for (Customer customer : customers) {
            if (customer.getLoyaltyNumber().equals(loyaltyNumber)) {
                throw new IllegalStateException("Customer with the same loyalty number already exists.");
            }
        }

        //creating a new Customer object using the provided name and loyaltyNumber and then adds it to the customers list.
        Customer newCustomer = new Customer(name, loyaltyNumber);
        customers.add(newCustomer);
    }

    public void addCustomer(Customer c){

        //throw an IllegalStateException if customers length would exceed MAX_CUSTOMERS
        if(customers.size() >= MAX_CUSTOMERS){
            throw new IllegalStateException("Cannot add customer. Customer list exceeds maximum limit.");
        }

        //throws IllegalStateException if any Customer in customers already has a loyaltyNumber equal to loyaltyNumber
        for(Customer customers : customers){
            if(customers.getLoyaltyNumber().equals(c.getLoyaltyNumber())){
                throw new IllegalStateException("Customer with the same loyalty number already exists.");
            }
        }
        customers.add(c);
    }

    public Customer findCustomer(String loyaltyNumber){

        //search for a customer with the matching loyalty number
        for(Customer customer: customers){
            if(customer.getLoyaltyNumber().equals(loyaltyNumber)){
                return customer;   //returns the customer with the given loyalty number
            }
        }

        //if no match is found, throw IllegalArgumentException
        throw new IllegalArgumentException("No customer found with loyalty number.");
    }

    public ArrayList<Candy> findNutFreeCandy(){
        ArrayList<Candy> nutFreeCandies = new ArrayList<>();
        for (Candy c : inventory) {
            if (!c.getContainsNuts()) {
                nutFreeCandies.add(c);
            }
        }
        return nutFreeCandies;
    }

    public ArrayList<Candy> findLowStock(double threshold){
        ArrayList<Candy> result = new ArrayList<>();
        for (Candy c : inventory) {
            if (c.getQuantityInStock() < threshold) {
                result.add(c);
            }
        }
        return result;
    }

    public ArrayList<Candy> findCandyByType(String type){
        ArrayList<Candy> matchingTypeCandies = new ArrayList<>();
        for (Candy c : inventory) {
            if (c.getType().equalsIgnoreCase(type)) {
                matchingTypeCandies.add(c);
            }
        }
        return matchingTypeCandies;
    }

    //Stretch Goals:

    public void purchaseUsingLoyaltyPoints(Candy candy, String loyaltyNumber, double quantity){

        //finding the customer based on loyalty number
        Customer customer = null;
        for (Customer c : customers) {
            if (c.getLoyaltyNumber().equals(loyaltyNumber)) {
                customer = c;
                break;
            }
        }
        if(customer == null) {
            throw new IllegalArgumentException("Customer with given loyalty number not found.");
        }

        //verify candy exists in inventory
        Candy storeCandy = null;
        for (Candy invCandy : inventory) {
            if (invCandy.equals(candy)) {
                storeCandy = invCandy;
                break;
            }
        }
        if(storeCandy == null) {
            throw new IllegalArgumentException("Candy not found in inventory.");
        }

        //calculate cost in loyalty points
        double cost = storeCandy.getPricePerPound() * quantity;

        //checks if customer has enough points
        if(customer.getLoyaltyPoints() < cost) {
            throw new IllegalStateException("Not enough loyalty points.");
        }

        //checks if enough stock is available
        if(storeCandy.getQuantityInStock() < quantity) {
            throw new IllegalStateException("Not enough candy in stock.");
        }

        //if all checks pass, deduct the loyalty points from the customer
        customer.setLoyaltyPoints(customer.getLoyaltyPoints() - cost);

        //deduct the purchased quantity from the candy stock
        storeCandy.removeStock(quantity);
    }
}