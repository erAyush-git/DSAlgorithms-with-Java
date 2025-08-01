
/*Solves the array by breaking it into parts of i 
 while j use to swap the vlause 
*/
//great for partially sorted arrays.

import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,354};
        sort(arr);
        System.out.println(Arrays.toString(arr));

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
