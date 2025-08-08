
//leetcode : 136
public class singleElementXOR {
    public static void main(String args[]){
        int[] nums = {2,2,1};
        int ans = occouredOnce(nums);
        System.out.println(ans);
    }
    static int occouredOnce(int[] nums){
        int uniqueElement = 0;
        for(int num : nums){
            uniqueElement ^= num;
        }
        return uniqueElement;
    }
}
