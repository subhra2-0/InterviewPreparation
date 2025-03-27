package terminal;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindTheSecondLargest {
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,5,6,7,8};
        int n =arr.length;
        System.out.println(isSorted(arr,n));


    }

    public static boolean isSorted(int arr[],int n){
          // check if the array is sorted or not?

        for(int i =1 ; i< n ; i++){
            if(arr[i-1]>arr[i]){
                return false;
            }

        }
        return true;
    }


}
