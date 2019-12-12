package javaQ;

public class Palindrom {
    public static void main(String[] args) {
        palin1("dad");
        palin1("daD");
    }

    // using string builder
    public static void palin1(String s){
        StringBuilder sb= new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
        if (sb.toString().equalsIgnoreCase(s)){
            System.out.println(sb+" is palindrom");
        } else {
            System.out.println(sb+" is not palindrom");

        }

    }

    //using for loop
    public static void palin2(String s){
        String temp="";
        for (int a=s.length()-1; a>0; a--){
            temp=temp+s.charAt(a);
        }
        if (s.equalsIgnoreCase(temp)){
            System.out.println(s+" is palindrom");
        } else {
            System.out.println(s+" is not palindrom");
        }
    }
}
