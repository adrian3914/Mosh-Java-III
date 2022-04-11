package ca.adrian.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show(){
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
            System.out.println("File opened.");
        } catch (IOException | ParseException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
