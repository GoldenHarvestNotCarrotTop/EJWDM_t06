package by.epamtc.plane;

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
}
