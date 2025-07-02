public class PracticeArrays1 {

    static double findMax(double[] arr){

        //declaring a variable that holds the first element of our array
        double max = arr[0];

        //using for loop to iterate through array, starting with the second element(int i = 1)
        for (int i = 1; i < arr.length; i++) {

            //using an if statement, compare the current element with the value of max. I
            //if the current element is greater than max, update max with the value of the current element.
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
        }
    }

