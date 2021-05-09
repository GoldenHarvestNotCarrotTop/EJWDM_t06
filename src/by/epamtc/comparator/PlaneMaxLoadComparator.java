package by.epamtc.comparator;

import by.epamtc.plane.BasePlane;

import java.util.Comparator;

public class PlaneMaxLoadComparator implements Comparator<BasePlane> {
    @Override
    public int compare(BasePlane o1, BasePlane o2) {
        return Double.compare(o1.getMaxLoad(), o2.getMaxLoad());
    }
}
