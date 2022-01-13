package ca.adrian.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {

    public static void show(){
        try {
            var reader = new FileReader("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
