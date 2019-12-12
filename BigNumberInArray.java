package javaQ;

import java.util.Arrays;

public class BigNumberInArray {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 3, 4, 2, 34, 2, 56, 98, 32, 54};

        //1. using for loop

        int bigNumber = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > bigNumber) {
                bigNumber = array[i];
            }
        }
        System.out.println(bigNumber);

        //2. if they dont have any requirement, juts use arrays sort method.
        Arrays.sort(array);
        System.out.println(array[array.length-1]+ " is big number");

    }




}
