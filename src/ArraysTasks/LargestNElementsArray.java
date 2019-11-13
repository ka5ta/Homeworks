package ArraysTasks;

import java.util.Arrays;

public class LargestNElementsArray {

    /**
     * Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.
     *
     * @param numbers is integer array
     * @param k       is number of largest elements to return
     */

    public static int[] findLargestNumber(int[] numbers, int k) {

        // Get the slice of the array
        int[] slice = Arrays.copyOfRange(numbers, 0, k);
        /*int[] kLargestNumbers = new int[k];
         for (int i = 0; i<kLargestNumbers.length; i++){
            kLargestNumbers[i] = numbers[i];
          }*/


        for (int j = k; j < numbers.length; j++) {
            int firstReplace = numbers[j];
            for (int i = 0; i < slice.length; i++) {
                int secondReplace = slice[i];
                if (firstReplace > secondReplace) {
                    slice[i] = firstReplace;
                    firstReplace = secondReplace;
                }
            }

        }
        return slice;
    }

    public static void main(String[] args) {
        int[] test = {1, 4, 17, 7, 25, 3, 100};
        String testResult = Arrays.toString(findLargestNumber(test,3));
        System.out.println(testResult);


    }

}



