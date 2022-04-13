package ca.adrian;

import ca.adrian.generics.GenericList;
import ca.adrian.generics.Instructor;
import ca.adrian.generics.User;
import ca.adrian.generics.Utils;

public class Main {
    public static void main(String[] args) {
        var users = new GenericList<User>();
        Utils.printUsers(users);
    }


}
