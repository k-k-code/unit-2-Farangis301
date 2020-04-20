package ru.brunoyam.oop.models.transport;

public class train extends Transport{
    boolean aRestaurant;

    public train(boolean aRestaurant) {
        this.aRestaurant = aRestaurant;
    }

    public train(int travelTime, int seatsNumber, int cost, boolean aRestaurant) {
        super(travelTime, seatsNumber, cost);
        this.aRestaurant = aRestaurant;
    }
}
