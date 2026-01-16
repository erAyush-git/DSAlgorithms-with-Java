package revisionShit;

import java.util.Scanner;
public class RSAlphaCheak {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string :");
        char ch = input.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z') System.out.println("The alphabet is lowercase.");
        else if(ch >= 'A' && ch <= 'Z') System.out.println("Is capital") ;
        else System.out.println("Not a valid alphabet");
    }
}
