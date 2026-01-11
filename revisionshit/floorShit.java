package revisionShit;

public class floorShit {
    public static void main(String[] args){
        int[] arr = {1,3,5,7,8,9};
        int ans = floor(arr, 6);
        System.out.println(ans);
    }
    static int floor(int[] arr, int target ){
        int start = 0;
        int end = arr.length-1;
        if(target > arr[arr.length-1]) return -1;

        while(start <= end ){
            int mid = start + (end - start)/2;
            if(arr[mid] == target ) return mid;
            else if (arr[mid] > target ) end = mid -1;
            else start = mid +1;
        }
        return end;
    }
}
