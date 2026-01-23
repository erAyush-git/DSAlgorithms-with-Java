package JavaCodes.arrays.arrayList;

import java.util.ArrayList;
public class arrayListFuncn {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(5);
        for(int i = 1 ; i < 100 ; i = i + 11){
            list.add(i);
        }
        System.out.println(list); // 1,12,23,34,45,56,67,78,89
        list.addLast(90);
        //list.clear();
        System.out.println(list);
    }
}
