//Write a function to check if a given triplet is a Pythagorean triplet or not. 
//(A Pythagorean triplet is when the sum of the square 
//of two numbers is equal to the square of the third number).


public class PythagoreanTriplet{
    public static void main(String[] args){

    }
    static boolean PythagoresCheak(int num1 , int num2,int num3){
        int H = max(num1,num2,num3);
        if(H*H == (num1*num1 + num)){

        }   // INCOMPLETE FROM HERE.

    }
    static int max(int num1,int num2, int num3){
        int max = num1;
        if(max > num2){
            max = num2;
        }else if(max > num3){
            max = num3;
        }
        return max;

    }
}