//STRETCH GOAL PT. 1
public class LongestPalindromeWordAnalyzer extends TextAnalyzer{

    //constructor
    public LongestPalindromeWordAnalyzer(){
        this.reportPrefix = "Longest Palindrome word length: ";
    }
    public LongestPalindromeWordAnalyzer(String t){
        super(t);
        this.reportPrefix = "Longest Palindrome word length: ";
    }

    //instance method:

    public void analyze(){

        String[] words = getText().trim().split("\\s+");    //splitting the sentence/text into words and store them in an array called words

        int maxLength = 0;

        for(String word : words){ //for each word in the 'words' array..

            boolean isPalindrome = true;
            int left = 0;  //starts at the beginning of word
            int right = word.length() - 1; // starts at the end of word

            while(left < right){
                if (word.charAt(left) != word.charAt(right)) {
                    isPalindrome = false;
                    break; //just exiting out of the while loop "early" if not palindrome for A SPECIFIC word
                }
                left++;
                right--;
            }
            //If the current word is a palindrome & it’s longer than the longest palindrome we’ve found so far — update the maxLength
            if (isPalindrome && word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        //lastly converts and stores into a double
        results = (double) maxLength;
    }
}
