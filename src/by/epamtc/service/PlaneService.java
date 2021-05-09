package by.epamtc.service;

import by.epamtc.plane.BasePlane;
import by.epamtc.plane.CargoPlane;
import by.epamtc.plane.PassengerPlane;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PlaneService {
    static double maxRandomDouble = 10000;
    static int maxRandomInt = 1000;

    public static CargoPlane generateRandomCargoPlane() {
        Random random = ThreadLocalRandom.current();
        CargoPlane plane = new CargoPlane();
        configureRandomBasePlane(plane);

        plane.setCargoCapacity(random.nextDouble() * maxRandomDouble);
        return plane;
    }

    public static PassengerPlane generateRandomPassengerPlane() {
        Random random = ThreadLocalRandom.current();
        PassengerPlane plane = new PassengerPlane();
        configureRandomBasePlane(plane);

        plane.setNumberOfBusinessPassengerSeats(random.nextInt(maxRandomInt));
        plane.setNumberOfEconomyPassengerSeats(random.nextInt(maxRandomInt));

        plane.setInteriorWidth(random.nextDouble() * maxRandomDouble);
        plane.setLuggageCapacity(random.nextDouble() * maxRandomDouble);

        return plane;
    }

    private static void configureRandomBasePlane(BasePlane plane) {
        Random random = ThreadLocalRandom.current();

        plane.setId(random.nextInt(1000000));
        plane.setManufactureYear(random.nextInt(maxRandomInt));
        plane.setLength(random.nextDouble() * maxRandomDouble);
        plane.setWingspan(random.nextDouble() * maxRandomDouble);
        plane.setWingArea(random.nextDouble() * maxRandomDouble);
        plane.setMaxTakeOffWeight(random.nextDouble() * maxRandomDouble);
        plane.setMaxLandingWeight(random.nextDouble() * maxRandomDouble);
        plane.setEmptyWeight(random.nextDouble() * maxRandomDouble);
        plane.setMaxWeightWithoutFuel(random.nextDouble() * maxRandomDouble);
        plane.setMaxLoad(random.nextDouble() * maxRandomDouble);
        plane.setFlightRangeWithMaxLoad(random.nextDouble() * maxRandomDouble);
        plane.setMaxCruisingSpeed(random.nextDouble() * maxRandomDouble);
        plane.setMaxFlightAltitude(random.nextDouble() * maxRandomDouble);
        plane.setRunUpLength(random.nextDouble() * maxRandomDouble);
        plane.setSpecificFuelConsumption(random.nextDouble() * maxRandomDouble);
        plane.setHourlyFuelConsumption(random.nextDouble() * maxRandomDouble);
        plane.setFuelTankCapacity(random.nextDouble() * maxRandomDouble);
        plane.setNumberOfPilots(random.nextInt(maxRandomInt));
        plane.setPrice(random.nextLong());
    }

}
