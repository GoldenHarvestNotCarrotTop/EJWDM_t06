package by.epamtc.plane;

import by.epamtc.plane.component.Crew;
import by.epamtc.plane.component.Dimensions;
import by.epamtc.plane.component.Engine;

import java.io.Serializable;
import java.util.Objects;

public class BasePlane implements Serializable {
    private String name;
    private int id;
    private int manufactureYear;

    private Engine engine;
    private Dimensions dimensions;
    private Crew crew;

    private double maxLoad;
    private double weight;

    private double fuelTankCapacity;

    public BasePlane(){

    }


    public BasePlane(String name,
                     int id,
                     int manufactureYear,
                     Engine engine,
                     Dimensions dimensions,
                     double maxLoad,
                     double weight,
                     double fuelTankCapacity) {
        this.name = name;
        this.id = id;
        this.manufactureYear = manufactureYear;
        this.engine = engine;
        this.dimensions = dimensions;
        this.maxLoad = maxLoad;
        this.weight = weight;
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public Crew getCrew() {
        return crew;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BasePlane{");
        sb.append("name='").append(name).append('\'');
        sb.append(", id=").append(id);
        sb.append(", manufactureYear=").append(manufactureYear);
        sb.append(", engine=").append(engine);
        sb.append(", dimensions=").append(dimensions);
        sb.append(", crew=").append(crew);
        sb.append(", maxLoad=").append(maxLoad);
        sb.append(", weight=").append(weight);
        sb.append(", fuelTankCapacity=").append(fuelTankCapacity);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasePlane plane = (BasePlane) o;
        return getId() == plane.getId()
                && getManufactureYear() == plane.getManufactureYear()
                && Double.compare(plane.getMaxLoad(), getMaxLoad()) == 0
                && Double.compare(plane.getWeight(), getWeight()) == 0
                && Double.compare(plane.getFuelTankCapacity(), getFuelTankCapacity()) == 0
                && Objects.equals(getName(), plane.getName())
                && Objects.equals(getCrew(), plane.getCrew())
                && Objects.equals(getEngine(), plane.getEngine())
                && Objects.equals(getDimensions(), plane.getDimensions());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),
                getId(),
                getManufactureYear(),
                getEngine(),
                getCrew(),
                getDimensions(),
                getMaxLoad(),
                getWeight(),
                getFuelTankCapacity());
    }
}
