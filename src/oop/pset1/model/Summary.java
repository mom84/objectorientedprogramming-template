package oop.pset1.model;

import java.util.List;

public class Summary {

    private List<String> topRatedMovies;

    private List<String> topGenresMovies;

    private List<String> topHiredActors;

    private List<String> numberActorsFemaleRatio;

    private List<String> numberActorsMaleRatio;


    public void setTopRatedMovies(List<String> topRatedMovies) {
        this.topRatedMovies = topRatedMovies;
    }

    public void setTopHiredActors(List<String> topHiredActors) {
        this.topHiredActors = topHiredActors;
    }

    public void setTopGenresMovies(List<String> topGenresMovies) {
        this.topGenresMovies = topGenresMovies;
    }

    public List<String> getTopRatedMovies() {
        return topRatedMovies;
    }

    public List<String> getTopHiredActors() {
        return topHiredActors;
    }

    public List<String> getTopGenresMovies() {
        return topGenresMovies;
    }

    public void setNumberActorsMaleRatio(List<String> numberActorsMaleRatio) {
        this.numberActorsMaleRatio = numberActorsMaleRatio;
    }

    public List<String> getNumberActorsMaleRatio() {
        return numberActorsMaleRatio;
    }

    public void setNumberActorsFemaleRatio(List<String> numberActorsFemaleRatio) {
        this.numberActorsFemaleRatio = numberActorsFemaleRatio;
    }

    public List<String> getNumberActorsFemaleRatio() {
        return numberActorsFemaleRatio;
    }
}
