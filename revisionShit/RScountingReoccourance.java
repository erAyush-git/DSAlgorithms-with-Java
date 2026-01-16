package revisionShit;

import java.util.Scanner;
public class RScountingReoccourance {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        int counter = 0;

        System.out.print("Enter the integer to cheak :");
        int cheakInt = input.nextInt();

        System.out.print("Enter the Integer :");
        int num = input.nextInt();

        while(num != 0){
            int rem = num % 10;
            if(rem == cheakInt) counter++;
            num = num/10;

        }
        System.out.print(counter);
    }
}
