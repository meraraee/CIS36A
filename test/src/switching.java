import java.util.Scanner;

public class switching {
    public static void main(String[] args){

        Scanner inputting = new Scanner(System.in);

        System.out.println("Enter a number of ice cream flavors: ");
        int iceCreamFlavors = inputting.nextInt();

    switch(iceCreamFlavors)
    {
        case 20:
            System.out.println("Great selection!");
            break;
        case 1:
            System.out.println("I bet it's vanilla");
            break;
        case 2:
        case 3:
        case 4:
            System.out.println(iceCreamFlavors + "Ice Cream Flavors are acceptable.");
            break;
        default:
            System.out.println("I did not plan for ");
            System.out.println(iceCreamFlavors + " flavors!");
            break;
    }

    }
}
