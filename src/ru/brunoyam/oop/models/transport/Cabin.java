package ru.brunoyam.oop.models.transport;

public class Cabin extends Ship{
    private static final boolean travelTime = ;
    boolean setsNumber;
    int comfortClass;

    public Cabin(boolean breakfast) {
        super(breakfast);
    }

    public Cabin(boolean setsNumber, int comfortClass) {
        super(breakfast);
        this.setsNumber = setsNumber;
        this.comfortClass = comfortClass;
    }
}
