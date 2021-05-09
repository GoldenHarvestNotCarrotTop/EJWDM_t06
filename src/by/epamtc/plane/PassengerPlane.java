package by.epamtc.plane;

import java.util.Objects;

public class PassengerPlane extends BasePlane{

    private int numberOfEconomyPassengerSeats;
    private int numberOfBusinessPassengerSeats;


    private double interiorWidth;
    private double luggageCapacity;


    public int getNumberOfAllPassengerSeats() {
        return numberOfEconomyPassengerSeats + numberOfBusinessPassengerSeats;
    }

    public int getNumberOfEconomyPassengerSeats() {
        return numberOfEconomyPassengerSeats;
    }

    public void setNumberOfEconomyPassengerSeats(int numberOfEconomyPassengerSeats) {
        this.numberOfEconomyPassengerSeats = numberOfEconomyPassengerSeats;
    }

    public int getNumberOfBusinessPassengerSeats() {
        return numberOfBusinessPassengerSeats;
    }

    public void setNumberOfBusinessPassengerSeats(int numberOfBusinessPassengerSeats) {
        this.numberOfBusinessPassengerSeats = numberOfBusinessPassengerSeats;
    }

    public double getInteriorWidth() {
        return interiorWidth;
    }

    public void setInteriorWidth(double interiorWidth) {
        this.interiorWidth = interiorWidth;
    }

    public double getLuggageCapacity() {
        return luggageCapacity;
    }

    public void setLuggageCapacity(double luggageCapacity) {
        this.luggageCapacity = luggageCapacity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PassengerPlane{");
        sb.append("BasePlane=").append(super.toString());
        sb.append(", numberOfEconomyPassengerSeats=").append(numberOfEconomyPassengerSeats);
        sb.append(", numberOfBusinessPassengerSeats=").append(numberOfBusinessPassengerSeats);
        sb.append(", interiorWidth=").append(interiorWidth);
        sb.append(", luggageCapacity=").append(luggageCapacity);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerPlane plane = (PassengerPlane) o;
        return getNumberOfEconomyPassengerSeats() == plane.getNumberOfEconomyPassengerSeats()
                && getNumberOfBusinessPassengerSeats() == plane.getNumberOfBusinessPassengerSeats()
                && Double.compare(plane.getInteriorWidth(), getInteriorWidth()) == 0
                && Double.compare(plane.getLuggageCapacity(), getLuggageCapacity()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumberOfEconomyPassengerSeats(), getNumberOfBusinessPassengerSeats(), getInteriorWidth(), getLuggageCapacity());
    }
}
