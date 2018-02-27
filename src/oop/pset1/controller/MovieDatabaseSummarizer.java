package oop.pset1.controller;
import oop.pset1.model.Actor;
import oop.pset1.model.Movie;
import oop.pset1.model.Summary;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieDatabaseSummarizer {

    public Summary summarize(List<Movie> movies,List<Actor> actors) {

        // The 5 most rated films (top to bottom)
        List<String> topRatedMovie = movies.stream()

                .sorted((e1, e2) -> e2.getRating().compareTo(e1.getRating()))
                .limit(5)
                .map(e -> e.getName() + " (" + e.getRating() + ")")
                .collect(Collectors.toList());


        ////////////////////////////////////////////////////////////////////////

        // The 2 most appearing movie genres (top to bottom)
        Map<String, Long> appearances = movies.stream()
                .filter(e -> e.getGenre().size() != 0)
                .map(movie -> movie.getGenre())
                .flatMap(movieList -> movieList.stream())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        List<String> topGenresMovies = appearances.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(2)
                .map(e -> e.getKey() + " " + e.getValue() + " times")
                .collect(Collectors.toList());


        ////////////////////////////////////////////////////////////////////////////////
        //The 5 most hired actors (top to bottom)
        Map<String, Long> appearances1 = actors.stream()
                .map(actor -> actor.getMostHiredActors())
                .flatMap(hierd -> hierd.stream())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));


        List<String> mostHiredActor = appearances1.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(e -> e.getKey() + " " +"("+ e.getValue()+")")
                .collect(Collectors.toList());

        ////////////////////////////////////////////////////////////////////////////////
        //The % of male-female ratio (biggest % smallest)
        Map<Object, Long> percentOfFemale = actors.stream()
                .map(actor -> actor.getActorsMaleFemaleRatio())
                .flatMap(hierd -> hierd.stream())
                .filter(num ->num.contains("2"))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        List<String> percentFemale = percentOfFemale.entrySet().stream()
                .map(e -> "Female" + " " +"("+ (Float.parseFloat(String.valueOf(e.getValue()))/150105)*100+")%")
                .collect(Collectors.toList());


        Map<Object, Long> percentOfMale = actors.stream()
                .map(actor -> actor.getActorsMaleFemaleRatio())
                .flatMap(hierd -> hierd.stream())
                .filter(num ->num.contains("1"))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        List<String> percentMale = percentOfMale.entrySet().stream()
                .map(e -> "Male" + " " +"("+ (Float.parseFloat(String.valueOf(e.getValue()))/150105)*100+")%")
                .collect(Collectors.toList());


        Summary summary = new Summary();
        summary.setTopRatedMovies(topRatedMovie);
        summary.setTopGenresMovies(topGenresMovies);
        summary.setTopHiredActors(mostHiredActor);
        summary.setNumberActorsFemaleRatio(percentFemale);
        summary.setNumberActorsMaleRatio(percentMale);

        return summary;
    }

}
