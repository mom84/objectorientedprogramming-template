package oop.pset3.controller;

import oop.pset3.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Moves {

    private List<Move> moves;

        Moves() {
        moves = Stream.of(
                new Paper(),
                new Rock(),
                new Scissors(),
                new Spock(),
                new Lizard()
        ).collect(Collectors.toList());
    }

    public List<Move> getMoves() {

        return new ArrayList<>(moves);
    }
}
