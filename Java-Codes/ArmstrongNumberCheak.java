
import java.util.Scanner;
public class ArmstrongNumberCheak {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean ans = arms(n);
       
        if(ans == true){
            System.out.println( n +" Is a armstrong number.");
        }else{
            System.out.println("is NOT an armstrong number.");
        }


        // for all ArmStrong number from 1 to 1000;
        for(int i =0; i <=180000 ; i++){
            if(arms(i)){
                System.out.print(i +" ");
            }
        }
    }
    static boolean arms(int num){
        int original = num;
        int cubesum =  0;  /// actually going to cheak for the number.
        while(num>0){
            int rem = num % 10;
            cubesum += Math.pow(rem,3);   // Math.pow(base,expo)
            num = num/10;

        }
        return original == cubesum;
    }
}

