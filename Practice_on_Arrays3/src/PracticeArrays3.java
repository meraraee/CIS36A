public class PracticeArrays3 {

    // Write a static method that takes two arrays of double, and returns an array of double.
    public static double[] addSameLength(double[] arr01, double[] arr02) {

        // if the input arrays are not the same length, return null.
        if (arr01.length != arr02.length) {
            return null;
        }

        // if they are the same length, return an array that is equal to the sum of each element in the same
        // index in each input array!
        else {

            //creating an array that will hold both arrays being added
            double[] addedArray;
            addedArray = new double[arr01.length]; //declaring same length

            int i = 0;
            while (i < arr01.length) {
                addedArray[i] = arr01[i] + arr02[i];
                i++;
            }
            return addedArray;
        }

    }

}

