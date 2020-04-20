package ru.brunoyam.oop.models.transport;

public class Ship extends Transport{
    boolean breakfast;

    public Ship(boolean breakfast) {
        this.breakfast = breakfast;
    }

    public Ship(int travelTime, int seatsNumber, int cost, boolean breakfast) {
        super(travelTime, seatsNumber, cost);
        this.breakfast = breakfast;
    }

}
