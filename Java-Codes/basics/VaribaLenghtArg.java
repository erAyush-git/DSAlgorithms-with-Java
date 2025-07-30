
import java.util.Arrays;
public class VaribaLenghtArg {
    public static void main(String[] args){
        function(1,5,56,8);
    }
    static void function(int...v){
        System.out.println(Arrays.toString(v));
    }
}
