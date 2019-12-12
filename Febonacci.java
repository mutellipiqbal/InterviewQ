package javaQ;

public class Febonacci {
    public static void main(String[] args) {
        System.out.println(febonacci(10));
    }
    public static int febonacci(int a){
        if(a<=1){
            return a;
        }
        return febonacci(a-1)+febonacci(a-2);
    }
}
