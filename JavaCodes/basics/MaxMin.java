//Define two methods to print the maximum and the minimum number
// respectively among three numbers entered by the user.

import java.util.Scanner;

public class MaxMin{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //ask user to input 3 numbers.

        int num = input.nextInt();
        int numm = input.nextInt();
        int nummm = input.nextInt();

        int maxans = maxofthree(num, numm, nummm);
        int minans = minofthree(num, numm, nummm);

        System.out.println("Max one out is :" + maxans);
        System.out.println("Min one out is :" + minans);


    

    }
    static int maxofthree(int num1, int num2, int num3){
        int max = num1; 
        if(num2 > max){
            max = num2;
        }if(num3 > max){
            max = num3;
        }else{
            System.out.println("Enter a valid number.");
        }


        return max;
    }



    static int minofthree(int num1, int num2, int num3){
        int min = Integer.MAX_VALUE;
        if(num1 < min){
            min= num1;
        }else if(num2 < min){
            min = num2;
        }else if(num3 < min){
            min = num3;
        }else{
            System.out.println("Enter a valid number.");
        }


        return min;
    }
}
