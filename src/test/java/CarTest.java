import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void Before(){
        car = new Car("City", 5, 120);
    }

    @Test
    public void hasName(){
        assertEquals("City", car.getName());
    }

    public void hasMinSpeed(){
        assertEquals(5, car.getMaxSpeed());
    }

    public void hasMaxSpeed(){
        assertEquals(120, car.getMaxSpeed());
    }


}
