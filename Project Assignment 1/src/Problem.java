
import java.io.IOException;
import java.util.ArrayList;

public class Problem {
   // Creating a new array list of routes.
    private int initState;
    private int goalState;
    private static ArrayList<Route> routeArray= Main.routeArray;

   // A constructor.
    public Problem(int initState, int goalState) {
        this.initState = initState;
        this.goalState = goalState;
    }

   
    public int  getInitState() {
        return initState;
    }

    public int getGoalState() {
        return goalState;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "initState='" + initState + '\'' +
                ", goalState='" + goalState + '\'' +
                '}';
    }

    public boolean goalTest(int state){
        return state==goalState;
    }

    /**
     * This function takes in a state and returns all the possible actions that can be taken from that
     * state
     * 
     * @param state the current state
     * @return The actions method returns an ArrayList of Route objects.
     */
    public static ArrayList<Route> actions(int state) throws IOException {
        ArrayList<Route> actions= new ArrayList<>();
//
        for (Route route : routeArray){

            if(route.getSource_aiportID()== state){
                actions.add(route);
            }
        }

        return actions;
    }
}
