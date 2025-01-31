package com.priya.strings;

public class TitleCase {
    public static String toTitleCase(String str) {
        String[] words = str.toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1)).append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "java is fun";
        System.out.println("Title Case: " + toTitleCase(sentence));
    }
}
