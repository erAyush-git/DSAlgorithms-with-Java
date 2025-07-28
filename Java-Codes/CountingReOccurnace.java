import java.util.Scanner;

public class CountingReOccurnace{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt(); // input for that bada wala number.
        int target = input.nextInt(); // input for thst target element to search of.

        int count = 0;
        while(num > 0){
            int rev = num%10;
            if(rev == target){
                count++;                // we have to return this as answer.
            }
            num = num/10;
        }
        System.out.println("reoccured " + count +" times.");
        





    }

}
