/*Given a sorted array of distinct integers and a target value, 
return the index if the target is found. If not, return the index where it would be if it
 were inserted in order.

You must write an algorithm with O(log n) runtime complexity. */

public class SearchInsertPosCP {
    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        int ans = searchPosition(nums, 2);
        System.out.println(ans);
    }
    static int searchPosition(int[] nums , int target){
        int start = 0;
        int end = nums.length -1;

        while(start <= end ){
            int mid = start + (end - start)/2;
            if(nums[mid] > target){
                end = mid -1;
            }else if(nums[mid]<target){
                start = mid +1;
            }else return mid; // element found
        }
        //if element not found then think of the just smaller number lets say that 
        //located at index i, then and would be i +1;

        return end+1;
    }
}
