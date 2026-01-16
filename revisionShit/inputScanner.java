package revisionShit;

import java.util.Scanner;
public class inputScanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("name is :" + name);
        scan.close();
    }
}
