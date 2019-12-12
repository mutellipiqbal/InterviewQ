package javaQ;

import java.util.Arrays;

public class SecondHighetInArray {

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 3, 4, 2, 34, 2, 56, 98, 32, 54};
        // 1. using for loop
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(array[array.length - 2] + " is second biggest number");

        //2. if they dont have any requirement, juts use arrays sort method.
        Arrays.sort(array);
        System.out.println(array[array.length - 2] + " is second biggest number");
    }
}
