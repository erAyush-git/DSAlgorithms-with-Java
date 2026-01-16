import java.util.Scanner;

public class FibonacciSeq {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int nterm = input.nextInt(); // user input for nth term of febo number 
        int a = 0;
        int b = 1;
        int count = 2;

        while( count <= nterm ){
            int temp = b;
            b= b+a;
            a = temp;
            count++;
        }
        System.out.println("nth term of fibonacci seq is :" + b); // b contains our final answer.

    }
}
