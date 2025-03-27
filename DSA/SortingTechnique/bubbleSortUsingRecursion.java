package SortingTechnique;

public class bubbleSortUsingRecursion {
    public static void main(String[] args) {
        int arr[] = {14,3,12,11,7,8};
        int n =arr.length;
        bubbleSort(arr,n);
        for(int i =0 ; i<n ; i++){
            System.out.println(arr[i]);
        }

    }

    public static void bubbleSort(int arr[], int n){
        if(n==1){
            return;
        }
        for(int j =0 ; j<=n-2 ; j++){
            if(arr[j]>arr[j+1]){
                //swap
                int temp = arr[j+1];
                arr[j+1]= arr[j];
                arr[j] = temp;
            }
        }
        bubbleSort(arr,n-1);
    }



}
