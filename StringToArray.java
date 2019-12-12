package javaQ;

import java.util.Arrays;

public class StringToArray {
    public static void main(String[] args) {
        String s="java";
        char[] array= new char[s.length()];
        for (int a=0; a<s.length();a++){
            array[a]=s.charAt(a);
        }

        System.out.println(Arrays.toString(array));
    }
}
