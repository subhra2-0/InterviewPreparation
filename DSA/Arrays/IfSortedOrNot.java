package Arrays;

public class IfSortedOrNot {
    public static boolean isSorted(int arr[],int n){
        // check if the array is sorted or not?

        for(int i =1 ; i< n ; i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
}
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,3,5,6,7,8};
        int n =arr.length;
        System.out.println(isSorted(arr,n));
}
}
//

//    int balance = 0; // This keeps track of the balance between '(' and ')'
//
//        for (char ch : s.toCharArray()) {  //(()())(())
//                if (ch == '(') {  //primitive decomposition (()())" + "(())"
//                if (balance > 0) { /1
//                result.append(ch); // Only append if it's not the first '(' of a primitive substring
//                }
//                balance++; // Increment balance for each '('
//                } else {
//                balance--; // Decrement balance for each ')'
//                if (balance > 0) {
//                result.append(ch); // Only append if it's not the last ')' of a primitive substring
//                }
//                }
//                }
//
//                return result.toString(); // Return the final string without outer parentheses
//                }