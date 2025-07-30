//A person is eligible to vote if his/her age is greater than or equal to 18. 
//Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;
public class votecheak{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        boolean eligible = cheak(age);
        if(eligible){
            System.out.println("YES");
        }else System.out.println("NO");
        


    }
    static boolean cheak(int age){
        if(age >= 18){
            return true;
        }else return false;

    }
}