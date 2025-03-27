package SortingTechnique;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {23,14,12,11,17,27,31};
        printBubbleSort(arr);
        int n = arr.length;

        for(Integer num : arr){
            System.out.println(num);
        }
    }

    private static void printBubbleSort(int[] arr) {
        for(int i=arr.length-1 ; i>=0; i--){
            for(int j=0 ; j<=i-1 ;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
