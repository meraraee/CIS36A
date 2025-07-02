public class TextAnalysisSystem {

    //instance variables:
    private TextAnalyzer[] analyzers;   //storing the different analyzers this TextAnalysisSystem is currently using
    private String currentText;      //storing the text to be analyzed by this TextAnalysisSystem

    //Constructors:
    public TextAnalysisSystem(String ct){

        //validating ct first (must throw the exception before setting the instance variable to ensure that the object is not in a confusing/inconsistent state)
        if(ct == null){
            throw new IllegalArgumentException("Current text cannot be null.");
        }
        this.currentText = ct;
    }

    //instance methods:

    //setters & getters

    public void setAnalyzers(TextAnalyzer[] analyzers){
        this.analyzers = analyzers;
    }
    public void setCurrentText(String currentText){
        this.currentText = currentText;
    }
    public TextAnalyzer[] getAnalyzers(){
        return analyzers;
    }
    public String getCurrentText(){
        return currentText;
    }

    //description: This method iterates over all the TextAnalyzer instances in analyzers, and
    //makes each one analyze currentText. It also prints each TextAnalyzer’s reportPrefix,
    //which each TextAnalyzer returns via its report method.
    public void runAnalysis() {

        //looping through analyzer(array of TextAnalyzer objects)
        for(TextAnalyzer analyzer : analyzers){  //analyzer; refers to each element in analyzers

            //give it to the current text to analyze
            analyzer.setText(currentText);

            //run its analyze method
            analyzer.analyze();

            //print result using its report format
            System.out.println(analyzer.report());
        }

    }

}
