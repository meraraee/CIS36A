import java.util.Scanner;

public class rollerCoasterChecker2 {
    public static void main(String[] args){

        Scanner scanner101 = new Scanner(System.in);

        System.out.println("Enter your height in cm:");
        double height = scanner101.nextDouble();

        System.out.println("Enter your age in years:");
        int age = scanner101.nextInt();

        boolean canRide = (age > 6) &&  (height >= 100);

        if(canRide){
            System.out.println("Welcome Aboard!");
        }
        else{
            System.out.println("ur too short lol. have a nice day though!");
        }

    }
}
