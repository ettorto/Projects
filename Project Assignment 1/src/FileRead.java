import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;




public class FileRead {

    // This method will read a CSV file and return a List of String[]
    public static ArrayList<String[]> get(String filename) {
        ArrayList<String[]> data = new ArrayList<String[]>();
        String testRow;
        try {
            // Open and read the file
            BufferedReader br = new BufferedReader(new FileReader(filename));
            // Read data as long as it's not empty
            // Parse the data by comma using .split() method
            // Place into a temporary array, then add to List
            while ((testRow = br.readLine()) != null) {
                String[] line = testRow.split(",");
                data.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found " + filename);
        } catch (IOException e) {
            System.out.println("ERROR: Could not read " + filename);
        }
        return data;
    }
}
