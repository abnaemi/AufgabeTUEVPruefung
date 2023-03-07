import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {

    @Test
    void carHas4TiresTrue() {

        Car carExpected= new Car (4,4,true,true);
        CarInspectionService tüv = new CarInspectionService();
        carExpected.setNumberOfTires(2);


        Car carActual= new Car (4,4,true,true);
        CarInspectionService tüv2 = new CarInspectionService();
        carActual.setNumberOfTires(2);


        assertEquals(tüv.fourTiresChecker(carExpected),tüv2.fourTiresChecker(carActual));

    }
    @Test
    void carHas4TiresFalse() {

        Car carExpected= new Car (4,4,true,true);
        CarInspectionService tüv = new CarInspectionService();
        carExpected.setNumberOfTires(2);


        Car carActual= new Car (1,4,true,true);
        CarInspectionService tüv2 = new CarInspectionService();
        carActual.setNumberOfTires(2);


        assertNotEquals(tüv.fourTiresChecker(carExpected),tüv2.fourTiresChecker(carActual));

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