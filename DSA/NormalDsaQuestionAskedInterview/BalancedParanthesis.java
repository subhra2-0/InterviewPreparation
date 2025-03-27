package NormalDsaQuestionAskedInterview;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {

        String str = "(()())";
        boolean found = isParanthesisMatching(str);
        System.out.println(found);

    }

    public static boolean isParanthesisMatching(String str){
//        char[] ch = str.toCharArray();
        Stack<Character> st = new Stack<>();
        for(int i =0 ; i< str.length() ; i++){
            char ch = str.charAt(i);
            if(isOpenening(ch)){
                st.push(ch);

            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else if(!isMatching(st.peek(),ch)){
                    return false;
                }else {
                    st.pop();
                }


            }
        }

        return st.isEmpty();



    }

    private static boolean isMatching(char peek, char ch) {
        return (peek == '['  && ch == ']') ||
         (peek == '{'  && ch == '}') ||
        (peek == '('  && ch == ')') ;
    }

    private static boolean isOpenening(char ch) {

        return ch == '[' ||
                ch == '{' ||
                ch == '(';
    }
}
