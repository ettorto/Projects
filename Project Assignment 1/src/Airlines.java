/**
 * A class that represents an airline.
 */
public class Airlines {
    private int airline_ID;
    private String name;
    private String alias;
    private String iata_code;
    private String icao_code;
    private String callsign;
    private String country;
    private String active;

    /**
     *
     * @param airline_ID
     * @param name
     * @param alias
     * @param IATA_code
     * @param ICAO
     * @param callsign
     * @param country
     * @param active
     */
    public Airlines(int airline_ID, String name, String alias, String iata_code, String icao_code, String callsign, String country, String active) {
        this.airline_ID = airline_ID;
        this.name = name;
        this.alias = alias;
        this.iata_code = iata_code;
        this.icao_code = icao_code;
        this.callsign = callsign;
        this.country = country;
        this.active = active;
    }

    public int getAirline_ID() {
        return airline_ID;
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

    public String getIata_code() {
        return iata_code;
    }

    public String getIcao_code() {
        return icao_code;
    }

    public String getCallsign() {
        return callsign;
    }

    public String getCountry() {
        return country;
    }

    public String getActive() {
        return active;
    }

    @Override
    public String toString() {
        return "Airlines{" +
                "airline_ID=" + airline_ID +
                ", name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", iata_code='" + iata_code + '\'' +
                ", icao_code='" + icao_code + '\'' +
                ", callsign='" + callsign + '\'' +
                ", country='" + country + '\'' +
                ", active='" + active + '\'' +
                '}';
    }
}
