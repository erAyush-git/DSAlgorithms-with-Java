
import java.util.Scanner;
public class UpperCaseCheak {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        char CaseCheak = in.next().trim().charAt(0);  // gives only the character at 0th index of the string.

        if(CaseCheak >= 'a' && CaseCheak <= 'z'){
            System.out.println("LowerCase.");
        }else {
            System.out.println("UpperCase.");
        }


    }
        
    
}
