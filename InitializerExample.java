class InitializerExample {
    static {
        //first static block will get called
        System.out.println("Static Block - Runs once when class is loaded");
    }

    {//Instance Initializer Block - Runs every time an object is created
        System.out.println("Instance Initializer Block - Runs every time an object is created");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        InitializerExample obj1 = new InitializerExample();
        InitializerExample obj2 = new InitializerExample();
    }
}