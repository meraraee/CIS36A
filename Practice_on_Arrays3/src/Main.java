// addSameLength:
// Write a static method that takes two arrays of double, and returns an array of double.
// if the input arrays are not the same length, return null.
// if they are the same length, return an array that is equal to the sum of each element in the same
// index in each input array!
// For example, if the input arrays are [1.0,2.0,3.0] and [10.0,20.0,30.0], the returned array will
// be [11.0,22.0,33.0].

public class Main {
    public static void main(String[] args) {
//        double[] arr1 = {5.7, 33.1, 12.99, 2.3};
//        double[] arr2 = {800.72, 2.05, 9.9965, 322.21};
//
//        double[] arr = new double[]{2.0, 4.0, 6.0, 8.0};
//        System.out.println(arr[2]);
//        System.out.println(arr.length);

        int[] numbas = {3, 4, 2, 1, 8};
        System.out.println(findMax(numbas));

    }

        public static int findMax(int[] numbers) {
            int max = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > max)
                    max = numbers[i];
            }

            return max;
        }

}



