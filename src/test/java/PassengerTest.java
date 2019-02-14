import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("John", 100);
    }


    @Test
    public void canGetName(){
        assertEquals("John", passenger.getName());
    }

    @Test
    public void canGetWallet(){
        assertEquals(100, passenger.getWallet());

    }
}
