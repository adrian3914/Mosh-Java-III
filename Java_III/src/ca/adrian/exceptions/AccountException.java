package ca.adrian.exceptions;
// Checked Exception -> extends Exception

public class AccountException extends Exception{
    public AccountException(Exception cause) {
        super(cause);
    }
}
