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

    public HashMap<SeatType, Integer> getAllAvailableSeats() {
        return availableSeats;
    }

    public void assignSeatAllocation(SeatType type, Integer seats){
        this.availableSeats.put(type, seats);
    }

    public int getAvailableSeatsByType(SeatType type) {
        if (this.availableSeats.get(type) == null){
            return 0;
        }
        return this.availableSeats.get(type);
    }

    public void addPassenger(Passenger passenger, SeatType type) {
        int availableSeats = this.getAvailableSeatsByType(type);

        if ( availableSeats > 0) {
            this.passengers.add(passenger);
            this.availableSeats.replace(type, availableSeats - 1);
        }
    }


}
