
public class StaticBlockTest {
    // static variable
    static int value;
    static {
        //Static Block - Runs once when class is loaded
        System.out.println("Static1 block executed");
        value = 100;
        try {
            int result = 10 / 0; // ArithmeticException (unchecked)
        } catch (Exception e) {
            System.out.println("Exception caught in static block: " + e.getMessage());
        }
    }
    static {
        System.out.println("Static Block 2");
    }
    public static void main(String[] args) {
        int i = 10;
        System.out.println("main method executed");
        System.out.println("Value: " + value);
       // it will call instance initialliser
        StaticBlockTest obj1 = new StaticBlockTest();
    }
}
