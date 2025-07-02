//import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        //WE WILL BE TALKING ABOUT ARRAYS

        //to initialize
        int[] numbers = {2, 4, 7, 10, 20};

        //to output
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");  //system.out.PRINT will not go to next line
        }
        System.out.println();


        //to initialize te length of an array (all indexes automatically initialized to 0)
        int[] ages = new int[21];

        for(int j = 0; j < ages.length; j++) {
        System.out.print(ages[j] + ", ");
        }
        System.out.println();


        //double arrays
        double[] a = {1.1, 2.2, 3.3};
        System.out.println(a[0] + ", " + a[1] + "," + a[2]);

        a[1] = a[2];

        System.out.println(a[0] + ", " + a[1] + ", " + a[2]);


    }
}
