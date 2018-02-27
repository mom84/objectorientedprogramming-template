package oop.pset1.parser;

import java.io.IOException;

import oop.pset1.model.Actor;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ActorParser {
    public List<Actor> getActors() {
        String filePath = "src/oop/pset1/data/actors.csv";
        try {
            Stream<String> lines = Files.lines(Paths.get(filePath));
            return lines.skip(1)
                    .map(line -> line.split(";"))
                    .filter(column -> column.length == 3)
                    .filter(field -> field != null)
                    .map(toActor())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private Function<String[], Actor> toActor() {
        return columns -> {
            Actor actor = new Actor();
            actor.setMostHiredActors(toRealActor(columns[0]));
            actor.setActorsMaleFemaleRatio(toGender(columns[0]));
            return actor;
        };
    }

    private List<String> toRealActor(String column) {
        String objects = column.replaceAll("\\[", "").replaceAll("]", "");
        objects = objects.replaceAll("\\{", "").replaceAll("}", "");
        objects = objects.replaceAll("'", "");

        String[] words = objects.split(", ");
        return Stream.of(words)
                .filter(word -> word.contains("name:"))
                .map(word -> word.split(": "))
                .filter(word -> word != null)
                .map(word -> word[1])
                .collect(Collectors.toList());

    }
    private List<String> toGender(String column) {
        String objects = column.replaceAll("\\[", "").replaceAll("]", "");
        objects = objects.replaceAll("\\{", "").replaceAll("}", "");
        objects = objects.replaceAll("'", "");

        String[] words = objects.split(", ");
        return Stream.of(words)
                .filter(word -> word.contains("gender:"))
                .map(word -> word.split(": "))
                .filter(word -> word != null)
                .map(word -> word[1])
                //.peek(e-> System.out.println(e))
                .collect(Collectors.toList());
    }
}