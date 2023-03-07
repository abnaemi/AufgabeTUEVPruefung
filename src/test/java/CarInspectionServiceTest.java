import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {

    @org.junit.jupiter.api.Test
    void fourTiresCheckerTrue() {

        Car carwithfourtires = new Car ();
        carwithfourtires.setNumberofTires(4);
        Car actualcar = new Car ();
        actualcar.setNumberofTires(4);

        assertEquals(carwithfourtires.getNumberOfTires(), actualcar.getNumberOfTires());
    }


    @org.junit.jupiter.api.Test
    void fourTiresCheckerFalse() {

        Car carwithfourtires = new Car();
        carwithfourtires.setNumberofTires(4);
        Car actualcar = new Car();
        actualcar.setNumberofTires(3);

        assertNotEquals(carwithfourtires.getNumberOfTires(), actualcar.getNumberOfTires());
    }


    @org.junit.jupiter.api.Test
    void seatBeltChecker() {
    }

    @org.junit.jupiter.api.Test
    void airBagChecker() {
    }

    @org.junit.jupiter.api.Test
    void doorNumbersCorrectChecker() {
    }

    @org.junit.jupiter.api.Test
    void checkCar() {
    }
}