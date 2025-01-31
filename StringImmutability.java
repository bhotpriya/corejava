package com.priya.strings;

public class StringImmutability {

    public static void main(String[] args) {

        //scnerio 2
        String name1 = "jaya";
        String name2 = "rekha";
        String name3 = "jaya";

        System.out.println(name1 +" hashcode= "+name1.hashCode());
        System.out.println(name2 +" hashcode= "+name2.hashCode());
        System.out.println(name3 +" hashcode= "+name3.hashCode());

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("Hello");

        System.out.println(s4 +" hashcode= "+s4.hashCode());
        System.out.println(s5 +" hashcode= "+s5.hashCode());
        System.out.println(s4 == s3); // false (Different references)

        System.out.println(s3 +" hashcode= "+s3.hashCode());
        s3 = "bye";
        System.out.println(s3 +" hashcode= "+s3.hashCode());
        s3 = "Hello";
        System.out.println(s3 +" hashcode= "+s3.hashCode());

    }
}
