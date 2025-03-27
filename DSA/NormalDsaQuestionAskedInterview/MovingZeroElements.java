package NormalDsaQuestionAskedInterview;

public class MovingZeroElements {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};
        movingZeroElements(arr);
        for(Integer elments : arr){
            System.out.println(elments);
        }

    }


    public static void movingZeroElements(int arr[]){

        int nonZeroIndex = 0;
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            if(arr[i]!=0){
                arr[nonZeroIndex]= arr[i];
                nonZeroIndex++;
            }
        }
        for(int i=nonZeroIndex ; i<n ; i++){
            arr[i]=0;
        }
    }
}
