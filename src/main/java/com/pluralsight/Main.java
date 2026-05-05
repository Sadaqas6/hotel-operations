package com.pluralsight;

public class Main {
    public static void main(String[] args) {


        Room room1 = new Room(5, 15.00, false, false);

        Employee emp1 = new Employee(1234, "Stacey", "IT", 56.65, 60);

        System.out.println(emp1.getTotalPay());

        if (room1.isAvailable()){
            room1.checkIn();
        }
        System.out.println(room1.isAvailable());


    }

}
