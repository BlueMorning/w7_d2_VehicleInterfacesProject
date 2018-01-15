import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZeppelinTest {

    Zeppelin zeppelin;

    @Before
    public void Before(){
        zeppelin = new Zeppelin("Atlantica", 10, 100);
    }

    @Test
    public void hasName(){
        assertEquals("Atlantica", zeppelin.getName());
    }

    public void hasMinSpeed(){
        assertEquals(10, zeppelin.getMaxSpeed());
    }

    public void hasMaxSpeed(){
        assertEquals(100, zeppelin.getMaxSpeed());
    }


}
