package by.epamtc.predicate;

import by.epamtc.plane.BasePlane;
import by.epamtc.plane.CargoPlane;

import java.util.function.Predicate;

public class CargoPlanePredicate implements Predicate<BasePlane> {
    @Override
    public boolean test(BasePlane plane) {
        return plane instanceof CargoPlane;
    }
}
