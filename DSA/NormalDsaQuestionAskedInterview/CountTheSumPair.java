package NormalDsaQuestionAskedInterview;

import java.util.HashMap;

public class CountTheSumPair {

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int targetSum = 6;
        int count = 0;

        HashMap<Integer,Integer>  map = new HashMap<>();
        for(Integer number : arr){
            int complement = targetSum - number;
            if(map.containsKey(complement)){
              count = count + map.get(complement);
            }
            else{
                map.put(number,map.getOrDefault(number,0)+1);
            }



        }
        System.out.println(count);
    }



}
