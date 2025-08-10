

public class palindromeNumber {
    public static void main(String[] args) {
        
    }
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }else{
            int cheak = palindrome(x);
            if(cheak == x){
                return true;
            } else return false;

        }
    }
    static int palindrome(int x){
        int reverseInt =0;
        while(x>0){
            int rem = x % 10;
            reverseInt = reverseInt*10 + rem;
            x = x/10;
        }
        return reverseInt;
    }
}
