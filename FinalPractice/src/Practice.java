public class Practice {

    public int countAllNulls(Integer[] arg){

        int count = 0;
        if(arg.length == 0){
            throw new IllegalArgumentException("The length of this array cannot be zero.");
        }
        else{
            for(int i = 0; i < arg.length;i++){
                if(arg[i] == null){
                    count++;
                }
            }
        }
        return count;
    }
}
