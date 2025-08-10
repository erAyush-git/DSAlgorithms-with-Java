/*Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0. */

//leetcode : 7

public class reverseInteger {
    public static void main(String[] args) {
        
    }
    static int reverse(int num){
        long reverseInt = 0;
        while( num != 0){
            int rem = num %10;
            reverseInt = reverseInt*10 + rem;
            num = num/10;
        }
        if(reverseInt <= Integer.MAX_VALUE && reverseInt >= Integer.MIN_VALUE) return (int)reverseInt;
        else return 0;
    }
}
