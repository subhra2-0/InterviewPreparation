package NormalDsaQuestionAskedInterview;

public class FindTheMaxAndMin {
    public static void main(String[] args) {
        int arr[]={1,14,7,68,4,16};

        int max=arr[0];
        int min =arr[0];

        for(int i =0 ; i< arr.length; i++){
            if(arr[i]> max){
                max=arr[i];
            }

            else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
