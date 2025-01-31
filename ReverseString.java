package com.priya.strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "HelloWorld";

        // Using StringBuilder
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reversed using StringBuilder: " + sb.reverse());

        // Using StringBuffer
        StringBuffer sf = new StringBuffer(str);
        System.out.println("Reversed using StringBuffer: " + sf.reverse());
    }
}
