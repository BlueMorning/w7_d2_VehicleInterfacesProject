import TransportVehicle.Ship;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShipTest {

    Ship ship;

    @Before
    public void Before(){
        ship = new Ship("SeaGull", 2, 40);
    }

    @Test
    public void hasName(){
        assertEquals("SeaGull", ship.getName());
    }

    public void hasMinSpeed(){
        assertEquals(2, ship.getMaxSpeed());
    }

    public void hasMaxSpeed(){
        assertEquals(40, ship.getMaxSpeed());
    }
}
