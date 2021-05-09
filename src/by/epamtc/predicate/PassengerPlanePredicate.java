package by.epamtc.predicate;

import by.epamtc.plane.BasePlane;
import by.epamtc.plane.PassengerPlane;

import java.util.function.Predicate;

public class PassengerPlanePredicate implements Predicate<BasePlane> {
    @Override
    public boolean test(BasePlane plane) {
        return plane instanceof PassengerPlane;
    }
}
