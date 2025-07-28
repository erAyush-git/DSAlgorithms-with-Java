//Search in the return the index of the element if the elment found 
// otherwise return -1

//Use LinearSearch Algorithm
// time compmplexity in best case is constant while 
//in wost case O(N)   where N is the size of array.


import java.util.Arrays;
public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80,90};
        System.out.println(Arrays.toString(arr));
        int target = 254;
        int ans = linearsearch(arr, target);
        System.out.println(ans);

    }
    static int linearsearch(int[] array, int target){
        if (array.length == 0) {
            return -1;
        }
        for(int idx = 0; idx < array.length;idx++){
            if(array[idx] == target){
                return idx;
            }
        }
        return -1;
    }
}
