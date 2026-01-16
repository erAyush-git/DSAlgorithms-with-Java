
import java.util.Arrays;
import java.util.Scanner;
public class MaxMinLSATD {
    public static void main(String[] args){
        int[][] arr = {
            {2,5,6,6,9},
            {261,68,489},
            {25,89,56,210},
        };
        System.out.println(minvalue(arr));
        System.out.println(Arrays.toString(Search(arr)));


    }
    static int maxvalue(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length;row++){
            for(int col = 0; col < arr[row].length;col++){
                if(max < arr[row][col]){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    static int minvalue(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int row = 0; row < arr.length;row++){
            for(int col = 0; col < arr[row].length;col++){
                if(min > arr[row][col]){
                    min = arr[row][col];
                }
            }
        }
        return min;
    }

    static int[] Search(int[][] array){
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col <array[row].length; col++){
                if(array[row][col] == minvalue(array)){
                    return new int[]{row , col};
                }
            }
        }
        return new int[] {-1,-1};
    }

    
}
