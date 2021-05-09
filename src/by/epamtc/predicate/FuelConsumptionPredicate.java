package by.epamtc.predicate;

import by.epamtc.plane.BasePlane;

import java.util.function.Predicate;

public class FuelConsumptionPredicate implements Predicate<BasePlane> {
    private int min;
    private int max;

    public FuelConsumptionPredicate(int min, int max) {
        this.max = max;
        this.min = min;
    }

    @Override
    public boolean test(BasePlane plane) {
        return min <= plane.getEngine().getHourlyFuelConsumption()
                && plane.getEngine().getHourlyFuelConsumption() <= max;
    }
}
