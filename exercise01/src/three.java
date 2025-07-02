import java.util.Scanner;

//password range: 50-60

public class three {
    public static void main(String[] args){
        Scanner scanner03 = new Scanner(System.in);

        System.out.println("Enter range password:");
        int guess = scanner03.nextInt();

        boolean isPassword = false;

        while(!isPassword){
            //you need to explicitly repeat the variable in both sides of the comparison.
            // if(guess >= 50 && <=60){     <---- wrong

            if(guess >= 50 && guess <= 60){
                System.out.println("Correct!");
                isPassword = true;
            }
            else{
                System.out.println("Enter range password:");
                guess = scanner03.nextInt();
            }
        }

    }
}
