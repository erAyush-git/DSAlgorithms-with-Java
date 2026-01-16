public class palindrome {
    public static void main(String[] args) {
        String name  = "jahaj";
        boolean isPalindrome = palindrome(name);
        if(isPalindrome == true){
            System.out.println("Is palindrome");
        }else System.out.println("Not a palindrome");

    }
    static boolean palindrome(String str){
        if(str == null || str.length()==0) {
            return true;
        }    
        str = str.toLowerCase();
        for(int i = 0; i <= str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start != end){
                return false;
            }
            //return true;
        }
        return true;
        
    }
      
}    