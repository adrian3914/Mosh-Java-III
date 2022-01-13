package ca.adrian.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {

    public static void show() throws IOException{
        var account  = new Account();
        try {
            account.deposit(-1);
        } catch (IOException e) {
            System.out.println("Logging");
            throw e;
        }
    }

    public static void showHandlingEx(){

        try (
                var reader = new FileReader("hello.txt");
                var writer = new FileWriter("...")
        ){
            var value  = reader.read();
            new SimpleDateFormat().parse("");
        }
        catch (IOException | ParseException e) {
            System.out.println("Could not read data.");
        }
    }
}
