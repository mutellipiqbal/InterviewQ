package javaQ;

public class StarNameRepeating {

    public static void main(String[] args) {
        //1. using two for loop
        for (int a=0; a<5; a++){
            for (int b= 0; b<=a; b++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int a=0; a<5; a++){
            for (int b= 0; b<=a; b++){
                System.out.print("mutellip ");
            }
            System.out.println();
        }

        //2. using one for loop
        String s="";
        for (int c=0; c<5; c++){
            s+="*";
            System.out.println(s);
        }
        String m="";

        for (int c=0; c<5; c++){
            m+="mutellip ";
            System.out.println(m);
        }

    }
}
