//importing Scanner class (in order to use Scanner)
import java.util.Scanner;

public class practice {
    public static void main(String[] args){
        //creating Scanner object
        Scanner scanner101 = new Scanner(System.in);

        //printing to ask you name
        System.out.println("Type in your name:");

        //reading input
        //.nextLine():  reads ENTIRE line of a stirng
        String name = scanner101.nextLine();

        //printing what user inputted
        System.out.println("hello " + name + "!" );


        System.out.println("now enter a number and I will multiply it by 2!");

        //since we are now dealing with numbers we are storing in int & must use datatype nextInt()
        int result = scanner101.nextInt();

        //outputting results using concatenation "+"
        System.out.println(result + " times 2 is " + result * 2);

    }
}
