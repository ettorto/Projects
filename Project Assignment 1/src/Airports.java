/**
 * It's a class that contains all the information about an airport.
 */
public class Airports {
    // Declaring the variables.
    private int airport_ID;
    private String name;
    private String city;
    private String country;
    private String iata_code;
    private String  icao_Code;
    private double latitude;
    private double longitude;
    private int altitude;
    private int timezone;
    private String dst;
    private String tz_datatimezone;
    private String type;
    private String sourceofData;

    /**
     *
     * @param airport_ID
     * @param name
     * @param city
     * @param country
     * @param iata_code
     * @param icao_Code
     * @param latitude
     * @param longitude
     * @param altitude
     * @param timezone
     * @param dst
     * @param tz_datatimezone
     * @param type
     * @param sourceofData
     */
    public Airports(int airport_ID, String name, String city, String country, String iata_code, String icao_Code, double latitude, double longitude, int altitude, int timezone, String dst, String tz_datatimezone, String type, String sourceofData) {
        this.airport_ID = airport_ID;
        this.name = name;
        this.city = city;
        this.country = country;
        this.iata_code = iata_code;
        this.icao_Code = icao_Code;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.timezone = timezone;
        this.dst = dst;
        this.tz_datatimezone = tz_datatimezone;
        this.type = type;
        this.sourceofData = sourceofData;
    }

    public Airports() {}

    public int getAirport_ID() {
        return airport_ID;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getIata_code() {
        return iata_code;
    }

    public String getIcao_Code() {
        return icao_Code;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public int getTimezone() {
        return timezone;
    }

    public String getDst() {
        return dst;
    }

    public String getTz_datatimezone() {
        return tz_datatimezone;
    }

    public String getType() {
        return type;
    }

    public String getSourceofData() {
        return sourceofData;
    }

    @Override
    public String toString() {
        return "Airports{" +
                "airport_ID=" + airport_ID +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", iata_code='" + iata_code + '\'' +
                ", icao_Code='" + icao_Code + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", altitude=" + altitude +
                ", timezone=" + timezone +
                ", dst='" + dst + '\'' +
                ", tz_datatimezone='" + tz_datatimezone + '\'' +
                ", type='" + type + '\'' +
                ", sourceofData='" + sourceofData + '\'' +
                '}';
    }

    public static Airports getAirportId(int airport_ID){
        Airports airportObject = new Airports();
        for (Airports object: Main.airportArray) {
            if (object.getAirport_ID() == airport_ID) {
                airportObject = object;
            }
        }
        return airportObject;
    }

    public static Airports getAirportId(String city,String country){
        Airports airportobject=  new Airports();
        for(Airports object: Main.airportArray){
            if (object.getCity().equals(city) && object.getCountry().equals(country) ){
                airportobject=object;
            }
        }
        return airportobject;
    }
}
