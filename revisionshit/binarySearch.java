public class binarySearch {
    public static void main(String[] args ){
        // this shit works for asc sorted array 
        int[] arr = {1,2,3,4,5,6,7};
        int ans = search(arr, 15);
        System.out.println(ans);


    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;

    }
}
