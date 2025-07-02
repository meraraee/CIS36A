public class testing {

        public static void main(String[] args){

            int n = 27;

            if(n < 0) {
                System.out.println("Small");
            }
            else if(n > 0 && n < 100){
                System.out.println("Medium");
            }
            else if(n >= 100){
                System.out.println("Big");
            }
        }
    }
