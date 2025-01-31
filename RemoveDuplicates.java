package com.priya.strings;

import java.util.HashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        HashSet<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!seen.contains(c)) {
                sb.append(c);
                seen.add(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "programming";
        System.out.println("After removing duplicates: " + removeDuplicates(str));
    }
}
