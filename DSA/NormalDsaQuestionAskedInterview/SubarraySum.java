package NormalDsaQuestionAskedInterview;

import java.util.*;

public class SubarraySum {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};  // Example array
        int target = 12;
        // Target sum

        int[] result = subArraySum(arr, target);
        if(result[0]!=-1){
            System.out.println(result[0]+""+result[1]);
        }else {
            System.out.println("The sub array is not present");
        }

    }

    public static int[] subArraySum(int[] arr, int target) {
        int start = 0;
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];


            while (sum > target && start <= i) {
                sum = sum - arr[start];  // 1, 2, 3, 7, 5
                start++;
            }

            if (sum == target) {
                return new int[]{start+1,i+1};
            }
            }

        return new int[]{-1,-1};

        }
    }

