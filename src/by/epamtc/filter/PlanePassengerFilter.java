package by.epamtc.filter;

import by.epamtc.plane.BasePlane;
import by.epamtc.plane.PassengerPlane;

import java.util.function.Predicate;

public class PlanePassengerFilter implements Predicate<BasePlane> {

    @Override
    public boolean test(BasePlane plane) {
        return plane instanceof PassengerPlane;
    }
}
