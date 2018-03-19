package oop.pset4.controller.travelstage;

import oop.pset4.model.Luggage;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Flight implements TravelStage {

    @Override
    public Luggage process(Luggage luggage) {
        // TODO add travel duration to the processing time
        Duration flightDuration = luggage.getFlightDuration();

        Duration ProcessTime = luggage.getWaitingDuration();

        Duration ProcessTime2 = ProcessTime.plus(flightDuration);
        luggage.setWaitingDuration(ProcessTime2);

        // Update arrival time
        LocalDateTime departureTime = luggage.getDepartureTime();
        LocalDateTime plus = departureTime.plus(flightDuration);
        luggage.setArrivalTime(plus);



        return luggage;
    }
}
