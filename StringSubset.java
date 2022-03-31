public class StringSubset {
    public static void main(String[] args) {
        subset("fun");

    }

    public static void subset(String str){

        int length=str.length();
        String[] arry=new String[length*(length+1)/2];
        int temInt=0;
        for(int a=0; a<length;a++){
            for (int b=a; b<length;b++){
                arry[temInt]=str.substring(a,b+1);
                temInt++;
            }
        }

        for(int i=0; i<arry.length;i++){
            System.out.println(arry[i]);
        }
    }
}
