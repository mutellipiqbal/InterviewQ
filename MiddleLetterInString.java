package javaQ;

public class MiddleLetterInString {
    public static void main(String[] args) {
        String s="javac";
        int mid=s.length()/2;
        System.out.println(s.charAt(mid));

        String[] ss= {"abbb", "rttt", "ghgh", "javac", "fgfgf", "ghgh", "ghkj"};
        int mid1= ss.length/2;
        System.out.println(ss[mid1]);
    }
}
