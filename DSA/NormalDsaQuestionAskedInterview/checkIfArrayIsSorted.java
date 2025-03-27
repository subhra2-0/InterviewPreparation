package NormalDsaQuestionAskedInterview;

import java.util.Arrays;

public class checkIfArrayIsSorted {
    public static void main(String[] args) {
        int arr[] = {2,1,2,3,4,5,6,7,8};
//      recursiveBubbleSort(arr,arr.length);
        sortedArray(arr);
        System.out.println(Arrays.toString(arr));

    }



    public static void sortedArray(int arr[]){
        int left =0 ;
        int right = arr.length-1;
        boolean found = true;

        while (left<right){
            if(arr[left]>arr[left+1]){
                found =false;
                break;
            }
            left++;
        }
        if(found){
            System.out.println("Array is sorted");
        }else{
            System.out.println("it's not sorted");
        }

    }
}
