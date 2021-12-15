package dkit.oop;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * AirplaneManager is a container class that stores Airplanes
 * (of various class types) in a list.
 * It provides a public interface of methods that can
 * be used to manage the planes in the list.
 * It "encapsulates" the logic for managing Airplanes
 * and "hides" the data structures used to store the data.
 */
public class AirplaneManager {

    ArrayList<Airplane> airplaneList;

    public AirplaneManager() {
        airplaneList = new ArrayList<>();
    }

    //Q3.

    // write add() method
    public void add(Airplane airplane)
    {
        airplaneList.add(airplane);
    }


    public void displayAllAirplanes() {
        // add code
        System.out.println("\nDisplaying all airplanes: \n");

        for(Airplane airplane : airplaneList)
        {
            System.out.println(airplane);
        }
    }

    public void displayAllPassengerAirplanes() {
        // add code
        System.out.println("\nDisplaying only the passenger airplanes: \n");

        for(Airplane airplane: airplaneList)
        {
            if(airplane instanceof PassengerAirplane)
            {
                System.out.println(airplane);
            }
        }
    }

    //  write method getAllCargoAirplanes()
    public List<Airplane> getAllCargoAirplanes()
    {
        List<Airplane> cargoAirplanes = new ArrayList<>();

        for(Airplane airplane :  airplaneList)
        {
            if(airplane instanceof CargoAirplane)
            {
                cargoAirplanes.add(airplane);
            }
        }

        return cargoAirplanes;
    }

    // write  addPassengerNameToAirplane( airplaneId, passengerName)
    public boolean addPassengerNameToAirplane(int airplaneID, String passengerName)
    {
        for(Airplane airplane : airplaneList)
        {
            if(airplane.getId() == airplaneID && airplane instanceof PassengerAirplane)
            {
                ((PassengerAirplane) airplane).addPassenger(passengerName);
                return true;
            }
        }

        return false;
    }


    // write containsAirplane( Airplane plane )
    public boolean containsAirplane(Airplane plane)
    {
        for(Airplane airplane : airplaneList)
        {
            if(airplane.getId() == plane.getId())
            {
                return true;
            }
        }
        return false;
    }

    // write findAirplaneByPassengerName( passengerName )
    public Airplane findAirplaneByPassengerName(String passengerName)
    {
        for(Airplane airplane : airplaneList)
        {
            if(airplane instanceof PassengerAirplane)
            {
                if(((PassengerAirplane) airplane).getPassengerList().contains(passengerName))
                {
                    return airplane;
                }
            }
        }

        return null;
    }




} // end of AirplaneManager

