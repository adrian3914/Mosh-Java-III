package ca.adrian.streams;

import java.util.Comparator;
import java.util.List;


public class StreamsDemo {
    public static void show(){
        // list of movies -> list of movie Titles
        List<Movie> movies = List.of(
                new Movie("b", 10),
                new Movie("a", 15),
                new Movie("c", 30)

        );

        // getting a stream
        movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle).reversed())
                .forEach(m -> System.out.println(m.getTitle()));

    }
}

/*
    // STREAMS

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

 */

/*
    // CREATING STREAMS
        // Collections
        Collection<Integer> x = List.of(1, 2, 3);
        x.stream();

        // Arrays
        int[] numbers = {1, 2, 3};
        Arrays.stream(numbers)
                .forEach(n -> System.out.println(n));

        // Arbitrary numbers of objects
        Stream.of(1, 2, 3, 4)
                .count();

        // Infinitive Streams
        var stream  = Stream.generate(() -> Math.random()); // Lazy Evaluation nothing is generated until is called
        stream
                .limit(3) // prevent to be an infinitive loop
                .forEach(n -> System.out.println(n));

        // iterate()
        Stream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> System.out.println(n));
 */

/*
        // MAPPING ELEMENTS
          List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)

        );
         // map()
        movies.stream()
                .map(movie -> movie.getTitle())
                .forEach(movie -> System.out.println(movie));

        // flatMap()
        // Stream<List<x>> -> Stream<x>
        var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        stream
                .flatMap(list -> list.stream())
                .forEach(n -> System.out.println(n));
 */

/*
        // FILTERING   -> -> this does not affect our water Tank List<Movie> only add a pipe
        Predicate<Movie> isPopular = m -> m.getLikes() > 10;
        movies.stream()
                .filter(isPopular)
                .forEach(movie -> System.out.println(movie));

        // SLICING
         // Slicing a stream
        movies.stream()
                .takeWhile( m -> m.getLikes() < 30)
                .forEach(m -> System.out.println(m.getTitle()));
 */


