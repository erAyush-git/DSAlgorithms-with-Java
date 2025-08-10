import java.util.ArrayList;
import java.util.List;

public class dissapprearedInArray {
    public static void main(String[] args) {
        
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i =0;
        while(i < nums.length){
            int correctindex = nums[i]-1;
            if(nums[i] != nums[correctindex]){
                swap(nums,i,correctindex);
        
            }else{
                i++;
            }
        }
        // now getting the corrrect arraylist of missing number 
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length; index ++){
            if(nums[index] != index +1){
                ans.add(index+1);
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
