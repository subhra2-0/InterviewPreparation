package NormalDsaQuestionAskedInterview;

public class FindTheSecondLargest {
    public static void main(String[] args) {
        //find the secondMinimum number:
        int arr[]={23,12,7,24,18,90};

        int min=Integer.MAX_VALUE;
        int secondMinimum=Integer.MAX_VALUE;

        for(int i=0 ; i< arr.length; i++){
            if(arr[i] < min){
                secondMinimum=min;
                min=arr[i];
            }
            if(arr[i] < secondMinimum && arr[i]!=min){
                secondMinimum=arr[i];
                }
        }
        System.out.println(secondMinimum);
        }

    }

