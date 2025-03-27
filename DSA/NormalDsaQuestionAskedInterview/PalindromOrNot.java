package NormalDsaQuestionAskedInterview;

import org.w3c.dom.ls.LSOutput;

public class PalindromOrNot {
    public static void main(String[] args) {
        String str = "levels";
        Character ch ;
        String rstr= "";

        for(int i =0 ; i<str.length();i++){
            ch = str.charAt(i);
            rstr = ch + rstr;
        }
        if(str.equals(rstr)){
            System.out.println("it's palindrome");
        }else{
            System.out.println("it's not palindrome");
        }
        System.out.println(rstr);
    }

}
