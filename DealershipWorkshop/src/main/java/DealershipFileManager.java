import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DealershipFileManager {
    public Dealership getDealership() {
        String filePath = "dealership.txt";

        Dealership dealership;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String firstLine = br.readLine();

            String name = null;
            String addy = null;
            String num = null;
            if (firstLine != null) {
                // Split the line using the '|' delimiter
                String[] parts = firstLine.split("\\|");
                name = parts[0];
                addy = parts[1];
                num = parts[2];
            }
            dealership = new Dealership(name, addy, num);
            ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] vehicle = line.split("\\|");
                int vin = Integer.parseInt(vehicle[0]);
                int year = Integer.parseInt(vehicle[1]);
                String make = vehicle[2];
                String model = vehicle[3];
                String type = vehicle[4];
                String color = vehicle[5];
                int odo = Integer.parseInt(vehicle[6]);
                double price = Double.parseDouble(vehicle[7]);
                dealership.addVehicle(new Vehicle(vin, year, make, model, type, color, odo, price));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return dealership;
    }
}
