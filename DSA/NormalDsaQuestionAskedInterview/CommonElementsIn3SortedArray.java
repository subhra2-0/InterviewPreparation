package NormalDsaQuestionAskedInterview;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsIn3SortedArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {3,4,5,6};
        int arr3[] = {5,4,6,7};
        List<Integer> allCommon = commonElements(arr1, arr2, arr3);
        System.out.println(allCommon);

    }


    public static List<Integer> commonElements(int arr[], int arr1[], int arr2[]) {


        List<Integer> commonElements = new ArrayList<>();
        for (Integer element : arr) {
            if (binarySearch(arr1, element) && binarySearch(arr2, element)) {
                commonElements.add(element);
            }
        }
        return commonElements;
    }

    public static boolean binarySearch(int arr[], int target) {

        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return false;
    }
}
