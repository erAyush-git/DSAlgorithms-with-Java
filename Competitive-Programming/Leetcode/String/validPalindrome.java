/*A phrase is a palindrome if, after converting all uppercase letters into lowercase
 letters and removing all non-alphanumeric characters, it reads the same forward and backward.
  Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.*/
// leetcode : https://leetcode.com/problems/valid-palindrome/description/

public class validPalindrome {
    public static void main(String[] args){
        String name = "Ayush Tiwari";
        System.out.println(name.replaceAll(" \\s+", " " ));

        boolean ans = ispalindrome(name);
    }
    static boolean ispalindrome(String s){
        if(s == null || s.length()==0 || s==" " || s.length() == 1) return true;
        s= s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        for(int i = 0; i < s.length() /2 ; i++){
            char start = s.charAt(i);
            char end = s.charAt(s.length()-1-i);
            if(start != end){
                return false;
            }
        }
        return true;

    }
}
