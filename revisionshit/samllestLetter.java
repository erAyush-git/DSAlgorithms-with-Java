package revisionShit;

public class samllestLetter {
    public static void main(String[] args){
        char[] arr = {'c','f','j'};
        char ans = SmallestLetterShit(arr, 'c');
        System.out.println(ans);

    }
    static char SmallestLetterShit(char[] arr, char target ){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target) end = mid -1 ;
            else start = mid + 1; 
        }
        return arr[start%arr.length];
    }
}
