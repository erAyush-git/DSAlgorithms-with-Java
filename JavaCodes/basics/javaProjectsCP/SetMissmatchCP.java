/*You have a set of integers s, which originally contains all the 
numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got 
duplicated to another number in the set, which results in repetition of one number and loss of 
another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

  */

import java.util.Arrays;

public class SetMissmatchCP {

    public static void main(String[] args){
        int[] nums = {1,1};
        int[] ans = findErrorNo(nums);
        System.out.println(Arrays.toString(ans));


    }
    static int[] findErrorNo(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correctindex = nums[i] -1;
            if(nums[i] != nums[correctindex]){
                swap(nums, i , correctindex);
            }else{
                i++;
            }
        }

        //cheaking for missmatch and duplicate element
        
        //List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length; index ++){
            if(nums[index] != index +1){
                int[] ans = {nums[index] , index+1};
                return ans;
            }
        }
        int[] emp = {-1,-1};
        return emp;


    }
    static void swap(int[] nums, int f , int s){
        int temp = nums [f];
        nums[f] = nums[s];
        nums[s]=temp;
    }
    
}
