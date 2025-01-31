package com.priya.strings;

public class ReverseWords {
    public static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse()).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "Hello World";
        System.out.println("Reversed Words: " + reverseEachWord(sentence));
    }
}
