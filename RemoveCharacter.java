package com.priya.strings;

public class RemoveCharacter {
    public static String removeChar(String str, char ch) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != ch) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "programming";
        System.out.println("After removing 'g': " + removeChar(str, 'g'));
    }
}
