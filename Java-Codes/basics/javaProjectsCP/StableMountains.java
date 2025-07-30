/*There are n mountains in a row, and each mountain has a height. 
You are given an integer array height where height[i] represents the height of mountain i, 
and an integer threshold.

A mountain is called stable if the mountain just before it (if it exists) has a height 
strictly greater than threshold. Note that mountain 0 is not stable.

Return an array containing the indices of all stable mountains in any order. */


import java.util.ArrayList;
public class StableMountains{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        //int threshold = 2;
        ArrayList<Integer> list = new ArrayList<>();
        list = stablityCheak(arr,2);
        System.out.println(list);
    }
    static ArrayList<Integer> stablityCheak(int[] height, int threshold){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < height.length-1; i++){
            if(height[i] > threshold){
                list.add(i+1);
            }
        }
        return list;
    }
}