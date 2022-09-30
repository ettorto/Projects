import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/**
*@author Ernest Torto
*/
public class Main {
   // These are the global variables that are used in the program.
    public static ArrayList<Airports> airportArray = new ArrayList<>();
    public static ArrayList<Route> routeArray= new ArrayList<>();
    public static ArrayList<Airlines> airlinesArray= new ArrayList<>();
    public static Airports sourceAirport;
    public static Airports destinationAirport;

    // This is the main method of the program. It is reading the csv files and creating objects of the
    // classes.
    public static void main(String[] args) throws IOException {
        ArrayList<String[]> stringRoute = new
                ArrayList<>(FileRead.get("C://Users//HP//IdeaProjects//Project Assignment 1//routes.csv"));
        for (String[] string: stringRoute) {
            Route route = Createobjects.createRoute(string);
            routeArray.add(route);
        }
        System.out.println("Route len");
        System.out.println(routeArray.size());


        ArrayList<String[]> stringAirlines = new ArrayList<>(FileRead.get("C://Users//HP//IdeaProjects//Project Assignment 1//airlines.csv"));
        for(String[] string: stringAirlines) {
            Airlines airline = Createobjects.createAirlines(string);
            airlinesArray.add(airline);
        }


        ArrayList<String[]> stringAirport = new
                ArrayList<>(FileRead.get("C://Users//HP//IdeaProjects//Project Assignment 1//airports.csv"));
        for (String[] string: stringAirport) {
            Airports obj = Createobjects.createAirports(string);
            airportArray.add(obj);
        }

// Reading the input file and splitting the input into source and destination.

        FileReader inputReader = new FileReader("C:\\Users\\HP\\IdeaProjects\\Project Assignment 1\\Input");
        BufferedReader inputTXT = new BufferedReader(inputReader);
        String[] source = inputTXT.readLine().split(",");
        String[] destination = inputTXT.readLine().split(",");
        String sourceCity = source[0];
        String sourceCountry = source[1];
        String destinationCity = destination[0];
        String destinationCountry = destination[1];

        sourceAirport = Airports.getAirportId(sourceCity, sourceCountry);
        destinationAirport = Airports.getAirportId(destinationCity, destinationCountry);

        System.out.println(sourceCity);
        System.out.println(destinationCity);
        System.out.println(sourceAirport);
        System.out.println(destinationAirport);
        try{
            bfs u = new bfs();
            Stack<Node> result = u.BFS().solutionPath();
            u.outputToFile(result);
        }catch(NullPointerException npe){
            System.out.println("No flights from start to destination");
        }




        }




}
