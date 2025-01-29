public class StringImmutability {

    public static void main(String[] args) {
        String password = "password@123"; // create ref in string constant pool
        System.out.println(password); // It will print password@123

        System.out.println(password.hashCode());

        password = "changepassword"; // create new ref in string constant pool
        System.out.println(password); // It will print changepassword ,
        // But original "password@123" still in String Constant Pool
        System.out.println(password.hashCode());



    }
}
