package revisionShit;

import java.util.Scanner;
public class RSpalindremeNoCheak {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num = num1;
        
        int rv = 0;
        while(num != 0){
            int rem = num % 10;
            rv = rv*10 + rem;
            num/=10;
        }
        System.out.printf("reverse integer is %d\n", rv);
        
        if(rv == num1){
            System.out.println("Y");
        }
       
    }
}
