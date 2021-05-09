package by.epamtc.service;

import by.epamtc.AirlineCompany;
import by.epamtc.exception.NullPlaneException;

import java.util.concurrent.ThreadLocalRandom;

public class AirlineCompanyService {
    private static final int companyPlanesCount = 30;

    public static AirlineCompany generateRandomAirlineCompany() {
        AirlineCompany airlineCompany = new AirlineCompany();
        for (int i = 0; i < companyPlanesCount; i++) {
            int r = ThreadLocalRandom.current().nextInt(2);
            switch (r) {
                case 0:
                    try {
                        airlineCompany.addPlane(PlaneService.generateRandomPassengerPlane());
                    } catch (NullPlaneException e) {
                        continue;
                    }
                    break;
                case 1:
                    try {
                        airlineCompany.addPlane(PlaneService.generateRandomCargoPlane());
                    } catch (NullPlaneException e) {
                        continue;
                    }
                    break;
            }
        }
        return airlineCompany;
    }
}
