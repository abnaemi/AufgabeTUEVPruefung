import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {

    @Test
    void carHas4TiresTrue() {

        Car carExpected= new Car (4,4,true,true);
        CarInspectionService tüv = new CarInspectionService();


        Car carActual= new Car (4,4,true,true);


        assertEquals(tüv.fourTiresChecker(carExpected),tüv.fourTiresChecker(carActual));

    }
    @Test
    void carHas4TiresFalse() {

        Car carExpected= new Car (4,4,true,true);
        CarInspectionService tüv = new CarInspectionService();


        Car carActual= new Car (3,4,true,true);


        assertNotEquals(tüv.fourTiresChecker(carExpected),tüv.fourTiresChecker(carActual));

    }

    @Test
    void seatBeltCheckerTrue() {

        Car carOne= new Car (4,4,true,true);
        CarInspectionService tüv = new CarInspectionService();

        Car carTwo= new Car (4,4,true,true);
        CarInspectionService tüvTwo = new CarInspectionService();

        assertEquals(carOne,carTwo);


    }
    @Test
    void seatBeltCheckerFalse() {

        Car carOne= new Car (4,4,true,true);
        CarInspectionService tüv = new CarInspectionService();

        Car carTwo= new Car (4,4,false,true);
        CarInspectionService tüvTwo = new CarInspectionService();

        assertNotEquals(carOne,carTwo);


    }
}