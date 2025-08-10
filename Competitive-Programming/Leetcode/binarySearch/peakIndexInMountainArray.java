public class peakIndexInMountainArray {
   public static void main(String[] args) {
    
   } 
   static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int middleElement = start + (end - start)/2;
            if (arr[middleElement] > arr[middleElement +1]){
                end = middleElement;
            }else if(arr[middleElement] < arr[middleElement +1]){
                start = middleElement +1;
            }
        }
        return end;

    }
}
