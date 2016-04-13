package nl.hanze.CarParkSimulation.logic;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Class Reservations
 *
 * @author Koen Hendriks
 * @version 0.1 (13-04-2016)
 */
public final class Reservations {

    private static HashMap<String, ArrayList<Location>> reservations;

    public Reservations() {
        reservations = new HashMap<>();
    }

    /**
     * Method to add a reservation for a company.
     *
     * @param company String with the unique name of the company that makes the reservation
     * @param locations ArrayList with locations that the company has reserved
     */
    public void addReservation(String company, ArrayList<Location> locations ){
        reservations.put(company,locations);
    }

    public ArrayList<Location> getCompanyLocations(String company){
        return reservations.get(company);
    }

    public HashMap<String, ArrayList<Location>> getReservations() {
        return reservations;
    }
}




