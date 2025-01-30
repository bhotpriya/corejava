public class ConstructorChaining{

    String brand;
    int ram;
    double price;

    // Constructor 1
    ConstructorChaining() {
        //before this we can not add any Systems.out.print
        this("Unknown"); // Calls Constructor 2
        System.out.println("No-argument constructor called");
    }

    // Constructor 2
    ConstructorChaining(String brand) {
        this(brand, 8, 500.0); // Calls Constructor 3
        System.out.println("One-argument constructor called");
    }

    // Constructor 3 //
    ConstructorChaining(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
        System.out.println("Three-argument constructor called");
    }

    void display() {
        System.out.println("Brand: " + brand + ", RAM: " + ram + "GB, Price: $" + price);
    }

    public static void main(String[] args) {
        ConstructorChaining constructorChaining = new ConstructorChaining();
        constructorChaining.display();
    }
}
