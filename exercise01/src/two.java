import java.util.Scanner;

//password: 123

public class two {
    public static void main(String[] args){
        Scanner scanner02 = new Scanner(System.in);

        int correctPassword = 123;
        int guess;

        boolean isPassword = false;

        while(!isPassword){
            System.out.println("Enter digit password:");
            guess = scanner02.nextInt();

            if(guess == correctPassword){
                System.out.println("Correct!");
                isPassword = true;
            }
        }

    }
}
