package ca.adrian;

import ca.adrian.exceptions.Account;
import ca.adrian.exceptions.AccountException;

public class Main {

    public static void main(String[] args) {
       var account = new Account();

        try {
            account.withDraw(10);
        } catch (AccountException e) {
            e.printStackTrace();
            var cause  = e.getCause().getMessage();
            System.out.println(cause);
        }
    }
}

/*

 */
