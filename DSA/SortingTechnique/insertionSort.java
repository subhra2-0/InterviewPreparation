package SortingTechnique;

public class insertionSort {

    public static void insertionSort(int arr[], int n){

        for(int i = 0 ; i<n-1 ; i++){
            int j =i;
            while(j>0 && arr[j-1]>arr[j]){
                //swap
                int temp = arr[j-1];
                arr[j-1]= arr[j];
                arr[j]=temp;
                j--;
            }
        }

    }
    public static void main(String[] args) {

        int arr[]= {1,12,6,3,2,13};

        insertionSort(arr,arr.length);
        for(Integer nums :arr){
            System.out.println(nums);
        }



    }
}
