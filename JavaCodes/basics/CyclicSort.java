
import java.util.Arrays;
public class CyclicSort {
    public static void main(String args[]){

        //Works only and works best for the complete range from 1 to N continious numbers..
        int[] ar = {1,6,5,4,3,2};
        sort(ar);
        System.out.println(Arrays.toString(ar));

    }
    static void sort(int[] arr){
        int i =0;
        while(i < arr.length){
            int correct = arr[i]-1; 
            //which shows the correct index value, i.e. if val is 3 then 
            // int correct value must be 2 which impies correct = arr[i] -1;

            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }

        }

    }
    static void swap(int[] arr , int i, int correct){
        int temp = arr[i];
        arr[i]=arr[correct];
        arr[correct]= temp;
    }
}
