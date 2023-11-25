package com.example.hackerrank.arrays;

import java.util.*;

public class ArrayManipulation {

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        return arrayManipulationUsingMap(n, queries);
    }

    public static long arrayManipulationUsingMap(int n, List<List<Integer>> queries) {
        System.out.println("Size is: " + n);
        System.out.println(queries);
        Map<Long, Long> map = new HashMap<>();

        for (List<Integer> query : queries) {
            Long fromIndex = Long.valueOf(query.get(0));
            Long toIndex = Long.valueOf(query.get(1));
            Long value = Long.valueOf(query.get(2));

            map.put(fromIndex, (map.containsKey(fromIndex) ? map.get(fromIndex) : 0) + value);
            map.put(toIndex + 1, (map.containsKey(toIndex + 1) ? map.get(toIndex + 1) : 0) - value);
            System.out.println(map);
        }

        long maxValue = 0;
        long value = 0;
        for (long i = 0; i < n; i++) {
            value += (map.containsKey(i + 1) ? map.get(i + 1) : 0);
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
