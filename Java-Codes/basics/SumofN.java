//Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;
public class SumofN{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans = sum(n);
        System.out.println(ans);


    }
    static int sum(int num){ // sum = (num*(num+1))/2 that summation formula.

        int ans = (num*(num+1))/2;
        return ans;

    }
}