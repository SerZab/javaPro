package homeWork.extra.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    void createCar(){
        Car car = Mockito.mock(Car.class);
        assertEquals(null, car.getManufacturer());
    }
    
    @Test
    void carYear(){
        Car car1 = Mockito.mock(Car.class);
        assertEquals(0,car1.getYear());
    }
}
