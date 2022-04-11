package ca.adrian.exceptions;

import java.io.IOException;

public class ExceptionsDemo {
    public static void show() throws IOException {
       var account = new Account();
        try {
            account.deposit(-1);
        } catch (IOException e) {
            System.out.println("Logging");
            throw e;
        }
    }

}
