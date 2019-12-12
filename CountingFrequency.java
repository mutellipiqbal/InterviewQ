package javaQ;

import java.util.*;

public class CountingFrequency {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 3, 1, 8, 9};

        for (int a = 0; a < nums.length ; a++) {
            int count = 0;
            for (int b = 0; b < nums.length ; b++) {
                if (nums[a] == nums[b]) {
                    count = count + 1;
                }
            }
            System.out.println(nums[a] + " is " + count + " time*");

        }

        //first way: using stream().filter().count();

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 3, 1, 8, 9));
        long s = list.stream().filter(i -> i == 9).count();
        System.out.println("9 is "+s+" time");

        //first way: using list and set

        Set<Integer> list2 = new HashSet<>(list);
        for (Integer n:list2){
            System.out.println(n+" is "+Collections.frequency(list, n)+" time seen");
        }

        //third way: using map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer t: list) {
            Integer count = frequencyMap.get(t);
            if (count == null)
                count = 0;

            frequencyMap.put(t, count + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue()+" time");
        }

    }
}

