import java.util.Arrays;

public class ArraySlicing {

    public static void main(String[] args) {
        int[] array= {1, 2, 3, 45, 34, 67, 2, 24, 33};
        for (int a=0; a<array.length; a++){
            for (int b=a+1; b<array.length; b++){
                if (array[a]==array[b]){
                  int[]  newArray=Arrays.copyOfRange(array, a, b);
                    System.out.println(Arrays.toString(newArray));
                }
            }
        }

    }
}
