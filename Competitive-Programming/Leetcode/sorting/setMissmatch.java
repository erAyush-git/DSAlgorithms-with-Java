/*You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

leetcode 645*/


public class setMissmatch {
    public static void main(String args[]){

    }
    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctindex = nums[i] -1;
            if(nums[i] != nums[correctindex]){
                swap(nums,i, correctindex );
            } else {
                i++;
            }
        }

        // Finding the mismatch and duplicate element 
        for(int index = 0; index < nums.length ; index++){
            if(nums[index] != index +1){
                int[] ans = {nums[index] , index + 1};
                return ans;
            }
        }
        int[] emp = {-1,-1};
        return emp;


    }
    static void swap(int[] nums, int f , int s){
        int temp = nums[f];
        nums[f]=nums[s];
        nums[s]=temp;
    }
}

