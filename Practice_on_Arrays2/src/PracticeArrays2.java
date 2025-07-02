public class PracticeArrays2 {

    // Write a STATIC METHOD that takes one input, an array of double, and RETURNS an ARRAY OF DOUBLES
    // NOTICE 'DOUBLE[]' in method declaration

    public static double[] copyArray(double[] arr){

        //creating a new array with the same length
        double[] copy = new double[arr.length];

        for(int i = 0; i < arr.length; i++){
            copy[i] = arr[i];
        }

        return copy;    //returns the
    }
}
