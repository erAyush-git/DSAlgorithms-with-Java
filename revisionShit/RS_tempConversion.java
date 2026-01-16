package revisionShit;

import java.util.Scanner;
public class RS_tempConversion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter among the given choices \n 1 : C to kelvin \n 2 : C to Feranhite\n");
        int choice = input.nextInt();
        if(choice == 1) {
            System.out.println("Enter temprature in C :");
            int c = input.nextInt();
            float C2F = (1.8f * c) + 32 ;
            System.out.println(C2F);
        } else {
            
        }
        
    }
}
