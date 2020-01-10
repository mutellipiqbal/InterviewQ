public class SlicingStringWords {

    public static void main(String[] args) {
        String words= "I love the Java very well!";
        String[] splittingWords=words.split(" ");
        for (String s: splittingWords){
            System.out.println(s+ " has "+s.length()+ " character");
        }
    }
}
