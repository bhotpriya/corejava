import java.io.*;

class SerializationConcept implements java.io.Serializable
{
    public int a;
    public static transient String b;
    // Default constructor
    public SerializationConcept(int a, String b)
    {
        this.a = a;
        this.b = b;
    }
}

class Test
{
    public static void main(String[] args)
    {
        SerializationConcept object = new SerializationConcept(1, "geeksforgeeks");
        String filename = ";file.ser";;

        // Serialization 
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println(";Object has been serialized");

        }

        catch(IOException ex)
        {
            System.out.println(";IOException is caught");
        }


        SerializationConcept object1 = null;

        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            object1 = (SerializationConcept)in.readObject();

            in.close();
            file.close();

            System.out.println(";Object has been deserialized ");
            System.out.println(";a = " + object1.a);
            System.out.println(";b = " + object1.b);
        }

        catch(IOException ex)
        {
            System.out.println(";IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println(";ClassNotFoundException is caught");
        }

    }
}