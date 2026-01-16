import java.util.Arrays;

public class FloorNumber {
    public static void main(String[] args){
        int[] arr1 = {10,9,8,6,5,3,2,1,-25,-43,-65};
        int[] arr2 = {-12,-1,2,6,7,8,9,15,19,23,36,87};

        System.out.println(Arrays.toString(arr1)); 
        System.out.println(Arrays.toString(arr2));

        System.out.println(floornum(arr1,4 ));
        System.out.println(floornum(arr1, 5));
        System.out.println(floornum(arr2, 7));
        System.out.println(floornum(arr2, 12));


    }
    static int floornum(int[] array, int target){
        int start = 0;
        int end = array.length-1;

        if(AscCheak(array)){
            int ans = FloorforAsc(array, target);
            return ans;

        }else{
            int ans = FloorforDec(array, target);
            return ans;

        }
    }

    static boolean AscCheak(int[] arr){
        int start =0;
        int end = arr.length-1;
        if(arr[start]> arr[end]){
            return false;
        }else{
            return true;
        }
    }

    static int FloorforAsc(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (target == array[mid]){
                return array[mid];
            }else{
                if(target > array[mid]){
                    // end will be same here 
                    start = mid +1;
                }else{
                    //start will be same here 
                    end = mid -1;
                }
            }    
        
        }
        return array[end];
    }

    static int FloorforDec(int[] array , int target){
        int start = 0;
        int end = array.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == array[mid]){
                return array[mid];
            }else{
                if(target > array[mid]){
                    // start will be same here 
                    end = mid -1;
                }else{
                    //end will be same here 
                    start = mid +1;
                }
            }    
        }
        return array[start];

    }


}
