/**
 * The Route class is used to store the information of the routes.txt file
 */
public class Route {
  // Defining the variables that will be used in the class.
    private String airline_code;
    private int airline_ID;
    private String sourceairport_code;
    private int source_aiportID;
    private String destination_airportcode;
    private int destination_airportID;
    private String codeshare;
    private int stops;
    private String equipment;

    /**
     *
     * @param airline_code
     * @param airline_ID
     * @param sourceairport_code
     * @param source_aiportID
     * @param destination_airportcode
     * @param codeshare
     * @param stops
     * @param equipment
     */
    public Route(String airline_code, int airline_ID, String sourceairport_code, int source_aiportID, String destination_airportcode,int destination_airportID, String codeshare, int stops, String equipment) {
        this.airline_code = airline_code;
        this.airline_ID = airline_ID;
        this.sourceairport_code = sourceairport_code;
        this.source_aiportID = source_aiportID;
        this.destination_airportcode = destination_airportcode;
        this.destination_airportID= destination_airportID;
        this.codeshare = codeshare;
        this.stops = stops;
        this.equipment = equipment;
    }

    public String getAirline_code() {
        return airline_code;
    }

    public int getAirline_ID() {
        return airline_ID;
    }

    public String getSourceairport_code() {
        return sourceairport_code;
    }

    public int getSource_aiportID() {
        return source_aiportID;
    }

    public String getDestination_airportcode() {
        return destination_airportcode;
    }

    public int getDestination_airportID() {
        return destination_airportID;
    }

    public String getCodeshare() {
        return codeshare;
    }

    public int getStops() {
        return stops;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setAirline_code(String airline_code) {
        this.airline_code = airline_code;
    }

    @Override
    public String toString() {
        return "Route{" +
                "airline_code='" + airline_code + '\'' +
                ", airline_ID=" + airline_ID +
                ", sourceairplane_code='" + sourceairport_code + '\'' +
                ", source_aiplaneID=" + source_aiportID +
                ", destination_airportcode='" + destination_airportcode + '\'' +
                ", destination_airportID=" + destination_airportID +
                ", codeshare='" + codeshare + '\'' +
                ", stops=" + stops +
                ", equipment='" + equipment + '\'' +
                '}';
    }
}
