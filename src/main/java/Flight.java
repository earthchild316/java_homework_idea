import java.util.ArrayList;
import java.util.HashMap;

public class Flight {

    private String flightNumber;
    private Airport departureAirport;
    private Airport destination;
    private ArrayList<Passenger> passengers;
    private HashMap<SeatType, Integer> availableSeats;


    public Flight(String flightNumber, Airport departure, Airport destination){
        this.flightNumber = flightNumber;
        this.departureAirport = departure;
        this.destination = destination;
        this.passengers = new ArrayList<>();
        this.availableSeats = new HashMap<>();
    }


    public String getFlightNumber() {
        return flightNumber;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getDestination() {
        return destination;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public HashMap<SeatType, Integer> getAvailableSeats() {
        return availableSeats;
    }

}
