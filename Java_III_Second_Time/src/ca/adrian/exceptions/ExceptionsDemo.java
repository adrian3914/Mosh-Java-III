package ca.adrian.exceptions;

import java.io.IOException;

public class ExceptionsDemo {
    public static void show() throws IOException {
       var account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
