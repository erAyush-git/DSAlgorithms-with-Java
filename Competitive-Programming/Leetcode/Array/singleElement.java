public class singleElement{
    public static void main(String args[]){

    }
    static int singleNumber(int[] nums) {
        /*if we are in the left side of ans then even-odd will be same
         * and if we on right side then odd-even indices will be same.
         */
        // Cheaking all the edge cases first 
        sort(nums);
        if(nums.length == 1) return nums[0];
        if(nums[nums.length-1] != nums[nums.length-2]) return nums[nums.length-1];
        if(nums[0] != nums[1]) return nums[0];

        // this will make our search space redused by start at  and end at len -2
        int start = 1;
        int end = nums.length -2;

        while(start <= end){
            int middleIndex = start + (end - start)/2;

            //Best possible case for ans after cutting edge cases 
            if(nums[middleIndex] != nums[middleIndex +1] && nums[middleIndex] != nums[middleIndex-1]) {
                return nums[middleIndex]; // Best possible ans 
            }
            //cheaking in which part of array we are in 
            
            //if this conditions are true then we are in left part and ans must 
            //be on the right side 
            if(middleIndex % 2 == 1 && nums[middleIndex] == nums[middleIndex -1] || middleIndex % 2 == 0 && nums[middleIndex] == nums[middleIndex+1]){
                start = middleIndex +1;
            }else{
                // in the right of array and ans must be on the left side of middleIndex
                end = middleIndex -1;
            }
             
        }
        return -1; // dummy return
    }
        static void sort(int[] arr){
        for(int i=0; i<arr.length -1; i++){
            for(int j= i+1; j>0 ; j--){
                if(arr[j]<arr[j-1]){
                    swapp(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swapp(int[] arr, int f,int s){
        // swapping the first passed parameter f with the second 
        //passed parameter.
        int temp = arr[f];
        arr[f]=arr[s];
        arr[s]= temp;
    }
}    