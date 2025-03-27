package NormalDsaQuestionAskedInterview;

public class ReverseAnArrayInPlace {
    public static void main(String[] args) {

        String str = "SubhrajitBarik";
        String str2 = str.toLowerCase();
        int n = str.length();
        String reverse="";
        char[] str1 = str.toCharArray();
        for(int i=0 ; i< n ; i++ ){
            reverse = str2.charAt(i) + reverse;

        }
        System.out.println(reverse);

    }
}
