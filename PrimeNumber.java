package javaQ;

public class PrimeNumber {
    public static void main(String[] args) {
        for (int c=0; c<100; c++){
            boolean t=isPrime(c);
            System.out.println(c+" is "+t);
        }
//        boolean t=isPrime(12);
//        System.out.println(t);


    }

    public static boolean isPrime(int a){
        if (a<=1){
            return false;
        }
        for (int b=2; b<a; b++){
            if (a%b==0){
                return false;
            }
        }
        return true;
    }

}
