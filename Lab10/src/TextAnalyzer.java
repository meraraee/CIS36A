public abstract class TextAnalyzer {

    //instance variables
    private String text;
    protected double results = -1.0;
    protected String reportPrefix;

    //constructors:
    public TextAnalyzer(){
    }
    public TextAnalyzer(String t){
        if(t == null){
            throw new IllegalArgumentException("The text cannot be null.");
        }
        this.text = t;
    }

    //instance methods:

    //getters
    public String getText(){
       return text;
    }
    public double getResults(){
        return results;
    }

    //setter
    public void setText(String text){
        if(text == null){
            throw new IllegalArgumentException("The text cannot be null.");
        }
        this.text = text;
    }


    //This abstract method will be implemented by non-abstract subclasses to perform their specific analysis tasks
    public abstract void analyze();


    public String report(){

        //BE CAREFUL - not this!
        //return reportPrefix + ": " + results;
        // this causes a duplicate ": : "
        //formatting matters!

        return reportPrefix + results;
    }

}
