package ca.adrian.generics;

public class User implements Comparable<User>{
    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User other) {
        // this < o -> -#
        // this == o -> 0
        // this > o -> +#
       return this.points - other.points;
    }

    @Override
    public String toString() {
        return "points=" + points;
    }
}
