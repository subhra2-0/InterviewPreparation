package NormalDsaQuestionAskedInterview;

public class rotateArrayToRightK {
    public static void main(String[] args) {

        int arr[]={2,3,45,1,23,9};
        int k= 2;
        rotateAnArray(arr,k);
        for(Integer elements : arr){
            System.out.println(elements);
        }
    }

    //12345    54321  45321 45123
    //51234
    //42123

    public static void reverseArray(int arr[], int left, int end){
        while(left<end){
            int temp = arr[left];
            arr[left] = arr[end];
            arr[end]= temp;

            left++;
            end--;
        }
    }

    public static void rotateAnArray(int arr[], int k){

        int n= arr.length;
        // if rotation is greater than the length of the array.

        //{1,2,3,4,5}
        k=k%n;

        //rotating the elements
        reverseArray(arr,0,n-1);

//        54321

        // rotating the k elements
        reverseArray(arr,0,k-1);

//        45321

//        45123
        //rotating the elements after k elements
        reverseArray(arr,k,n-1);

    }
}
