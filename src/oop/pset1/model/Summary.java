package oop.pset1.model;

import java.util.List;

public class Summary {

    private List<String> topRatedMovies;

    private List<String> topGenresMovies;

    private List<String> topHiredActors;

    private List<String> FemaleActorsRatio;

    private List<String> MaleActorsRatio;


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

    public void setActorsMaleRatio(List<String> numberActorsMaleRatio) {
        this.MaleActorsRatio = numberActorsMaleRatio;
    }

    public List<String> getActorsMaleRatio() {
        return MaleActorsRatio;
    }

    public void setActorsFemaleRatio(List<String> numberActorsFemaleRatio) {
        this.FemaleActorsRatio = numberActorsFemaleRatio;
    }

    public List<String> getActorsFemaleRatio() {
        return FemaleActorsRatio;
    }
}
