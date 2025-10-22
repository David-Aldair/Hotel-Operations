package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    //test for checkedIn()

    @Test
    public void occuppied_and_dirty_if_checkedIn(){

        //arrange
        Room checkedInRoom = new Room(2, 25, true, true);

        //act
        boolean isCheckedIn = checkedInRoom.isDirty();

        boolean isCheckedIn2 = checkedInRoom.isOccupied();

        //assert
        assertTrue(isCheckedIn);
        assertTrue(isCheckedIn2);
    }
    //test for checkedOut
    @Test
    public void not_occuppied_but_is_dirty_if_checkedOut(){

        //arrange
        Room checkedOutRoom = new Room(2, 100, false, true);

        //act
        boolean isCheckedOut = checkedOutRoom.isOccupied();

        boolean isCheckedOut2 = checkedOutRoom.isDirty();

        //assert
        assertFalse(isCheckedOut);
        assertTrue(isCheckedOut2);
    }
    //test for cleanRoom
    @Test
    public void cleanRoom_if_notOcccupied_and_notDirty(){

        //arrange
        Room cleanedRoom = new Room(3, 100, false, false);

        //act
        boolean isClean = cleanedRoom.isDirty();

        boolean isClean2 = cleanedRoom.isOccupied();

        //assert
        //assertFalse twice instead of using && because then both must be true to fail
        assertFalse(isClean);
        assertFalse(isClean2);
    }

}