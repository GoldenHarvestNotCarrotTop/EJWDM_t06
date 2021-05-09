package by.epamtc;

import by.epamtc.plane.BasePlane;
import by.epamtc.plane.PassengerPlane;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class AirlineCompany {
    private List<BasePlane> planes = new ArrayList<>();

    public void addPlane(BasePlane plane) {
        planes.add(plane);
    }

    public boolean removePlane(BasePlane plane) {
        return planes.remove(plane);
    }

    public List<BasePlane> getPlanes() {
        return new ArrayList<BasePlane>(planes);
    }

    public double getTotalPlanesMaxLoad() {
        double ans = 0;
        for (BasePlane plane : planes) {
            ans += plane.getMaxLoad();
        }
        return ans;
    }

    public int getTotalPlanesMaxPassengers() {
        int ans = 0;
        for (BasePlane plane : planes) {
            if (plane instanceof PassengerPlane)
                ans += ((PassengerPlane) plane).getNumberOfAllPassengerSeats();
        }
        return ans;
    }

    public int getTotalPlanesMaxBusinessPassengers() {
        int ans = 0;
        for (BasePlane plane : planes) {
            if (plane instanceof PassengerPlane)
                ans += ((PassengerPlane) plane).getNumberOfBusinessPassengerSeats();
        }
        return ans;
    }


    public ArrayList<BasePlane> getSorted(Comparator<BasePlane> comparator) {
        ArrayList<BasePlane> out = new ArrayList<>(planes);
        out.sort(comparator);
        return out;
    }

    public void sort(Comparator<BasePlane> comparator) {
        planes.sort(comparator);
    }

    public ArrayList<BasePlane> filter(Predicate<BasePlane> predicate) {
        ArrayList<BasePlane> filtered = new ArrayList<>();
        for (BasePlane plane : planes) {
            if (predicate.test(plane)) {
                filtered.add(plane);
            }
        }
        return filtered;
    }

    public ArrayList<BasePlane> getSortedAndFiltered(Comparator<BasePlane> comparator, Predicate<BasePlane> predicate) {
        ArrayList<BasePlane> filtered = filter(predicate);
        filtered.sort(comparator);
        return filtered;
    }

}
