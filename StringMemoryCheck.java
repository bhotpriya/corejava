public class StringMemoryCheck {
    public static void main(String[] args) {
        String s1 = "Java";  // String Pool
        String s2 = "Java";  // Reuses Pool Object
        String s3 = new String("Java");  // Heap
        String s4 = s3.intern();  // Moves reference to String constant Pool

        System.out.println(s1 == s2); // true  (Both in String Pool)
        System.out.println(s1 == s3); // false (Heap vs Pool)
        System.out.println(s1 == s4); // true as s4 moves to string constant pool

        System.out.println("s1: " + System.identityHashCode(s1));
        System.out.println("s2: " + System.identityHashCode(s2)); // Same as s1
        System.out.println("s3: " + System.identityHashCode(s3)); // Different (Heap)
        System.out.println("s4: " + System.identityHashCode(s4)); // Same as s1
    }
}
