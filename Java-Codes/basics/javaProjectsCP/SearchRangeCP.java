
import java.util.Arrays;

public class SearchRangeCP {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int[] ans = searchRange(nums, 8);
        System.out.println(Arrays.toString(ans));


        
    }
    static int[] searchRange(int[] nums , int target){
        int[] ans = {-1,-1};
        ans[0] = findingOccurance(nums, 8 , true );
        ans[1] = findingOccurance(nums, 8, false);
        return ans;
    }
    static int findingOccurance(int[] nums, int target,boolean findingFirst){
        int start = 0;
        int end = nums.length - 1; 
        int ans =-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if( target< nums[mid]){
                end = mid -1;
            }else if(target>nums[mid] ){
                start = mid +1;
            }else{
                //This might contain the possible answer
                ans = mid;
                //but we should cheak for first occourance 
                if(findingFirst){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
                //return ans;

            }
        }
        return ans;
        
    }
}
