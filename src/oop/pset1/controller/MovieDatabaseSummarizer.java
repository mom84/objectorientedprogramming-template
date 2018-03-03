package oop.pset1.controller;
import oop.pset1.model.Actor;
import oop.pset1.model.Movie;
import oop.pset1.model.Summary;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;

public class MovieDatabaseSummarizer {

    public Summary summarize(List<Movie> movies , List<Actor> actors) {

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
                .collect(Collectors.groupingBy(e -> e, counting()));

        List<String> topGenresMovies = appearances.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(2)
                .map(e -> e.getKey() + " " + e.getValue() + " times")
                .collect(Collectors.toList());


        ////////////////////////////////////////////////////////////////////////////////
        //The 5 most hired actors (top to bottom)
        Map<String, Long> actorsAppearances = actors.stream()
                .filter(e -> e.getActorsNames().size() != 0)
                .map(movie -> movie.getActorsNames())
                .flatMap(ActorList -> ActorList.stream())
                .collect(Collectors.groupingBy(e -> e, counting()));

        List<String> topHiredactors = actorsAppearances.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(e -> e.getKey() + " " + e.getValue() + " times")
                .collect(Collectors.toList());




        ////////////////////////////////////////////////////////////////////////////////
        //The % of male-female ratio (biggest % smallest)
        Map<String, Long> percentOfFemale = actors.stream()
                .map(actor -> actor.getActorGender())
                .flatMap(genderMale -> genderMale.stream())
                .filter(num ->num.contains("2"))
                .collect(Collectors.groupingBy(e -> e, counting()));



        Map<String, Long> percentOfMale = actors.stream()
                .map(actor -> actor.getActorGender())
                .flatMap(genderFemale -> genderFemale.stream())
                .filter(num ->num.contains("1"))
                .collect(Collectors.groupingBy(e -> e, counting()));



       Integer CountOfMale =  percentOfMale.entrySet().stream()
                .mapToInt(e -> Math.toIntExact(e.getValue()))
                .sum();

       Integer CountOfFemale =  percentOfFemale.entrySet().stream()
                .mapToInt(e -> Math.toIntExact(e.getValue()))
                .sum();

       Integer totalMaleAndFemale = CountOfMale + CountOfFemale;
       System.out.println(totalMaleAndFemale);

        List<String> percentMale = percentOfMale.entrySet().stream()
                .map(e -> "Male" + " " +"("+ (Float.parseFloat(String.valueOf(e.getValue()))/totalMaleAndFemale*100)+")%")
                .collect(Collectors.toList());

        List<String> percentFemale = percentOfFemale.entrySet().stream()
                .map(e -> "Female" + " " + "(" + (Float.parseFloat(String.valueOf(e.getValue()))/totalMaleAndFemale*100) + ")%")
                .collect(Collectors.toList());




        Summary summary = new Summary();
        summary.setTopRatedMovies(topRatedMovie);
        summary.setTopGenresMovies(topGenresMovies);
        summary.setTopHiredActors(topHiredactors);
        summary.setActorsFemaleRatio(percentFemale);
        summary.setActorsMaleRatio(percentMale);

        return summary;
    }

}
