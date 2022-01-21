package ca.adrian.streams;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StreamsDemo {
    public static void show(){
        // COLLECTORS Stream<T> -> collect -> List, Queue,  Map
        // list of movies -> list of movie Titles
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        // Set<Movie>
        var set = movies.stream()
                .filter(m -> m.getLikes() < 30)
                .collect(Collectors.toSet());

        // List<Movie>
        var list = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.toList());

        // Map<K, V>
        // Key: title, value: Movie Object
        var map = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.toMap(Movie::getTitle, Function.identity())); // this will return the movie object as the value m -> m

        // Collectors Class that implements Collector Interface, sum
        var sumOfLikes = movies.stream()
                .filter(m -> m.getLikes() > 10)
                        .collect(Collectors.summingInt(Movie::getLikes));

        // Statistics using summarizing
        var statistics = movies.stream()
                .filter( m -> m.getLikes() > 10)
                .collect(Collectors.summarizingInt(m -> m.getLikes()));

        // Joining Values
        var joiningValues = movies.stream()
                        .map(m -> m.getTitle())
                        .collect(Collectors.joining(", "));

        System.out.println(joiningValues);
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

/*
     // SORTING
      List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)

        );
     // getting a stream
        movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle).reversed())
                .forEach(m -> System.out.println(m.getTitle()));
 */

/*

    // GETTING UNIQUE VALUES WITH DISTINCT()
        movies.stream()
                .map(Movie::getLikes)
                .distinct()
                .forEach(System.out::println);
 */

/*
        // PEEK -> good for trouble shouting problems
        // list of movies -> list of movie Titles
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 30)
        );

        movies.stream()
                .filter( m -> m.getLikes() > 10)
                .peek(m -> System.out.println("Filtered:" + m.getLikes()))
                .map(Movie::getTitle)
                .peek(t -> System.out.println("Mapped:" + t))
                .forEach(System.out::println);
 */

/*
     // SIMPLE REDUCERS stream<T> -> single Obj
        // list of movies -> list of movie Titles
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 30)
        );

        // count
       var count = movies.stream()
               .count();
        System.out.println("Total movies: " + count);

       var anyMatch = movies.stream()
                       .anyMatch(m -> m.getLikes() > 20);
        System.out.println("Any movie likes > 20: " + anyMatch);

       var allMatch = movies.stream()
                       .allMatch(m -> m.getLikes() > 20);
        System.out.println("All movie likes > 20: " + allMatch);

        var firstMovie = movies.stream()
                .findFirst()
                .get();
        System.out.println("First Movie: " + firstMovie);

        var any = movies.stream()
                .findAny()
                .get();
        System.out.println("Any Movie: " + any);

        var max = movies.stream()
                .max(Comparator.comparing(movie -> movie.getTitle()))
                .get();
        System.out.println("Max: " + max);

        var min = movies.stream()
                .min(Comparator.comparing(movie -> movie.getTitle()))
                .get();
        System.out.println("Min: " + min);

    }
 */

/*
     // Reducing an stream with more control
        // list of movies -> list of movie Titles
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        // map -> [10, 20, 30]
        // reduce -> [30, 30]
        // reduce -> 60

        Integer sum = movies.stream()
                .map( m -> m.getLikes())
                .reduce(0, Integer::sum);

        System.out.println(sum);
 */


