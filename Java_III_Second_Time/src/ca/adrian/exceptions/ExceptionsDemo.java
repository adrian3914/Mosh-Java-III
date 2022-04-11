package ca.adrian.exceptions;

import java.io.IOException;

public class ExceptionsDemo {
    public static void show() throws IOException {
       var account = new Account();
        try {
            account.withdraw(10);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }

}
