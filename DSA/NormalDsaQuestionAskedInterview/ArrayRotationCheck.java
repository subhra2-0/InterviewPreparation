package NormalDsaQuestionAskedInterview;

import java.util.Arrays;

public class ArrayRotationCheck {

    // Function to check if two arrays are rotations of each other
    public static boolean areRotations(int[] arr1, int[] arr2) {
        // Step 1: Check if lengths are the same
        if (arr1.length != arr2.length) {
            return false;
        }

        // Step 2: Create a concatenated version of arr1
        // Concatenate arr1 with itself
        int[] concatenatedArr = new int[arr1.length * 2];
        System.arraycopy(arr1, 0, concatenatedArr, 0, arr1.length);
        System.arraycopy(arr1, 0, concatenatedArr, arr1.length, arr1.length);

        // Step 3: Check if arr2 is a subarray of concatenatedArr
        return isSubArray(concatenatedArr, arr2);
    }

    // Helper function to check if arr2 is a subarray of concatenatedArr
    private static boolean isSubArray(int[] concatenatedArr, int[] arr2) {
        // Loop through the concatenatedArr and try to match arr2
        for (int i = 0; i <= concatenatedArr.length - arr2.length; i++) {
            boolean found = true;
            for (int j = 0; j < arr2.length; j++) {
                if (concatenatedArr[i + j] != arr2[j]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 1, 2};

        // Check if arr2 is a rotation of arr1
        if (areRotations(arr1, arr2)) {
            System.out.println("arr2 is a rotation of arr1");
        } else {
            System.out.println("arr2 is NOT a rotation of arr1");
        }
    }
}
