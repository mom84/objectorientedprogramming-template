package oop.pset1.model;
import java.util.List;

public class Actor {

        private List<String> Actorsnames;
        private List<String> ActorGender;

        @Override
        public String toString() {
            return "Actor{" +
                    "mostHiredActors=" + Actorsnames +
                    ", ActorsMaleFemaleRatio=" + ActorGender +
                    '}';
        }

        public void setMostHiredActors(List<String> mostHiredActors) {
            this.Actorsnames = mostHiredActors;
        }

        public void setActorsMaleFemaleRatio(List<String> actorsMaleFemaleRatio) {
            ActorGender = actorsMaleFemaleRatio;
        }

        public List<String> getActorsNames() {

            return Actorsnames;
        }

        public List<String> getActorsMaleFemaleRatio() {
            return ActorGender;
        }
}