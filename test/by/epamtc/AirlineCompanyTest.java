package by.epamtc;

import by.epamtc.comparator.PlaneMaxLoadComparator;
import by.epamtc.filter.PlaneCargoFilter;
import by.epamtc.plane.BasePlane;
import by.epamtc.service.PlaneService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.*;

class AirlineCompanyTest {
    private AirlineCompany com = new AirlineCompany();

    @BeforeEach
    void setUp() {
        int n = 1000;
        for (int i = 0; i < n; i++) {
            int r = ThreadLocalRandom.current().nextInt(2);
            BasePlane plane = null;
            switch (r){
                case 0:
                    plane = PlaneService.generateRandomCargoPlane();
                    break;
                case 1:
                    plane = PlaneService.generateRandomPassengerPlane();
                    break;
            }
            com.addPlane(plane);
        }
    }


    @Test
    void getSortedAndFiltered() {
       var planes =  com.getSortedAndFiltered(new PlaneMaxLoadComparator(), new PlaneCargoFilter());
        System.out.println(planes);
    }

    @Test
    void filter() {
    }

    @Test
    void testGetSortedAndFiltered() {
    }

}