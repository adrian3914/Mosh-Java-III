package ca.adrian.exceptions;

// Check -> Exception
// Unchecked (Runtime) -> RunTimeException

public class InsufficientFundsException extends Exception {

    // Constructors
    public InsufficientFundsException(){
        // calling the parent Exception constructor
        super("Insufficient funds in your account.");
    }

    public InsufficientFundsException(String message){
        // calling the parent Exception constructor
        super(message);
    }
}
