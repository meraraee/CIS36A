public class LongestWordSizeAnalyzer extends TextAnalyzer{

    //constructors:
    public LongestWordSizeAnalyzer(){
        this.reportPrefix = "Longest word size: ";
    }
    public LongestWordSizeAnalyzer(String t){
        super(t);
        this.reportPrefix = "Longest word size: ";
    }

    //instance methods:
    public void analyze(){

        //again, splitting the text into words using the whitespace as a separator
        String[] words = getText().trim().split("\\s+");

        //creating a variable to hold which element in the array has the most characters (longest word)
        int maxLength = 0;

        //looping through each word in the array to find the one with the most characters
        for(String word : words){
            int wordLength = word.length();
            if(wordLength > maxLength){
                maxLength = wordLength;
            }
        }
        //storing the longest word as a double
        results = (double) maxLength;
    }
}
