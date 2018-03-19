package oop.pset4.controller.travelstage;
import oop.pset4.model.Luggage;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class StorageArea implements TravelStage {

    @Override
    public Luggage process(Luggage luggage) {
        // TODO add as much duration to the pro
        // cessing time as the departure time minus 30 minutes
        LocalDateTime departureTime = luggage.getDepartureTime();
        LocalDateTime dropOffTime = luggage.getDropOffTime();

        Duration processTime = Duration.between(departureTime, dropOffTime).abs();
       if(processTime.toMinutes() > 30){
           luggage.setWaitingDuration(processTime.minusMinutes(30));

       }

           return luggage;
    }
}
