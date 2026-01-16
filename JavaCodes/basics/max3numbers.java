
import java.util.Scanner;
public class max3numbers {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int num1, num2, num3, max;
        
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        max = num1;
        if( num2 >max){
            max = num2;
        }else if(num3 > max){
            max = num3;
        }

        System.out.println(max);

    }
}
