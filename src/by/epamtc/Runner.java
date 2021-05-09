package by.epamtc;

import by.epamtc.comparator.PlaneMaxLoadComparator;
import by.epamtc.plane.BasePlane;
import by.epamtc.predicate.FuelConsumptionPredicate;
import by.epamtc.service.AirlineCompanyService;

import java.util.List;

public class Runner {
    private static final int minFuelConsumptionFilter = 2;
    private static final int maxFuelConsumptionFilter = 1000;

    public static void main(String[] args) {
        AirlineCompany airlineCompany = AirlineCompanyService.generateRandomAirlineCompany();

        double totalMaxLoad = airlineCompany.getTotalPlanesMaxLoad();
        double totalPlanesMaxPassengers = airlineCompany.getTotalPlanesMaxPassengers();

        airlineCompany.sort(new PlaneMaxLoadComparator());

        List<BasePlane> fuelConsumptionFiltered = airlineCompany.filter(new FuelConsumptionPredicate(
                minFuelConsumptionFilter, maxFuelConsumptionFilter
        ));

        BasePlane fuelConsumptionPlaneInRange = fuelConsumptionFiltered.get(0);

        System.out.println("Total max load: " + totalMaxLoad);
        System.out.println("Total max passengers: " + totalPlanesMaxPassengers);

        System.out.println("Plane in fuel consumption range: " + fuelConsumptionPlaneInRange);


    }
}
