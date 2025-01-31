package com.priya.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static char firstNonRepeatingChar(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '_'; // Return '_' if no unique character is found
    }

    public static void main(String[] args) {
        String str = "swiss";
        System.out.println("First non-repeating character: " + firstNonRepeatingChar(str));
    }
}
