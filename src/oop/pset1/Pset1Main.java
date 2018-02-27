package oop.pset1;
import oop.pset1.controller.MovieDatabaseSummarizer;
import oop.pset1.model.Actor;
import oop.pset1.model.Movie;
import oop.pset1.model.Summary;
import oop.pset1.parser.ActorParser;
import oop.pset1.parser.MovieParser;
import oop.pset1.view.SummaryDisplayer;
import java.util.List;

public class Pset1Main {

    public static void main(String[] args) {

        MovieParser parserMovie = new MovieParser();
        List<Movie> movies = parserMovie.getMovies();

        ActorParser parserActor = new ActorParser();
        List<Actor> actors = parserActor.getActors();


        MovieDatabaseSummarizer summarizer = new MovieDatabaseSummarizer();
        SummaryDisplayer displayer = new SummaryDisplayer();

        Summary summary = summarizer.summarize(movies , actors);

           displayer.display(summary);

        }


    }

