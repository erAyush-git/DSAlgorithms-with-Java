/*A phrase is a palindrome if, after converting all uppercase letters into lowercase
 letters and removing all non-alphanumeric characters, it reads the same forward and backward.
  Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.*/
// leetcode : https://leetcode.com/problems/valid-palindrome/description/

public class validPalindrome {
    public static void main(String[] args){
        String name = "0P";
        String modifiedName = name.replaceAll("\\s+", "" );
        System.out.println(modifiedName);

        boolean ans = isPalindrome(name);
        if(ans){
            System.out.println("palindrome");
        }else System.out.println("not a palindrome");
    }
    static boolean isPalindrome(String s) {
        
        //if()
        s= s.toLowerCase();
        s = s.replaceAll("\\s+", "");
        String str = "";
        for(int j = 0; j < s.length();j++){
            char ch = s.charAt(j);
            if(Character.isLetterOrDigit(ch)){
                str = str + ch;
            }
        }
        //StringBuilder builder = new StringBuilder();

        if(str == null || str.length()==0 || str==" " || str.length() == 1) return true;
        for(int i = 0; i <= str.length() /2 ; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start != end){
                return false;
            }
        }
        return true;

    }
}
