package oop.pset1.view;

import oop.pset1.model.Summary;

public class SummaryDisplayer {


    public void display(Summary summary) {

        // The 5 most rated films (top to bottom):
        System.out.println("The 5 most rated films (top to bottom):");
        summary.getTopRatedMovies()
                .forEach(movie -> System.out.println(movie));

        System.out.println("-----------------");

         //The 2 most appearing movie genres (top to bottom):
         System.out.println("The 2 most appearing movie genres (top to bottom): ");
         summary.getTopGenresMovies()
               .forEach(word -> System.out.println(word));

        System.out.println("-----------------");



        // The 5 most hired actors (top to bottom)
        System.out.println("The 5 most hired actors (top to bottom)");
        summary.getTopHiredActors()
               .forEach(names -> System.out.println(names));

        System.out.println("-----------------");
       // The % of male-female ratio (biggest % smallest)
        System.out.println("The % of male-female ratio (biggest % smallest)");

        summary.getNumberActorsMaleRatio()
                .forEach(Male -> System.out.println(Male));

        summary.getNumberActorsFemaleRatio()
                .forEach(Female -> System.out.println(Female));

    }
}