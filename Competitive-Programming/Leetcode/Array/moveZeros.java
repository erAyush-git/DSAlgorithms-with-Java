/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order
 of the non-zero elements.

Note that you must do this in-place without making a copy of the array. */

//leetcode 283 :https://leetcode.com/problems/move-zeroes/description/
public class moveZeros {
    public static void main(String[] args){

    }
        
    static int[] move(int[] nums){
        //Using the two pointer apporch here so that we can have the 
        //array undisturbed and zero keep moving toword the end

        //cheaking for the first index where 0 appears 
        int j = -1; // in case we dont find 0

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        //cheaking edge case of j = -1;
        if(j == -1) return nums;

        // cheaking for swaps of zero
        for(int i = j+1; i < nums.length ; i++){
            if(nums[i] != 0){
                swap(nums,i,j);
                j++;
            }
        }
        return nums;
    }
    static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
}
