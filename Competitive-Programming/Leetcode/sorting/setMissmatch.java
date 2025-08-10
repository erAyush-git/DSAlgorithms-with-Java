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
