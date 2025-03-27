package NormalDsaQuestionAskedInterview;

public class MountainArray {
    public static void main(String[] args) {

        int[] arr1 = {4, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 9, 8, 7, 6, 5};

        System.out.println(mountainArray(arr2));
//        1, 2, 3, 4, 9, 8, 7, 6, 5
    }

    public static boolean mountainArray(int[] arr) {
        int n = arr.length;

        if (n < 3) {
            return false;
        }

        int i = 0;

        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == 0 || i == n - 1) {

            return false;
        }

        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
    }
}
