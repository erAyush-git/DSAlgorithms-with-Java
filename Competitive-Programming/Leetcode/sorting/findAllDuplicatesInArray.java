import java.util.ArrayList;
import java.util.List;

public class findAllDuplicatesInArray {
    public static void main(String[] args) {
        
    }
    public List<Integer> findDuplicates(int[] nums) {
        int i =0;
        while(i < nums.length){
            int correctindex = nums[i]-1;
            if(nums[i] != nums[correctindex]){
                swap(nums,i,correctindex);
        
            }else{
                i++;
            }
        }
        // now getting the corrrect arraylist of Duplicate numbers 
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length; index ++){
            if(nums[index] != index +1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }
    // for swapping of the numbers 
    static void swap(int[] nums, int f, int s ){
        int temp = nums[f];
        nums[f]=nums[s];
        nums[s]=temp;
    }
}
