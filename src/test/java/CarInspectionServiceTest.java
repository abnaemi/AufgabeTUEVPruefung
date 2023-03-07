import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {

    @Test
    void carHas4TiresTrue() {

        Car carExpected= new Car (4,4,true,true);
        CarInspectionService tüv = new CarInspectionService();
        carExpected.setNumberOfTires(2);
        System.out.println(carExpected.getNumberOfTires());
        System.out.println(tüv.fourTiresChecker(carExpected));
        System.out.println(tüv.seatBeltChecker(carExpected));

        Car carActual= new Car (4,4,true,true);
        CarInspectionService tüv2 = new CarInspectionService();
        carActual.setNumberOfTires(2);
        System.out.println(carActual.getNumberOfTires());
        System.out.println(tüv2.fourTiresChecker(carActual));
        System.out.println(tüv2.seatBeltChecker(carActual));

        assertEquals(tüv.fourTiresChecker(carExpected),tüv2.fourTiresChecker(carActual));

    }
    @Test
    void carHas4TiresFalse() {

        Car carExpected= new Car (4,4,true,true);
        CarInspectionService tüv = new CarInspectionService();
        carExpected.setNumberOfTires(2);
        System.out.println(carExpected.getNumberOfTires());
        System.out.println(tüv.fourTiresChecker(carExpected));
        System.out.println(tüv.seatBeltChecker(carExpected));

        Car carActual= new Car (1,4,true,true);
        CarInspectionService tüv2 = new CarInspectionService();
        carActual.setNumberOfTires(2);
        System.out.println(carActual.getNumberOfTires());
        System.out.println(tüv2.fourTiresChecker(carActual));
        System.out.println(tüv2.seatBeltChecker(carActual));

        assertNotEquals(tüv.fourTiresChecker(carExpected),tüv2.fourTiresChecker(carActual));

    }

}