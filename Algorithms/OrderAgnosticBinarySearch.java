//Order agnostic binary search is a form of binary search were there is no asssumption lies 
// there is a sorted array but we dont know the methord of sorting 
// so we create or find the sorting technique and them 
// apply binary search after gatering the information about it 
// Binaray search should be applied in both the cases for 
// assending sorted array and for descending sorted array

import java.util.Arrays;
public class OrderAgnosticBinarySearch {
    public static void main(String[] args){
        int[] arr1 = {10,9,8,6,5,3,2,1,-25,-43,-65};
        int[] arr2 = {-12,-1,2,6,7,8,9,15,19,23,36,87};

        System.out.println(Arrays.toString(arr1)); 
        System.out.println(Arrays.toString(arr2));


        System.out.println(OABSearch(arr2, 25)); //-1
        System.out.println(OABSearch(arr2, -1)); //1
        System.out.println(OABSearch(arr2, 23)); //9
        
        System.out.println(OABSearch(arr1, -96)); //-1
        System.out.println(OABSearch(arr1, 9));//1
        System.out.println(OABSearch(arr1, 5));//4



    }
    static int OABSearch(int[] array,int target){

        int start = 0;
        int end = array.length-1;

        boolean isAsc = array[start] < array[end];        

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == array[mid]){
                return mid;
            }else{                              // to cheak.
                if(isAsc){                      // order agnostic starts from here.
                    if(target > array[mid]){
                        // end will be same here 
                        start = mid +1;
                    }else{
                        //start will be same here 
                        end = mid -1;
                    }
                }else{ // case of decending order sorted array.
                    if (target > array[mid]){
                        //start will be same here 
                        end = mid-1;
                    }else{
                        //end will be same here 
                        start = mid +1;
                    }
                }
            }
        }
        return -1; // element not found case.
    }
    
}
