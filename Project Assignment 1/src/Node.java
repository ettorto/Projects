import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class Node {
    private int state;
    private Node parent;
    private String action;

    public int getStops() {
        return stops;
    }

    private int stops;

     /**
     * 
     * @param state
     * @param parent
     * @param action
     * @param stops
     */
    public Node(int state, Node parent, String action,int stops) {
        this.state = state;
        this.parent = parent;
        this.action = action;
        this.stops = stops;
    }

    public Node(int initState) {
        this.state = initState;
        this.stops = 0;
    }

    public int getState() {
        return state;
    }

    public Node getParent() {
        return parent;
    }

    public String getAction() {
        return action;
    }

    @Override
    public String toString() {
        return "Nodes{" +
                "state='" + state + '\'' +
                ", parent='" + parent + '\'' +
                ", action='" + action + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node node = (Node) o;
        return this.getState() == node.getState();
    }

    public Stack<Node> solutionPath(){
        Node node = this;
        Stack<Node> path = new Stack<>();
        while(node != null){
            path.push(node);
            node = node.parent;
        }
        return path;

    }




}


/**
 * It's a class that implements the Breadth First  Search algorithm
 */
class bfs{
    public static Node BFS() throws IOException {

        Queue<Node> frontier= new LinkedList<>();
        Node start = new Node(Main.sourceAirport.getAirport_ID());
        frontier.add(start);
        HashSet<Integer> exploredSet= new HashSet<>();

        while(!frontier.isEmpty()){
            Node node= frontier.poll();
            exploredSet.add(node.getState());
            System.out.println(Problem.actions(node.getState()));
            for(Route route: Problem.actions(node.getState())){

                try{
                    Node child = new Node(route.getDestination_airportID(),node, route.getAirline_code(), route.getStops());
                    if(route.getDestination_airportID() == Main.destinationAirport.getAirport_ID()){
                        System.out.println(child);
                        return child;
                    }
                    if(!exploredSet.contains(child.getState()) && !frontier.contains(child)){
                        frontier.add(child);
                    }
                }catch(NullPointerException npe){
                    npe.printStackTrace();
                }

            }

        }
        System.out.println("Didn't find any routes");
        return null;
    }

    public void outputToFile(Stack<Node> path) throws IOException {
        FileWriter output = new FileWriter("C:\\Users\\HP\\IdeaProjects\\Project Assignment 1\\Output.txt");
        BufferedWriter outputWriter = new BufferedWriter(output);
        int totalFlights = 0;
        int totalAdditionalStops = 0;

        while(!path.isEmpty()){
            Node node = path.pop();

            if(node.getParent() != null){
                totalFlights += 1;
                totalAdditionalStops += node.getStops();
                String parentAirportCode = Airports.getAirportId(node.getParent().getState()).getIata_code();
                String nodeAirportCode = Airports.getAirportId(node.getState()).getIata_code();
                outputWriter.write(node.getAction() + " from " + parentAirportCode + " to " + nodeAirportCode + " " + node.getStops()+ " stops "+ "\n");

            }

        }
        outputWriter.write("Total Flights: "+ totalFlights+"\n");
        outputWriter.write("Total additional stops: "+totalAdditionalStops+"\n");
        outputWriter.close();
    }

}
