/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order
 of the non-zero elements.

Note that you must do this in-place without making a copy of the array. */

//leetcode 283 :https://leetcode.com/problems/move-zeroes/description/

import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        int[] ans = move(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] move(int[] nums){
        //Using the two pointer apporch here so that we can have the 
        //array undisturbed and zero keep moving toword the end

        //step 1 : find index of first zero
        int j =-1; //if 0 not found then we have -1

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                j = i;
                break;
            }
        }

        // step 2: to iritlrate over the array and swap 
        // edge case for j = -1

        if(j == -1) return nums;
        
        for(int i = j +1; i < nums.length;i++){
            if(nums[i] != 0){
                swap(nums, i, j);
                j++;
            }
        }
        return nums;
    }
    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
