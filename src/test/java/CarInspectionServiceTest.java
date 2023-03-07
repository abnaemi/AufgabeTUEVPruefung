import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {

    @Test
    void carHas4TiresTrue() {
    Car carfourtires = new Car (4);
    Car carthreetires = new Car (4);

    assertEquals(carfourtires,carthreetires);

    }


@Test    void carHas4TiresFalse() {
        Car carfourtires = new Car (4);
        Car carthreetires = new Car (3);

        assertNotEquals(carfourtires,carthreetires);

    }
}