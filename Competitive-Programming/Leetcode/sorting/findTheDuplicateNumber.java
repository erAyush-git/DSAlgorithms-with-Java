public class findTheDuplicateNumber {
    public static void main(String[] args) {
        
    }
     public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctindex = nums[i]-1;
            if(nums[i] != nums[correctindex]){
                swap(nums, i , correctindex);
            }else{
                i++;
            }
        }
        // To return the duplicated value 
        for (int index = 0; index < nums.length ; index++){
            if(nums[index] != index+1){
                return nums[index];
            }
        }
        return -1;
    }
    // Swap function 
    static void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f]= arr[s];
        arr[s] = temp;
    }
}
