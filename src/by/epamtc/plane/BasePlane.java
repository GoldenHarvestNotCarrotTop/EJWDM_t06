package by.epamtc.plane;

import java.util.Objects;

public class BasePlane {
    private String name;
    private int id;
    private int manufactureYear;

    private double length;
    private double wingspan;
    private double wingArea;

    private double maxTakeOffWeight;
    private double maxLandingWeight;
    private double emptyWeight;
    private double maxWeightWithoutFuel;
    private double maxLoad;

    private double flightRangeWithMaxLoad;
    private double maxCruisingSpeed;
    private double maxFlightAltitude;

    private double runUpLength;

    // g/pass-km
    private double specificFuelConsumption;

    // kg
    private double hourlyFuelConsumption;

    private double fuelTankCapacity;

    private int numberOfPilots;

    private long price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getMaxTakeOffWeight() {
        return maxTakeOffWeight;
    }

    public void setMaxTakeOffWeight(double maxTakeOffWeight) {
        this.maxTakeOffWeight = maxTakeOffWeight;
    }

    public double getMaxLandingWeight() {
        return maxLandingWeight;
    }

    public void setMaxLandingWeight(double maxLandingWeight) {
        this.maxLandingWeight = maxLandingWeight;
    }

    public double getEmptyWeight() {
        return emptyWeight;
    }

    public void setEmptyWeight(double emptyWeight) {
        this.emptyWeight = emptyWeight;
    }

    public double getMaxWeightWithoutFuel() {
        return maxWeightWithoutFuel;
    }

    public void setMaxWeightWithoutFuel(double maxWeightWithoutFuel) {
        this.maxWeightWithoutFuel = maxWeightWithoutFuel;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double getFlightRangeWithMaxLoad() {
        return flightRangeWithMaxLoad;
    }

    public void setFlightRangeWithMaxLoad(double flightRangeWithMaxLoad) {
        this.flightRangeWithMaxLoad = flightRangeWithMaxLoad;
    }

    public double getMaxCruisingSpeed() {
        return maxCruisingSpeed;
    }

    public void setMaxCruisingSpeed(double maxCruisingSpeed) {
        this.maxCruisingSpeed = maxCruisingSpeed;
    }

    public double getMaxFlightAltitude() {
        return maxFlightAltitude;
    }

    public void setMaxFlightAltitude(double maxFlightAltitude) {
        this.maxFlightAltitude = maxFlightAltitude;
    }

    public double getRunUpLength() {
        return runUpLength;
    }

    public void setRunUpLength(double runUpLength) {
        this.runUpLength = runUpLength;
    }

    public double getSpecificFuelConsumption() {
        return specificFuelConsumption;
    }

    public void setSpecificFuelConsumption(double specificFuelConsumption) {
        this.specificFuelConsumption = specificFuelConsumption;
    }

    public double getHourlyFuelConsumption() {
        return hourlyFuelConsumption;
    }

    public void setHourlyFuelConsumption(double hourlyFuelConsumption) {
        this.hourlyFuelConsumption = hourlyFuelConsumption;
    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public int getNumberOfPilots() {
        return numberOfPilots;
    }

    public void setNumberOfPilots(int numberOfPilots) {
        this.numberOfPilots = numberOfPilots;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasePlane basePlane = (BasePlane) o;
        return getId() == basePlane.getId() && getManufactureYear() == basePlane.getManufactureYear()
                && Double.compare(basePlane.getLength(), getLength()) == 0
                && Double.compare(basePlane.getWingspan(), getWingspan()) == 0
                && Double.compare(basePlane.getWingArea(), getWingArea()) == 0
                && Double.compare(basePlane.getMaxTakeOffWeight(), getMaxTakeOffWeight()) == 0
                && Double.compare(basePlane.getMaxLandingWeight(), getMaxLandingWeight()) == 0
                && Double.compare(basePlane.getEmptyWeight(), getEmptyWeight()) == 0
                && Double.compare(basePlane.getMaxWeightWithoutFuel(), getMaxWeightWithoutFuel()) == 0
                && Double.compare(basePlane.getMaxLoad(), getMaxLoad()) == 0
                && Double.compare(basePlane.getFlightRangeWithMaxLoad(), getFlightRangeWithMaxLoad()) == 0
                && Double.compare(basePlane.getMaxCruisingSpeed(), getMaxCruisingSpeed()) == 0
                && Double.compare(basePlane.getMaxFlightAltitude(), getMaxFlightAltitude()) == 0
                && Double.compare(basePlane.getRunUpLength(), getRunUpLength()) == 0
                && Double.compare(basePlane.getSpecificFuelConsumption(), getSpecificFuelConsumption()) == 0
                && Double.compare(basePlane.getHourlyFuelConsumption(), getHourlyFuelConsumption()) == 0
                && Double.compare(basePlane.getFuelTankCapacity(), getFuelTankCapacity()) == 0
                && getNumberOfPilots() == basePlane.getNumberOfPilots() && getPrice() == basePlane.getPrice()
                && Objects.equals(getName(), basePlane.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId(), getManufactureYear(), getLength(), getWingspan(), getWingArea(), getMaxTakeOffWeight(), getMaxLandingWeight(), getEmptyWeight(), getMaxWeightWithoutFuel(), getMaxLoad(), getFlightRangeWithMaxLoad(), getMaxCruisingSpeed(), getMaxFlightAltitude(), getRunUpLength(), getSpecificFuelConsumption(), getHourlyFuelConsumption(), getFuelTankCapacity(), getNumberOfPilots(), getPrice());
    }
}
