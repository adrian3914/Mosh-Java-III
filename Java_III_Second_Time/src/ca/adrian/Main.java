package ca.adrian;

import ca.adrian.generics.User;
import ca.adrian.generics.Utils;

public class Main {
    public static void main(String[] args) {
        var max = Utils.max(new User(10), new User(20));
        System.out.println(max);
    }


}
