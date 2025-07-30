//Write a program to print the sum of two numbers entered by user by defining your own method.
//Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;
public class AddProduct{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("Sum :"+add(num1,num2));
        System.out.println("Product :"+product(num1,num2));
    }

    static int add(int num1, int num2){
        int num = num1 + num2;
        return num;
    }
    static int product(int num1, int num2){
        int multi = num1*num2;
        return multi;
    }
}