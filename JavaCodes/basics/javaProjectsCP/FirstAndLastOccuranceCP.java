//Given an array of integers nums sorted in non-decreasing order, 
//find the starting and ending position of a given target value.

//If target is not found in the array, return [-1, -1].

//You must write an algorithm with O(log n) runtime complexity.

//leetcode:https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/


import java.util.Arrays;
public class FirstAndLastOccuranceCP {
    public static void main(String[] args){
        int[] arr = {1,2,2,2,2,5};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(searchRange(arr, 2)));


    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        int start = Search(nums, target, true);
        int end = Search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;

    }
    static int Search(int[] nums ,int target,boolean FirstOccurance){
    
        int start = 0;   
        int end =  nums.length-1;

        int ans = -1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(target<nums[mid]){
                end = mid -1;
            }else if(target > nums[mid]){
                start = mid +1;
            }else{
                ans = mid; // potential answer here is found whereas cheaking for FirstOccurance now 
                if(FirstOccurance == true){
                    //start stays same 
                    end = mid -1;
                }else{
                    //ends stays same 
                    start = mid+1;
                }
            }
        }
        return ans;

    }
     
}
