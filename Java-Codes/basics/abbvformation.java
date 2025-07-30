
import java.util.Scanner;
public class abbvformation{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] str = new String[n];
        for(int i =0; i <str.length; i++){
            str[i] = scan.next();
        }
        for(String nstr : str){
            if(nstr.length() > 10){
                //System.out.println(nstr.charAt(0)+nstr.length()+nstr.charAt(nstr.length()-1));
                abbvForm(nstr);
            }else{
                System.out.println(nstr);
            }
        }
    }
    static void abbvForm(String s){
            char st = s.charAt(0);
            int len = s.length()-2;
            char e = s.charAt(s.length()-1);
            System.out.println(st+""+len+""+e);
    
    }  
}      