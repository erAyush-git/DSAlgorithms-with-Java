import java.util.Scanner;

public class javaSwitch{
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int dayint = in.nextInt();
        switch(dayint){
            //case 1,2,3,4,5 : System.out.println("Monady"); 
            // arrow statement and this multii costrain case supoortin java 14 version.
                 
            case 1: System.out.println("Tuesday");
                     break;
            case 2: System.out.println("Tuesday");
                     break;
            default : System.out.println("Enter a vaild day.");
        }
        
    }
}