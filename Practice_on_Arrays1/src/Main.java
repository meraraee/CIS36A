import java.util.Scanner;


//FindMax:
// Write a static method that takes one argument, an array of double, and returns a double.
// The double returned should be the largest double in the input array.

public class Main {
    public static void main(String[] args){

        //FIND MAX:
        // Write a static method that takes one argument, an array of double, and returns a double.
        // The double returned should be the largest double in the input array.

        //double array
        double[] arr = {5.4, 3.9, 22.54, 10.1};

        // Call the findMax method and print the result
        double max = PracticeArrays1.findMax(arr);
        System.out.println(max);

        System.out.println("______________");

        double x = 5;
        x += 3;

        System.out.println(x);
    }
}
