package by.epamtc.plane;

import by.epamtc.plane.component.Dimensions;
import by.epamtc.plane.component.Engine;

import java.util.Objects;

public class CargoPlane extends BasePlane  {
    private double cargoCapacity;

    public CargoPlane() {
    }

    public CargoPlane(String name, int id, int manufactureYear, Engine engine, Dimensions dimensions, double maxLoad, double weight, double fuelTankCapacity) {
        super(name, id, manufactureYear, engine, dimensions, maxLoad, weight, fuelTankCapacity);
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CargoPlane{");
        sb.append("BasePlane=").append(super.toString());
        sb.append("cargoCapacity=").append(cargoCapacity);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CargoPlane that = (CargoPlane) o;
        return Double.compare(that.getCargoCapacity(), getCargoCapacity()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCargoCapacity());
    }
}
