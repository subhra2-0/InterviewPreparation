package NormalDsaQuestionAskedInterview;

import java.util.HashMap;

public class FindTheContinousSubArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 7, 5};

        int sum = 12;
        continousSubArray(arr,sum);


    }


    public static void continousSubArray(int arr[],int sum){
        int start =0;
        int end =-1;
        int n = arr.length;
        int currSum =0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<n ;i++){
           currSum= currSum+arr[i];
           if(currSum==sum){
                start = 0;
                end =i;
                break;
            }

            if(map.containsKey(currSum-sum)){
                start = map.get(currSum-sum)+1;
                end =i+1;
                break;
            }
            else {
                map.put(currSum,i);
            }

        }

        if(end==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println(start+1 + " "+end);
        }



    }
}
