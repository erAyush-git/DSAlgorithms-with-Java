//Given an array nums containing n distinct numbers in the range [0, n], 
//return the only number in the range that is missing from the array.

//Leetcode 268 : https://leetcode.com/problems/missing-number/description/

public class MissingNumberCyclicSort{
    public static void main(String[] args){
        int[] nums = {3,0,1};
        int ans = missingnumber(nums);
        System.out.println(ans);

    }
    static int missingnumber(int[] arr){
        //using cycle sort methord diirectly 
        int i = 0;
        while(i < arr.length){
            int correctindex = arr[i];
            if(arr[i]<arr.length && arr[i] != arr[correctindex]){
                // placing this arr[i]<arr.lenght to avoid the maximum element i.e. Nth element
                swap(arr,i,correctindex);
            }else{
                i++;
            }
        } 

        //cheaking for the first missing number 
        for(int index = 0;index<arr.length;index++){
            if(arr[index] != index ){
                return index;
            }
        }
        //case 2 i.e. we neglected the Nth number that could be the possible ans here.
        return arr.length;

    }
    static void swap(int[] arr, int i , int correct){
        int temp = arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
