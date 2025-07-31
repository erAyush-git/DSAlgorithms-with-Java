public class isLowercase {
    public static void main(String[] args) {
        
    }
    static String islowerCase(String str){
        //StringBuilder builder = new StringBuilder();
        String lowercaseStr = "";
        for(int i = 0; i < str.length() ; i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                lowercaseStr = lowercaseStr + (char) (str.charAt(i)+32);
            }else lowercaseStr += (char) (str.charAt(i)+32);
        }
        return lowercaseStr;
    }
}
