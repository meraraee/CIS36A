public class Rule {     //BASE CLASS

    private String text = "empty rule";
    private boolean optional;

    //constructors:
    public Rule(){

    }
    public Rule(String t){
        this.text = t;
    }
    public Rule(String t, boolean o){
        this.text = t;
        this.optional = o;
    }

    //instance methods:

    //getters & setters

    //use "is" for boolean properties instead of "get"
    public boolean isOptional() {
        return optional;
    }

    public void setOptional(boolean optional) {
        this.optional = optional;
    }
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }

    //his method returns the value of the instance variable 'text'
    public String toString(){
        return this.text;
    }
}
