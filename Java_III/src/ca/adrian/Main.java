package ca.adrian;

import ca.adrian.exceptions.Account;
import ca.adrian.exceptions.ExceptionsDemo;
import ca.adrian.exceptions.InsufficientFundsException;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       var account = new Account();

        try {
            account.withDraw(10);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
