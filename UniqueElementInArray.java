package javaQ;

import java.util.HashSet;
import java.util.Set;

public class UniqueElementInArray {
    public static void main(String[] args) {

        //1. using set
        int[] array = {2, 3, 4, 5, 3, 4, 2, 34, 2, 56, 98, 32, 54};
        Set<Integer> set= new HashSet<>();
        for (int a=0; a<array.length; a++){
            set.add(array[a]);

        }
        //System.out.println(set);

        // 2. using for loop
        int[] array2 = {2, 3, 4, 5, 3, 4, 2, 34, 2, 56, 98, 32, 54};
        int unique;
        for (int a=0; a<array2.length; a++){
            boolean t=false;
            for (int b=0; b<a; b++){
                if (array2[a]==array2[b]){
                    t=true;
                    break;

                }
            }
            if (!t){
                System.out.print(array2[a]+" ");
            }

        }
    }
}
