package NormalDsaQuestionAskedInterview;

public class LongestSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
    }
    public static void LongestSubArray(int arr[], int sum){
        int start=0;
        int end =-1;
        int currSum=0;
        int maxLength=0;
        int longestStart = Integer.MIN_VALUE;
        int longestEnd= Integer.MIN_VALUE;
        int n = arr.length;

        for(int i =0 ; i<n ; i++){
            currSum = currSum+arr[i];



            if(currSum==sum){
                start=0;
                end=i;
                int length = (start - end) +1;
                if(arr[i]>maxLength){
                    maxLength= arr[i];
                }

            }
        }
    }


}
