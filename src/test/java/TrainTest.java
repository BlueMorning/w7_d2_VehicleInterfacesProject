import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrainTest {

    Train train;

    @Before
    public void Before(){
        train = new Train("Transiberian", 5, 150);
    }

    @Test
    public void hasName(){
        assertEquals("Transiberian", train.getName());
    }

    public void hasMinSpeed(){
        assertEquals(5, train.getMaxSpeed());
    }

    public void hasMaxSpeed(){
        assertEquals(150, train.getMaxSpeed());
    }


}




