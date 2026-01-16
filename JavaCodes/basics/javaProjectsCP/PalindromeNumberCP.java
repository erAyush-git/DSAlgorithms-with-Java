public class PalindromeNumberCP{
    public static void main(String[] args){
        int x = 289496869;
        int ans = palindrome(x);
        System.out.println(ans);


    }
    static int palindrome(int x){
        int rev =0;
        while (x > 0){

              int rem = x%10;
              rev = rev*10 + rem;
              x = x/10;
        }
        return rev > Integer.MAX_VALUE ? 0 : rev;
        
    }
}