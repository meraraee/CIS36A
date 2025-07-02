public class WordSizeAnalyzer extends TextAnalyzer{

    //constructors
    public WordSizeAnalyzer(){
        this.reportPrefix = "Average word size: ";
    }
    public WordSizeAnalyzer(String t){
        super(t);
        this.reportPrefix = "Average word size: ";
    }

    //instance methods

    public void analyze(){      //this is the abstract method inherited form TextAnalyzer, we must retype it in order to implement code (you cannot do it in superclass)

        //splitting the text into words using whitespace as a delimiter(separator)
        String[] words = getText().trim().split("\\s+");

        int totalCharacters = 0;

        //loops through each word and accumulate the total number of characters
        for (String word : words) {
            totalCharacters += word.length();
        }

        //calculates the average word size (total characters / number of words)
        results = (double) totalCharacters / words.length;
    }
}
