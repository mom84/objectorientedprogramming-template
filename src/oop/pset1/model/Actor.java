package oop.pset1.model;
import java.util.List;

public class Actor {

        private List<String> mostHiredActors;
        private List<String> ActorsMaleFemaleRatio ;

        @Override
        public String toString() {
            return "Actor{" +
                    "mostHiredActors=" + mostHiredActors +
                    ", ActorsMaleFemaleRatio=" + ActorsMaleFemaleRatio +
                    '}';
        }

        public void setMostHiredActors(List<String> mostHiredActors) {
            this.mostHiredActors = mostHiredActors;
        }

        public void setActorsMaleFemaleRatio(List<String> actorsMaleFemaleRatio) {
            ActorsMaleFemaleRatio = actorsMaleFemaleRatio;
        }

        public List<String> getMostHiredActors() {

            return mostHiredActors;
        }

        public List<String> getActorsMaleFemaleRatio() {
            return ActorsMaleFemaleRatio;
        }
}


