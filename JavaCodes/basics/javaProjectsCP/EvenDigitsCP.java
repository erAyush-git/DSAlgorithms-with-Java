//Given an array nums of integers, return how many of them contain an even number of digits.
//leetcode : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/


public class EvenDigitsCP {
    public static void main(String[] args){
        int[] arr = {21,5,86,966,302,-96};
        System.out.println(counteven(arr));

    }
    static int counteven(int[] arr){
        int count =0;
        for(int num : arr){
            if(iseven(num) == true){
                count++;
                System.out.println(num + " ");
            }
        }
        return count;
    }
    static boolean iseven(int num){
        if(NumOfDigits(num) % 2 == 0){
            return true;
        }
        return false;
    } 
    static int NumOfDigits(int num){
        if(num<0){
            num = num*-1;
        }
        return (int)(Math.log10(num)) +1;
    }
    
}
