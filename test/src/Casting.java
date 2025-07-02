//CASTING: convert a data type into another
// double <--> int

/* there are 2 WAYS:
- IMPLICIT (AUTOMATIC)
- EXPLICIT (MANUAL)
 */

public class Casting {
    public static void main(String[] args){

        //INT TO DOUBLE (implicit)
        int number = 5;
        double decimal = number;

        double result = number/2;

        //DOUBLE TO INT (explicit)
        double price = 20.25;
        int num = (int)price;

        //outputting
        System.out.println(result);
        System.out.println(num);


    }
}
