package dkit.oop;

import java.util.ArrayList;
import java.util.List;

public class PassengerAirplane extends Airplane {

    // fields(Q2)
    private final int MAX_NUM_PASSENGERS;
    private ArrayList<String> passengerList;

    PassengerAirplane(String type, int maxNumPassengers) {
        // code here
        super(type);
        this.MAX_NUM_PASSENGERS = maxNumPassengers;
        passengerList = new ArrayList<>();
    }

    public void addPassenger(String name) {
        // code here
        if(passengerList.size() < MAX_NUM_PASSENGERS)
        {
            passengerList.add(name);
        }
        else
        {
            System.out.println("Sorry! The airplane has no more vacancies.");
        }

    }

    // Adding getter for passengerList
    public ArrayList<String> getPassengerList() {
        return passengerList;
    }

    // toString
    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "id='" + super.getId() + '\'' +
                ", type='" + super.getType() + '\'' +
                ", max_num_passengers=" + MAX_NUM_PASSENGERS + '\'' +
                ", passengerList=" + passengerList +  '\'';
    }
} // end of PassengerAirplane
