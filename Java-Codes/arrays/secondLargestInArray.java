
public class secondLargestInArray {
    public static void main(String[] args){
        int[] nums = {1,10,67,90};
        int ans = secondLargestOptimalSolution(nums);
        System.out.println(ans);
    }
     //brute force apporoch follow time complexity of O(N+N)

     /*step1 : to find the lagrgest element\
      step2 : find the next element smaller then the larget one.
     */

    static int secondLargestBF(int[] arr){
        int largest = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]> largest) largest = arr[i];
        }
        // now here we have the largest element in the array 
        // for second largest 
        int secLargest = Integer.MIN_VALUE; 
        for(int j = 0; j < arr.length; j++){
            if(arr[j]>secLargest && arr[j]!= largest) secLargest=arr[j];
        }
        return secLargest;
    }

    //optimal solution for this problem can be 
    //this is using time complexity of O(N)

    static int secondLargestOptimalSolution(int[] arr){
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>secondLargest) secondLargest=arr[i];
        }
        return secondLargest;
    }
}


public class secondLargestInArray {
    public static void main(String[] args){
    }
     //brute force apporoch follow time complexity of O(N+N)

     /*step1 : to find the lagrgest element\
      step2 : find the next element smaller then the larget one.
     */

    static int secondLargestBF(int[] arr){
        int largest = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]> largest) largest = arr[i];
        }
        // now here we have the largest element in the array 
        // for second largest 
        int secLargest = Integer.MIN_VALUE; 
        for(int j = 0; j < arr.length; j++){
            if(arr[j]>secLargest && arr[j]!= largest) secLargest=arr[j];
        }
        return secLargest;
    }


    //optimal solution for this problem can be 
    //this is using time complexity of O(N)

    static int secondLargestOptimalSolution(int[] arr){
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>secondLargest) secondLargest=arr[i];
        }
        return secondLargest;
    }

    
}
