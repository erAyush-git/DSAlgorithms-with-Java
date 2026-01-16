package revisionShit;

import java.util.Scanner;
public class RSlargestofThree {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 3 number :");
        
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int max = num1;
        if(num1 > num2 && num1 > num3){
            max = num1;
            System.out.printf("%d is greatest." , max);
        }else if(num2 > num1 && num2 > num3  ){
            max = num2 ;
            System.out.printf("%d is max." , max);
        }else System.out.printf("%d is max" , num3);
    }
}
