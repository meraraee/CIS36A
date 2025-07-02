public class midtermReview {
        public static void main(String[] args){
            for(int i = 0; i < 20;i = i + 2){
                if(i%3 == 1)
                    System.out.print(i + " ");
            }

            System.out.println();
            System.out.println("_____________________________________");

            boolean[] oldVals = {true, false, true , true};
            boolean[] newVals = new boolean[4];

            for(int j = oldVals.length - 1; j >= 0; j--){
                newVals[j] = !(oldVals[j]);

            }

            for(int w = 0; w < newVals.length; w++){
                System.out.print(newVals[w]+ " ");
            }
        }
}
