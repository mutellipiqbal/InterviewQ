package javaQ;


public class AlphaNumiricCheck {

    public static void main(String...s)
    {
        String s1="adA12", s2="jh@l";
        System.out.println(s1.matches("[a-zA-Z0-9]+"));
        System.out.println(s2.matches("[a-zA-Z0-9]+"));

        String Str = new String("Welcome to Tutorialspoint.com");

        System.out.print("Return Value :" );
        System.out.println(Str.matches("(.*)Tutorials(.*)"));

        System.out.print("Return Value :" );
        System.out.println(Str.matches("Tutorials"));

        System.out.print("Return Value :" );
        System.out.println(Str.matches("Welcome(.*)"));
    }
}
