package javaQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddingTwoArray {

    public static void main(String[] args) {
        int[] array1 = {2, 3, 4, 5, 3, 4, 2, 34, 2, 56, 98, 32, 54};
        int[] array2 = {2, 3, 4, 5, 3, 4, 2, 34, 2, 56, 98, 32, 54};
        // 1. we can use for loop for creating new array
        int[] newArray=new int[array1.length+array2.length];
        // we need counter for second array
        int counter=0;
        for (int a=0; a<array1.length; a++){
            newArray[a]=array1[a];
            counter++;
        }
        for (int b=0; b<array2.length;b++){
            newArray[counter]=array2[b];
            counter++;
        }

        System.out.println(Arrays.toString(newArray));

        //2. we can use ArrayList
        List<Integer> list1= new ArrayList<Integer>();
        for (int a=0; a<array1.length; a++){
            list1.add(array1[a]);
        }
        List<Integer> list2= new ArrayList<Integer>();
        for (int t=0; t<array2.length; t++){
            list2.add(array1[t]);
        }

        list1.addAll(list2);
        System.out.println("this is second adding: "+list1);


    }
}
