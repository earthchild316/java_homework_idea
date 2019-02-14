import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;


    @Before
    public void before(){
        airport = new Airport("Edinburgh", "EDI", "Edinburgh", "UK");
    }


    @Test
    public void canGetName(){
        assertEquals("Edinburgh", airport.getName());
    }

    @Test
    public void canGetAirportCode(){
        assertEquals("EDI", airport.getAirportCode());
    }

    @Test
    public void canGetCity(){
        assertEquals("Edinburgh", airport.getCity());
    }

    @Test
    public void canGetCountry(){
        assertEquals("UK", airport.getCountry());
    }


}
