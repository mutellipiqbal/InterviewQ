package javaQ;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSort {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        list.add(12);
        list.add(228);
        list.add(467);
        list.add(99);

        //first way is using Collections sort method
       // Collections.sort(list);
        System.out.println(list);

        // second way is using two for loop
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i,list.get(j) ) ;
                    list.set(j, temp);
                }
            }
        }

        System.out.println(list);
    }



}
