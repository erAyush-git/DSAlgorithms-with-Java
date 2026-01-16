package revisionShit;

import java.util.Scanner ;
public class RSfiboNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numeric number for fibo :");
        
        int n = input.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
            
        }
        System.out.print(b);
    }
}
