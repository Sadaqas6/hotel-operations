package com.pluralsight;

public class Hotel {

    private String name;
    private int numberOfSuites, numberOfRooms, bookedSuites, bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }


    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }


    // Derived Getters
    public int getAvailableSuites(){
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms(){
        return numberOfRooms - bookedBasicRooms;
    }

    // BookRoom Method
    public boolean bookRoom(int numberOfRooms, boolean isSuite){

        if(isSuite){
            if (getAvailableSuites() >= numberOfRooms){
                bookedSuites += numberOfRooms;
                return true;
            }
        }else{
            if(getAvailableRooms() >= numberOfRooms){
                bookedBasicRooms += numberOfRooms;
                return true;
            }
        }
        return false;
    }
}
