
import java.util.Scanner;
public class ReversalofInt {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int torev = input.nextInt();
        int rev = 0;
        while(torev > 0){
            int rem = torev % 10;
            rev = rev*10 + rem;    //is our final ans.
            torev = torev/10;

        }
        input.close();
        System.out.println(rev);


    }
}
