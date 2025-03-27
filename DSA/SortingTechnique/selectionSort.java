package SortingTechnique;

public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {11,9,10,7,6,5,4};
        System.out.println("after sorting");
        printSort(arr);
        for(int nums : arr){
            System.out.println(nums);
        }

    }
    private static void printSort(int[] arr) {
        for(int i= 0 ; i<arr.length-2 ; i++){
            int min =i;
            for(int j=i ; j<arr.length-1; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i]= temp;
        }
    }
}
