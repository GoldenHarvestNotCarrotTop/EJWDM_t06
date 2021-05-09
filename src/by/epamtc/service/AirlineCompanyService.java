package by.epamtc.service;

import by.epamtc.AirlineCompany;

import java.util.concurrent.ThreadLocalRandom;

public class AirlineCompanyService {
    private static final int companyPlanesCount = 30;

    public static AirlineCompany generateRandomAirlineCompany() {
        AirlineCompany airlineCompany = new AirlineCompany();
        for (int i = 0; i < companyPlanesCount; i++) {
            int r = ThreadLocalRandom.current().nextInt(2);
            switch (r) {
                case 0:
                    airlineCompany.addPlane(PlaneService.generateRandomPassengerPlane());
                    break;
                case 1:
                    airlineCompany.addPlane(PlaneService.generateRandomCargoPlane());
                    break;
            }
        }
        return airlineCompany;
    }
}
