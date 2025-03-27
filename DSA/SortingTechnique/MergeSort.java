package SortingTechnique;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSort {
    public static void mergeSort(int arr[], int low, int high){
        if(low>=high)//basecase
            return;

           int mid = (low+high)/2;
           mergeSort(arr,low,mid); // for left half sorting
           mergeSort(arr,mid+1,high); // for right half sorting
           merge(arr,low,mid,high); // at last merge them.


    }

    private static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();

            int left  = low;
            int right   = mid +1;

            while (left<=mid && right<=high){
                if(arr[left]<=arr[right]){
                    temp.add(arr[left]);
                    left++;
                }else{
                    temp.add(arr[right]);
                    right++;
                }
            }
            while(left<=mid){
                temp.add(arr[left]);
                left++;
            }
            while(right<=high){
                temp.add(arr[right]);
                right++;
            }
        for(int i =low ; i<=high; i++){
            arr[i] = temp.get(i-low);
        }

        }




    public static void main(String[] args) {
        int arr[] = {4,2,1,6,7};
        mergeSort(arr,0,arr.length-1);
        for(int i = 0 ;i<= arr.length-1; i++){
            System.out.println(arr[i]);
        }

    }
}
