package com.priya.strings;

public class AllSubstrings {
    public static void printSubstrings(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < n; j++) {
                sb.append(str.charAt(j));
                System.out.println(sb);
            }
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubstrings(str);
    }
}
