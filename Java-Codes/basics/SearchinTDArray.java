import java.util.Arrays;

public class SearchinTDArray {
    public static void main(String[] args){
        int[][] arr = {
            {2,5,6,6,9},
            {261,68,489},
            {25,89,56,210},
        };
        int[] ans = Search(arr, 40 );
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(Search(arr, 3258)));
    }
    static int[] Search(int[][] array , int target){
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col <array[row].length; col++){
                if(array[row][col] == target){
                    return new int[]{row , col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
