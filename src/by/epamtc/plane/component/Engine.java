package by.epamtc.plane.component;

import java.io.Serializable;
import java.util.Objects;

public class Engine implements Serializable {
    private double maxTakeOffWeight;
    private double weight;
    private double hourlyFuelConsumption;

    public Engine(){

    }

    public Engine(double maxTakeOffWeight, double weight, double hourlyFuelConsumption) {
        this.maxTakeOffWeight = maxTakeOffWeight;
        this.weight = weight;
        this.hourlyFuelConsumption = hourlyFuelConsumption;
    }

    public double getMaxTakeOffWeight() {
        return maxTakeOffWeight;
    }

    public void setMaxTakeOffWeight(double maxTakeOffWeight) {
        this.maxTakeOffWeight = maxTakeOffWeight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHourlyFuelConsumption() {
        return hourlyFuelConsumption;
    }

    public void setHourlyFuelConsumption(double hourlyFuelConsumption) {
        this.hourlyFuelConsumption = hourlyFuelConsumption;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Engine{");
        sb.append("maxTakeOffWeight=").append(maxTakeOffWeight);
        sb.append(", weight=").append(weight);
        sb.append(", hourlyFuelConsumption=").append(hourlyFuelConsumption);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Double.compare(engine.getMaxTakeOffWeight(), getMaxTakeOffWeight()) == 0 && Double.compare(engine.getWeight(), getWeight()) == 0 && Double.compare(engine.getHourlyFuelConsumption(), getHourlyFuelConsumption()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaxTakeOffWeight(), getWeight(), getHourlyFuelConsumption());
    }
}
