package com.pluralsight;

public class TheApp {

    public static void main(String[] args) {

        Room theRoom = new Room(2, 100.00, false, false);
        System.out.println(("Is the room available: " + theRoom.isAvailable()));

        Reservation wedding = new Reservation("double", 3, true );
        System.out.println("Price for the hotel: $" + wedding.getReservationTotal());

        Reservation party = new Reservation("king", 4, false);
        System.out.println("Price for your party hotel reservation: $" + party.getReservationTotal());

        party.setWeekend(true);

        System.out.println(party.getPrice());


    }

}
