public class WordCountAnalyzer extends TextAnalyzer{

    //constructors
    public WordCountAnalyzer(){
        this.reportPrefix = "Word count: ";

    }
    public WordCountAnalyzer(String t){
        super(t);     // super(t) must be first so the superclass is initialized before using its fields or methods.
        this.reportPrefix = "Word count: ";
    }

    //instance methods
    public void analyze(){

        //in case text is empty
        if(getText().isEmpty()){
            results = 0.0;
        }

        //storing each word as an array with every whitespace there is (using 'split()' method to divide the text of characters ,
        // wherever there is one or more whitespace "\\s+"
        String[] words = getText().trim().split("\\s+");

        //getting the amount of words and storing as a double
        results = (double) words.length;
    }
}
