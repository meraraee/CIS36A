import java.util.Scanner;

public class StringScanningExamples {

    public static void main(String[] args) {

        String textToScan = "Hello, world! It is a lovely day to program.";
        Scanner s = new Scanner(textToScan);
        System.out.println("Let's print all tokens returned by our scanner, one by one:");
        while (s.hasNext()) {
            System.out.println("\t" + s.next());
        }
        System.out.println("Now, let's print a new String, which is just made up of the length of each token in our text, in order:");
        s = new Scanner(textToScan); // We have to do this, because a Scanner cannot go backwards! When it's out of text in a String, that's it.
        String tokenLengths = "";
        while (s.hasNext()) {
            tokenLengths = tokenLengths + s.next().length() + " ";
        }
        System.out.println("\t" + tokenLengths);

        System.out.println("Now, let's see how the 'whitespace' characters '\\t' (tab) and ' ' (space) and '\\n' (newline) act to separate tokens:");
        s = new Scanner("     How\t\t does   this\n scan?\n\n\n\n\n");
        while (s.hasNext()) {
            System.out.println("\t" + s.next());
        }
    }
}
