package com.priya.strings;

public class InsertChar {
    public static String insertChar(String str, char ch, int index) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(index, ch);
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Java";
        System.out.println("After insertion: " + insertChar(str, 'X', 2));
    }
}
