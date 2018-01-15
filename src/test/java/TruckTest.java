import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TruckTest {

    Truck truck;

    @Before
    public void Before(){
        truck = new Truck("Bull", 5, 90);
    }

    @Test
    public void hasName(){
        assertEquals("Bull", truck.getName());
    }

    public void hasMinSpeed(){
        assertEquals(5, truck.getMaxSpeed());
    }

    public void hasMaxSpeed(){
        assertEquals(90, truck.getMaxSpeed());
    }
}
