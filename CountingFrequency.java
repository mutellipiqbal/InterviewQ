package javaQ;

import java.util.*;

public class CountingFrequency {
    public static void main(String[] args) {
        
        //First way: using hash map
        String str="sdfdfsdfsfrer";
        char[] chars=str.toCharArray();
        HashMap<Character, Integer> frequencyCount = new HashMap<Character, Integer>();
        for (char c : chars) {
            if (frequencyCount.containsKey(c)) {
                frequencyCount.put(c, frequencyCount.get(c) + 1);
            }
            else {
                frequencyCount.put(c, 1);
            }
        }

        for (Map.Entry entry : frequencyCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //second way: using stream().filter().count();

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 3, 1, 8, 9));
        long s = list.stream().filter(i -> i == 9).count();
        System.out.println("9 is "+s+" time");

        //thrid way: using list and set

        Set<Integer> list2 = new HashSet<>(list);
        for (Integer n:list2){
            System.out.println(n+" is "+Collections.frequency(list, n)+" time seen");
        }


    }
}

