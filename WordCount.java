package com.priya.strings;

public class WordCount {
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        String str = "Java is a powerful language";
        System.out.println("Word count: " + countWords(str));
    }
}
