/*Write a program to print the factorial of a number by defining a method named 'Factorial'. 
Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
4! = 1 * 2 * 3 * 4 = 24 
3! = 3 * 2 * 1 = 6 
2! = 2 * 1 = 2 
Also, 
1! = 1 
0! = 1 */
import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Factorial answer is :"+factorilCal(num));
    }
    
    static int factorilCal(int num){
        int facto = 1;
        if(num < 0){
            System.out.println("Enter a positve (+)Integer.");
            return -1;
        }else if(num == 0 || num == 1){
            return 1;
        }else if(num>1){
            for(int i =1; i<= num; i++){
                facto = facto * i;   // IS OUR FINAL ANSWER.
            }
        }else System.out.print("Kuch to galat kr rhe guru.");
        return facto;
    }

}