package by.epamtc.service;

import by.epamtc.exception.NullCrewException;
import by.epamtc.plane.BasePlane;
import by.epamtc.plane.CargoPlane;
import by.epamtc.plane.PassengerPlane;
import by.epamtc.plane.component.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PlaneService {
    static double maxRandomDouble = 10000;
    static int maxRandomInt = 1000;

    static int randomNameLength = 10;

    private static double randomDouble() {
        return ThreadLocalRandom.current().nextDouble() * maxRandomDouble;
    }

    private static int randomInt() {
        return ThreadLocalRandom.current().nextInt(maxRandomInt);
    }

    public static CargoPlane generateRandomCargoPlane() {
        CargoPlane plane = new CargoPlane();
        configureRandomBasePlane(plane);

        plane.setCargoCapacity(randomDouble());
        return plane;
    }

    public static PassengerPlane generateRandomPassengerPlane() {
        PassengerPlane plane = new PassengerPlane();
        configureRandomBasePlane(plane);

        plane.setNumberOfBusinessPassengerSeats(randomInt());
        plane.setNumberOfEconomyPassengerSeats(randomInt());

        plane.setInteriorWidth(randomDouble());
        plane.setLuggageCapacity(randomDouble());

        return plane;
    }

    private static void configureRandomBasePlane(BasePlane plane) {
        plane.setName(randomString());
        plane.setId(randomInt());
        plane.setManufactureYear(randomInt());
        plane.setMaxLoad(randomDouble());
        plane.setFuelTankCapacity(randomDouble());
        plane.setWeight(randomDouble());

        plane.setEngine(generateRandomEngine());
        plane.setDimensions(generateRandomDimensions());
        plane.setCrew(generateRandomCrew());
    }

    private static String randomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = randomNameLength;
        Random random = ThreadLocalRandom.current();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }

    private static Post randomPost() {
        int x = ThreadLocalRandom.current().nextInt(Post.class.getEnumConstants().length);
        return Post.class.getEnumConstants()[x];
    }

    private static Person generateRandomPerson() {
        Person person = new Person(randomString(), randomInt(), randomInt(), randomPost());
        return person;
    }

    private static Crew generateRandomCrew() {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < randomInt(6); i++) {
                personList.add(generateRandomPerson());
        }
        return new Crew(personList);
    }

    private static int randomInt(int bound) {
        return ThreadLocalRandom.current().nextInt(0, bound);
    }

    private static Engine generateRandomEngine() {
        Engine engine = new Engine(randomDouble(),
                randomDouble(),
                randomDouble()
        );
        return engine;
    }

    private static Dimensions generateRandomDimensions() {
        Dimensions dimensions = new Dimensions(randomDouble(), randomDouble(), randomDouble());
        return dimensions;
    }

}
