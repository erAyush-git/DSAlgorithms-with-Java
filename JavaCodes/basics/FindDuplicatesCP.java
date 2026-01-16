public class FindDuplicatesCP {
    public static void main(String[] args){
        int[] nums = {3,1,3,4,2};
        System.out.println(FindDuplicates(nums));

    }

    static int FindDuplicates(int[] nums){
        int i = 0;
        while ( i < nums.length){
            int correctindex = nums[i]-1;
            if(nums[i] != nums[correctindex]){
                swap(nums, i , correctindex);
            }else{
                i++;
            }
        }
        // for the duplicate number 
        for(int idx = 0; idx < nums.length; idx++){
            if(nums[idx] != idx+1){
                return nums[idx];
            }
        }
        return 0;
    }
    
    static void swap(int[] arr, int f , int s){
        int temp = arr[f];
        arr[f] = arr [s];
        arr[s] = temp;
    }

    
}
