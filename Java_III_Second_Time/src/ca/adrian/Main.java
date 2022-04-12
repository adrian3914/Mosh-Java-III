package ca.adrian;

import ca.adrian.generics.User;

public class Main {
    public static void main(String[] args) {
       var user1 = new User(20);
       var user2 = new User(40);

       var result = user1.compareTo(user2);

       if (result < 0)
           System.out.println("User1 < User2");
       else if (result == 0)
           System.out.println("User1 == User2");
       else
           System.out.println("User1 > User2");
    }
}
