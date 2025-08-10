/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

leetcode 34*/



public class firstAndLastPositionInSortedArray {
    public static void main(String[] args) {
        
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans ={-1,-1};
        ans[0] = findingRange(nums,target,true);
        if(ans[0] != -1){
            ans[1]=findingRange(nums,target,false);
        }
        return ans;
    }
    static int findingRange(int[] nums , int target, boolean findingFirst){
        int ans = -1; //generlised if target not found 
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid]<target){
                start = mid +1;
            }else if(nums[mid]>target){
                end = mid -1;
            }else {
                //We got the potential ans here 
                ans = mid;
                if(findingFirst){
                    end = mid -1;
                }else {
                    start = mid +1;
                }
            }
        }
        return ans;

    }

}

