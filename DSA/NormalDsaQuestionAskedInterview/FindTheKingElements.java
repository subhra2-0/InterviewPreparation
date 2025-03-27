package NormalDsaQuestionAskedInterview;

import java.util.ArrayList;
import java.util.List;

public class FindTheKingElements {
    public static void main(String[] args) {

        // find the king element
        // int arr [] = {14,15,4,6,8,2};

        int arr[] = {14,15,4,6,8,2};

        List<Integer> kingNumbers = new ArrayList<>();
        int n = arr.length;

        if(n==0){
            System.out.println("No King elements to be found...");
        }

        int rightKing = arr[n-1];
        kingNumbers.add(rightKing);

        for(int i =n-2 ; i>=0 ; i--){
            if(arr[i] > rightKing){
                kingNumbers.add(arr[i]);
                rightKing= arr[i];
            }
        }

        System.out.println(kingNumbers);
    }
}
