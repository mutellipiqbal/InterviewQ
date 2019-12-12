package javaQ;

public class DuplicatedElementArray {

    public static void main(String[] args) {
        int[] array2 = {2, 3, 4, 5, 3, 4, 2, 34, 2, 56, 98, 32, 54};
        for (int a = 0; a < array2.length; a++) {
            for (int b = a + 1; b < array2.length; b++) {
                if (array2[a] == array2[b]) {
                    System.out.println(array2[a] + " is duplicated");
                }
            }
        }

    }
}
