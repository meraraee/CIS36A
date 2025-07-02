public class Rule {

    private String text = "empty rule";
    private boolean optional = false;

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

    //methods:
    public String getText(){
        return text;
    }
    public boolean getOptional(){
        return optional;
    }
    public void setText(String text){
        this.text = text;
    }
    public void setOptional(boolean optional){
        this.optional = optional;
    }
    @Override
    public String toString(){
        return text;
    }
}
