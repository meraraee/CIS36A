import java.util.Scanner;

public class rollerCoasterChecker {
    public static void main(String[] args){
        Scanner scanner101 = new Scanner(System.in);


        System.out.println("Enter your age: ");
        int age = scanner101.nextInt();

        if(age <= 6){
            System.out.println("You are too young! you can't ride.");
        }

        System.out.println("Enter your height in cm:");
        double height = scanner101.nextDouble();

        if(height >= 100){
            System.out.println("Welcome Aboard!");
        }
        else
            System.out.println("You're too short lol. you cannot ride this roller coaster");

    }
}

