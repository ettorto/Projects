
public class Createobjects {


    // Creating a route object.
    public static Route createRoute(String[] stringRoute) {
        int airline_ID = 0;
        int source_aiplaneID = 0;
        int stops = 0;
        int destination_airportID = 0;
        try {
            airline_ID = Integer.parseInt(stringRoute[1]);
            source_aiplaneID = Integer.parseInt(stringRoute[3]);
            destination_airportID = Integer.parseInt(stringRoute[5]);
            stops = Integer.parseInt(stringRoute[7]);
        } catch (NumberFormatException nfe) {
            nfe.getMessage();
        }


        String airline_code = stringRoute[0];
        String sourceairplane_code = stringRoute[2];
        String destination_airportcode = stringRoute[4];
        String codeshare = stringRoute[6];
        String equipment = stringRoute[stringRoute.length - 1];

        return new Route(airline_code, airline_ID, sourceairplane_code, source_aiplaneID,
                destination_airportcode, destination_airportID, codeshare, stops, equipment);
    }

   // Creating an airline object.
    public static Airlines createAirlines(String[] stringAirlines) {
        int airline_ID = 0;
        try{
            airline_ID = Integer.parseInt(stringAirlines[0]);
        } catch (NumberFormatException nfe) {
            nfe.getMessage();
        }


        String name = stringAirlines[1];
        String alias = stringAirlines[2];
        String iata_code = stringAirlines[3];
        String icao_code = stringAirlines[4];
        String callsign = stringAirlines[5];
        String country = stringAirlines[6];
        String active = stringAirlines[7];


        return new Airlines(airline_ID,name,alias,iata_code,icao_code,callsign,country,active);

    }

    // Creating an airport object.
    public static Airports createAirports(String[] stringAirports){
        int airport_ID=0;
        double latitude=0.0;
        double longitude=0.0;
        int altitude=0;
        int timezone=0;


        try {
            airport_ID = Integer.parseInt(stringAirports[0]);
            latitude =Double.parseDouble(stringAirports[6]);
            longitude = Double.parseDouble(stringAirports[7]);
            altitude = Integer.parseInt(stringAirports[8]);
            timezone = Integer.parseInt(stringAirports[9]);
        } catch(NumberFormatException nfe){ nfe.getMessage();}

        String name= stringAirports[1];
        String city=stringAirports[2];
        String country=stringAirports[3];
        String iata_code =stringAirports[4];
        String  icao_Code = stringAirports[5];
        String dst =stringAirports[10];
        String tz_datatimezone =stringAirports[11];
        String type= stringAirports[12];
        String sourceofData= stringAirports[13];

        return new Airports(airport_ID,name,city, country,iata_code, icao_Code,
                latitude,longitude,altitude,timezone,dst, tz_datatimezone,type,sourceofData);
    }




}