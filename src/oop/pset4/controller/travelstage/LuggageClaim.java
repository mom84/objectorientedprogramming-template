package oop.pset4.controller.travelstage;

import oop.pset4.model.Luggage;

import java.time.Duration;
import java.time.LocalDateTime;

public class LuggageClaim implements TravelStage {

    @Override
    public Luggage process(Luggage luggage) {
        // TODO add 15 minutes to the processing time
        Duration waitingDuration = luggage.getWaitingDuration();
        Duration ProcessTime = waitingDuration.plusMinutes(15);
        luggage.setWaitingDuration(ProcessTime);

        return luggage;
    }
}
