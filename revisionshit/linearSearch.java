package revisionShit;

public class linearSearch {
    public static void main(String[] args){
        int[] nums = {1,32,3,9};
        int ans = linearSearchIndex(nums, 10);
        System.out.println(ans);

    }
    static int linearSearchIndex(int[] nums, int target){ 
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]==target) return i;
        }
        return -1;
    }
}
