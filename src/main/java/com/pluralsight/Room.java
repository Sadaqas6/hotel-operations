package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean occupied, dirty, isAvailable;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;

    }

    public void cleanRoom(){
        this.dirty = false;
    }

    public void checkOut(){
        this.occupied = false;
        this.dirty = true;
    }

    public void checkIn(){
        this.occupied = true;
        this.dirty = true;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
         return !this.isDirty() && !this.isOccupied();
    }
}
