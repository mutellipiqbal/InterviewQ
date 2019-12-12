package javaQ;

import java.util.Arrays;

public class SmallNumInArray {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 3, 4, 2, 34, 2, 56, 98, 32, 54};

        //1. using for loop

        int smallNumber = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] <smallNumber) {
                smallNumber = array[i];
            }
        }
        System.out.println(smallNumber);
        //2. if they dont have any requirement, juts use arrays sort method.
        Arrays.sort(array);
        System.out.println(array[0]+ " is small number");
    }
}
