package ca.adrian.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {
    public static void show(){
        try {
            var reader = new FileReader("file.txt");
            System.out.println("File opened.");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
