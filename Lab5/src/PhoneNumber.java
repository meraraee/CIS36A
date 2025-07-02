public class PhoneNumber {

    private String areaCode; //first 3-digit
    private String exchange; //next 3-digit
    private String line;     //last 4-digits

    private static String areaCodeDesignatorLeft = "(";
    private static String areaCodeDesignatorRight = ")";
    private static String areaCodeDesignatorPost  = " ";
    private static String exchangeLineSeparator = "-";

    //GETTERS (allows to retrieve the value)

    //private
    public String getAreaCode(){
        return areaCode;
    }

    public String getExchange(){
        return exchange;
    }

    public String getLine(){
        return line;
    }

    //private static
    public static String getAreaCodeDesignatorLeft(){
        return areaCodeDesignatorLeft;
    }

    public static String getAreaCodeDesignatorRight(){
        return areaCodeDesignatorRight;
    }


    public static String getAreaCodeDesignatorPost() {
        return areaCodeDesignatorPost;
    }

    public static String getExchangeLIneSeparator(){
        return exchangeLineSeparator;
    }



    //SETTERS (allows to modify the value)

    //private
    public void setAreaCode(String areaCode){
        this.areaCode = areaCode;
    }

    public void setExchange(String exchange){
        this.exchange = exchange;
    }

    public void setLine(String line){
        this.line = line;
    }

    //static private
    public static void setAreaCodeDesignatorLeft(String areaCodeDesignatorLeft){
        PhoneNumber.areaCodeDesignatorLeft = areaCodeDesignatorLeft;
    }

    public static void setAreaCodeDesignatorRight(String areaCodeDesignatorRight){
        PhoneNumber.areaCodeDesignatorRight = areaCodeDesignatorRight;
    }

    public static void setAreaCodeDesignatorPost(String areaCodeDesignatorPost){
        PhoneNumber.areaCodeDesignatorPost = areaCodeDesignatorPost;
    }

    public static void setExchangeLineSeparator(String exchangeLineSeparator){
        PhoneNumber.exchangeLineSeparator = exchangeLineSeparator;
    }

    //INSTANCE METHOD that returns the values of instance variables & static variables
    public String prettyPrint(){
        return areaCodeDesignatorLeft + areaCode + areaCodeDesignatorRight + areaCodeDesignatorPost + exchange + exchangeLineSeparator + line;
    }

    //1st CONSTRUCTOR that takes 3 Strings
    public PhoneNumber(String areaCode, String exchange, String line) {
        this.areaCode = areaCode;
        this.exchange = exchange;
        this.line = line;
    }
    //2nd CONSTRUCTOR takes 1 String
    public PhoneNumber(String entirePhoneNumberDigit){
            this.areaCode = entirePhoneNumberDigit.substring(0,3);
            this.exchange = entirePhoneNumberDigit.substring(3,6);
            this.line = entirePhoneNumberDigit.substring(6);
    }


}

