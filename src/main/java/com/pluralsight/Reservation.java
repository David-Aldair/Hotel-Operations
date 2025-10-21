package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numOfDays;
    private boolean isWeekend;

    public Reservation(String roomType, int numOfDays, boolean isWeekend) {
        this.roomType = roomType;
        this.numOfDays = numOfDays;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    //derived getters
    public double getPrice() {

        if(this.getRoomType().equalsIgnoreCase("king")){
            return 139;
        }
        return 124;
    }
    public int getNumOfDays() {
        return numOfDays;
    }

    public void setNumOfDays(int numOfDays) {
        this.numOfDays = numOfDays;
    }

    public double getReservationTotal() {

        double total = this.getPrice() * this.getNumOfDays();

        if(this.isWeekend()){
            total = total + (total * .10);
        }
        return total;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
}
