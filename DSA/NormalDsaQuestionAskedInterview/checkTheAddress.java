package NormalDsaQuestionAskedInterview;

public class checkTheAddress {
    public static void main(String[] args) {

        //Find the pincode from this String
        String address = "15-1-503/2/5, Old Feelkhana, Hyderabad, Andhra Pradesh, 04066758224, 50012, India";
        String[] str = address.split(",");
        for(String str1: str){
            if(str1.length()==6 && checkValidPin(str1)){

                System.out.println("it's a valid pincode"+str1);
            }
        }
    }
    public static boolean checkValidPin(String str){
        for(Character ch : str.toCharArray()){
            if(!Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }
}
