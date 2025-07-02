public class RestaurantDirectory {

    // an array of instances of Restaurant representing the list of restaurants, with no default value
    private Restaurant[] restaurants;
    // represents number of instances of Restaurant representing the list of restaurants, with no default value
    private int size;

    // constructors
    public RestaurantDirectory() {
        restaurants = new Restaurant[100];
        size = 0;
    }

    public RestaurantDirectory(int dc) {
        restaurants = new Restaurant[dc];
        size = 0;
    }

    // instance methods
    public void addRestaurant(Restaurant r) {
        restaurants[size] = r;
        size++;
    }

    public Restaurant[] searchByOwnerName(String fn, String ln) {
        Restaurant[] results = new Restaurant[size];
        int count = 0; // counting how many restaurants match criteria

        // searching through ALL restaurants
        for (int i = 0; i < size; i++) {

            //getting owner of restaurant
            Person owner = restaurants[i].getPerson();

            // checking if restaurant matches the given owner's name
            if (owner.getFirstName().equals(fn) && owner.getLastName().equals(ln)) {
                results[count] = restaurants[i];
                count++;
            }
        }

        // Create a new array to store only the matched results
        Restaurant[] finalResults = new Restaurant[count];
        System.arraycopy(results, 0, finalResults, 0, count);
        return finalResults;
    }

    public Restaurant[] searchByName(String name) {
        Restaurant[] results = new Restaurant[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (restaurants[i].getName().equals(name)) {
                results[count] = restaurants[i];
                count++;
            }
        }

        // Create a new array to store only the matched results
        Restaurant[] finalResults = new Restaurant[count];
        System.arraycopy(results, 0, finalResults, 0, count);
        return finalResults;
    }

    // method to search for restaurants by food type
    public Restaurant[] searchByFoodType(String ft) {
        Restaurant[] results = new Restaurant[size];
        int count = 0;

        // Search through all restaurants
        for (int i = 0; i < size; i++) {
            // Check if the restaurant matches the given food type
            if (restaurants[i].getFoodType().equals(ft)) {
                results[count] = restaurants[i];
                count++;
            }
        }

        // Create a new array to store only the matched results
        Restaurant[] finalResults = new Restaurant[count];
        System.arraycopy(results, 0, finalResults, 0, count);
        return finalResults;
    }

    // Method to calculate the total gross revenue from all restaurants
    public double totalGrossRevenue() {
        double totalRevenue = 0.0;

        // adding yearly gross revenue from all restaurants
        for (int i = 0; i < size; i++) {
            totalRevenue += restaurants[i].getYearlyGrossRevenue();
        }

        return totalRevenue;
    }

    // Method to compute tax revenue based on the given tax rate
    public double computeTaxRevenue(double tr) {
        // returning the total revenue * tax rate
        return totalGrossRevenue() * tr;
    }
}
