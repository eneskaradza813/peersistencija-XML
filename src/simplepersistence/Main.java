package simplepersistence;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        /*Person person = new Person("John Dee", 33, "022-345");
        FileOutputStream fos = new FileOutputStream("MyPerson");
        
        XMLEncoder s = new XMLEncoder(fos);
        
        s.writeObject(person);
        s.close();*/
        
        FileInputStream fis = new FileInputStream("MyPerson");
        XMLDecoder decoder = new XMLDecoder(fis);
        
        Person person = (Person)decoder.readObject();
        System.out.println(person);
    }

}
