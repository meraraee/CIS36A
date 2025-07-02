import java.util.Scanner;

//password: foo

public class one {
    public static void main(String[] args) {

        Scanner scanner01 = new Scanner(System.in);

       boolean correctPassword = true;


       System.out.println("Enter text password:");
       String guess = scanner01.nextLine();


       // correctPassword == guess   <----wrong!
       //must use .equals()

       correctPassword = guess.equals("foo");

       while(!correctPassword){
           System.out.println("Try again.");
           guess = scanner01.nextLine();

           correctPassword = guess.equals("foo");
       }

       System.out.println("YESS YES, thats correct!");
    }

}

