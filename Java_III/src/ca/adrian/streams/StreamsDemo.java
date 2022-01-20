package ca.adrian.streams;

import java.util.List;

public class StreamsDemo {
    public static void show(){

        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)

        );

        // Imperative Programming -> how something should be done
        int count = 0;
        for (var movie: movies)
            if (movie.getLikes() > 10)
                count++;

        // Declarative (Functional )Programming What should be done
        // Stream is a pipe from collection, all collection has .stream()
        var count2 = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .count();

    }
}
