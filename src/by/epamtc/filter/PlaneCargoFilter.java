package by.epamtc.filter;

import by.epamtc.plane.BasePlane;
import by.epamtc.plane.CargoPlane;

import java.util.function.Predicate;

public class PlaneCargoFilter implements Predicate<BasePlane> {

    @Override
    public boolean test(BasePlane plane) {
        return plane instanceof CargoPlane;
    }
}
