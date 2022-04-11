package ca.adrian.exceptions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ExceptionsDemo {
    public static void show(){
        try (
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("...");
        ){
            var value = reader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
