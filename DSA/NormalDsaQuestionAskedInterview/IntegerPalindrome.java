package NormalDsaQuestionAskedInterview;

public class IntegerPalindrome {

    public static boolean isPalindrome(Integer number){
        int originalNumber = number;
        int reverseNumber= 0;

        while(number!=0){
            int digit = number%10;
            reverseNumber= reverseNumber*10+digit;
            number=number/10;
        }
        return originalNumber==reverseNumber;
    }

    public static void main(String[] args) {

        int number= 121;
        boolean checkPalindrome = isPalindrome(number);
        if (checkPalindrome){
            System.out.println("it's palindrome");
        }
        else{
            System.out.println("Else not palindrome");
        }

    }
}
