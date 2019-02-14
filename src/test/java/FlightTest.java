import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Airport departure;
    Airport destination;

    @Before
    public void before(){
        departure = new Airport("Edinburgh Airport", "EDI", "Edinburgh", "UK");
        destination = new Airport("Dublin Airport", "DUB", "Dublin", "Ireland");
        flight = new Flight("EI3551", departure, destination);

    }

    @Test
    public void canGetFlightNumber(){
        assertEquals("EI3551", flight.getFlightNumber());
    }

    @Test
    public void canGetDestinationAirport(){
        assertEquals(destination, flight.getDestination());
    }

    @Test
    public void canGetDepartureAirport(){
        assertEquals(departure, flight.getDepartureAirport());
    }

    @Test
    public void passengersStartsAtZero(){
        assertEquals(0, flight.getPassengers().size());
    }

    @Test
    public void availableSeatsStartsAtZero(){
        assertEquals(0, flight.getAllAvailableSeats().size());
    }

    @Test
    public void canAddPassenger(){
        Passenger passenger = new Passenger("John", 100);
        flight.addPassenger(passenger);
        assertEquals(1, flight.getPassengers().size());
    }

    @Test
    public void canGetZeroIfNoAllocationForSeats(){
        assertEquals(0, flight.getAvailableSeatsByType(SeatType.BUSINESS));
    }

    @Test
    public void canAddSeatAllocation(){
        flight.assignSeatAllocation(SeatType.ECONOMY, 40);
        assertEquals(40, flight.getAvailableSeatsByType(SeatType.ECONOMY));
    }



}
