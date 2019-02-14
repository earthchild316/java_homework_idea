public class Airport {

    private String name;
    private String airportCode;
    private String city;
    private String country;

    public Airport(String name, String airportCode, String city, String country){
        this.name = name;
        this.airportCode = airportCode;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
