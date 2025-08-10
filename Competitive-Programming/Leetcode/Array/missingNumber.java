
// good methord for 0 to n unsorted array
public class missingNumber {
    public static void main(String[] args) {
        
    }
     public int missingNumber(int[] nums) {
        int[] arr = new int[nums.length +1]; // to store element from 0 to n.
        for(int x : nums){
            arr[x]++; // same as arr[x] = arr[x] + 1;
            // this will  change the respective index to 2.
            
            // array indices shows the num while element shows the count 
            // one of the best methord  to solve freq related ques 
        }
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == 0) return i; // indices gives the number and zero shows it is missing.
        }
        return -1; // dummy return 
    }
}

