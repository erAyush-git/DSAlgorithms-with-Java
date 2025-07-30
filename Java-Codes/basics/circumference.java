//Write a program to print the circumference and area of a circle 
//of radius entered by user by defining your own method.

import java.util.Scanner;
public class circumference{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double ans = circum(radius);
        System.out.println(ans);
    
    }
    static double circum(double radius){
        return 6.28*radius;
    }
}