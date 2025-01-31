package com.priya.strings;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println("Is Palindrome: " + isPalindrome(str));
    }
}
