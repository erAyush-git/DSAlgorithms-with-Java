//Write a function to find if a number is a palindrome or not. 
//Take number as parameter.

import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean ans = CheakPalindrome(number);
        if(ans == true){
            System.out.println("Given number is Palindrome.");
        }else System.out.println("NOT a palindrome.");
    }
    static boolean CheakPalindrome(int num){
        int rev = ReversalofInt(num);
        if(rev == num){
            return true;
        }else return false;

    }
    static int ReversalofInt(int number){
        
        int reverse = 0;
        while(number>0){
            int rem = number % 10;
            reverse = reverse*10 + rem;
            number = number/10;
        }
        return reverse;

    }

}
