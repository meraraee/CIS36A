import java.util.ArrayList;  //in order to use ArrayList
import java.util.HashSet;    //in order to use HashSet

public class ProductInventory{         //this class holds collection of instances of Product class

    private ArrayList <Product> products;
    private int max_size;

    public ProductInventory(){
        max_size = 100;
        products = new ArrayList<>();       //adding products into a new ArrayList
    }
    public ProductInventory(int ms){
        max_size = ms;
        products = new ArrayList<>();       //adding products into a new ArrayList
    }

    public int getMaxSize(){      //follow name convention, this is highly recommended (instead of getMax_size)
        return max_size;
    }
   public boolean addProduct(Product p){

//     if(max_size > products){          <--- doesn't work because you can't compare an int with ArrayList. Instead, you want to compare the SIZE of the ArrayList with the int as the size will give you an int value
//         products += p;                <--- doesn’t work for objects like ArrayList — it's only valid for primitives or strings in Java.
//         return true;
//        }
       if(max_size > products.size()){
           products.add(p);
           return true;
       }
       else
            return false;
   }
   public double calculateTotalValue(){         //This method calculates the total value of all instances of Product in products. That is, it should add each Product’s instance variable value to a sum, and return that sum
        double sum = 0.0;
        for(Product p: products){
            sum += p.getValue();              // <-- using getValue() method to access the (private) value
        }
       return sum;
   }

   //extra credit
    public boolean duplicateIDReport(){     // <-- checks if there are any duplicate id's

        HashSet<String> alreadySeenId = new HashSet<>();   //HashSet is just storing id (that convert to String)

        for(Product p: products){
            String id = p.getId();                  //Call the method getId() to get the product’s id as a String
            if(alreadySeenId.contains(id)){
                return true;
            }
            else{
                alreadySeenId.add(id);        //if it's the "first time" seeing id, then store into HashSet
            }
        }
            return false;
    }

}
