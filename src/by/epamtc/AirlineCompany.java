package by.epamtc;

import by.epamtc.exception.NullPlaneException;
import by.epamtc.plane.BasePlane;
import by.epamtc.plane.PassengerPlane;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class AirlineCompany implements Serializable {
    private List<BasePlane> planes = new ArrayList<>();

    public void addPlane(BasePlane plane) throws NullPlaneException {
        if(plane == null)
            throw new NullPlaneException("Plane must not be null");
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AirlineCompany{");
        sb.append("planes=").append(planes);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirlineCompany that = (AirlineCompany) o;
        return Objects.equals(getPlanes(), that.getPlanes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlanes());
    }
}
