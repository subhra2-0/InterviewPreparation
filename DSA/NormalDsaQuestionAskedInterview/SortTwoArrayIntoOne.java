package NormalDsaQuestionAskedInterview;




public class SortTwoArrayIntoOne {
    public static void main(String[] args) {
        int[] array1 = {5, 2, 9, 3};
        int[] array2 = {8, 1, 4, 7};


        int concate[] = new int[array1.length + array2.length];
        System.arraycopy(array1, 0 ,concate, 0, array1.length);
        System.arraycopy(array2,0, concate, array1.length, array2.length);

        bubbleSort(concate);

        for(Integer allElements : concate){
            System.out.println(allElements);
        }

    }

    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i = n-1 ; i>=0 ; i--){
            boolean found = true;
            for(int j=0 ; j<i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!found){
                break;
            }
        }

    }
}
