package oop.pset3.model;

public class Paper implements Move {

    @Override
    public String getName() {
        return "Paper";
    }

    @Override
    public boolean wins(Move move) {

        return move.getClass() == Rock.class || move.getClass() == Spock.class;
    }
}
