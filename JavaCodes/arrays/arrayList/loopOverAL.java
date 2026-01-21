package JavaCodes.arrays.arrayList;

import java.util.ArrayList;
public class loopOverAL {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(10);
        for(int i = 11 ; i <123; i = i + 13){
            list.add(i);
        }
        boolean found = false;
        for(int x : list){
            if(x == 11){
                found = true;
            }
            
        }
        System.out.println(found);
        
    }
    

}
