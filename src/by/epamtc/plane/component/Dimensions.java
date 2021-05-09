package by.epamtc.plane.component;

import java.io.Serializable;
import java.util.Objects;

public class Dimensions implements Serializable {
    private double length;
    private double wingspan;
    private double wingArea;

    public Dimensions() {

    }

    public Dimensions(double length, double wingspan, double wingArea) {
        this.length = length;
        this.wingspan = wingspan;
        this.wingArea = wingArea;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getWingArea() {
        return wingArea;
    }

    public void setWingArea(double wingArea) {
        this.wingArea = wingArea;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dimensions{");
        sb.append("length=").append(length);
        sb.append(", wingspan=").append(wingspan);
        sb.append(", wingArea=").append(wingArea);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dimensions that = (Dimensions) o;
        return Double.compare(that.getLength(), getLength()) == 0 && Double.compare(that.getWingspan(), getWingspan()) == 0 && Double.compare(that.getWingArea(), getWingArea()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWingspan(), getWingArea());
    }
}
