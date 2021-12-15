package dkit.oop;

import java.util.List;
import java.util.Scanner;

/**
 * OOP CA2 December 2021 - Airplane Management System  STARTER CODE
 * Annas Mohammed Khan
 * SD2a
 */
public class App
{
    public static void main( String[] args ){
        new App().start();
    }

    private void start() {

        System.out.println("OOP - CA2 - 20% - December 2021 - AirplaneManager");

        //Q2
        CargoAirplane cargoPlane1 = new CargoAirplane("Douglas DC-4",20000);
        CargoAirplane cargoPlane2 = new CargoAirplane("Boeing C-7000",25000);

        // display the two objects
        System.out.println("\nPrinting cargoPlane1: \n" + cargoPlane1);
        System.out.println("\nPrinting cargoPlane2: \n" + cargoPlane2);

        AirplaneManager mgr = new AirplaneManager();

        //Q2
        PassengerAirplane passengerPlane1 = new PassengerAirplane("Boeing 747",524);
        PassengerAirplane passengerPlane2 = new PassengerAirplane("Airbus 380",525);
//         //Add passengers to Passenger planes
        passengerPlane1.addPassenger("Tom Hardy");
        passengerPlane1.addPassenger("Margot Robbie");
        passengerPlane2.addPassenger("Emma Thompson");

        System.out.println("\nPrinting passengerPlane1 :\n" + passengerPlane1);
        System.out.println("\nPrinting passengerPlane2 :\n" + passengerPlane2);

        //Q3

        // write calls to methods implemented for Q3.

        // Adding the four airplanes to the airplane manager
        mgr.add(cargoPlane1);
        mgr.add(cargoPlane2);
        mgr.add(passengerPlane1);
        mgr.add(passengerPlane2);

        // Displaying all airplanes:
        mgr.displayAllAirplanes();

        // Displaying only the passenger airplanes:
        mgr.displayAllPassengerAirplanes();

        // Getting and printing all cargo airplanes:
        List<Airplane> allCargoAirplanes = mgr.getAllCargoAirplanes();
        System.out.println("\nPrinting all cargo airplanes: \n");
        for(Airplane airplane : allCargoAirplanes)
        {
            System.out.println(airplane);
        }

        // Testing addPassengerNameToAirplane method:
        System.out.println("\nTesting addPassengerNameToAirplane(): \n");
        boolean addedPassenger = mgr.addPassengerNameToAirplane(107, "Tom Holland");
        System.out.println(addedPassenger);
        System.out.println("Printing all passenger airplanes to verify if new passenger has been added: \n");
        mgr.displayAllPassengerAirplanes();

        // Testing containsAirplane method:
        boolean containsPassengerPlane1 = mgr.containsAirplane(passengerPlane1);
        boolean containsNewPlane = mgr.containsAirplane(new CargoAirplane("Douglas DC-4",20000));

        System.out.println("\nContains passengerPlane1 : " + containsPassengerPlane1);
        System.out.println("Contains new plane with same values (except id) as cargoPlane1 : " + containsNewPlane);

        // Testing findAirplaneByPassengerName method:
        Airplane findPlaneWithMargorRobbie = mgr.findAirplaneByPassengerName("Margot Robbie");
        System.out.println("\nPlane that has Margot Robbie as a passenger: " + findPlaneWithMargorRobbie);
        Airplane findPlaneWithAnnasKhan = mgr.findAirplaneByPassengerName("Annas Khan");
        System.out.println("Plane that has Keanu Reeves as a passenger: " + findPlaneWithAnnasKhan);


        //Question 4
        // Uncomment all the code below and implement the two methods
        // in the CityDistanceManager class.

        CityDistanceManager cityDistanceManager = new CityDistanceManager();
        cityDistanceManager.printCitiesData();

        Scanner keyboard = new Scanner(System.in);
        System.out.print("\nPlease enter first city name:");
        String city1 = keyboard.nextLine();
        System.out.print("Please enter second city name:");
        String city2 = keyboard.nextLine();

        int distance = cityDistanceManager.findDistanceBetween(city1, city2);
        System.out.println("Distance between " + city1 + " and " + city2 + " = " + distance);

        System.out.print("\nEnter base city name:");
        String baseCity = keyboard.nextLine();

        String closestCity = cityDistanceManager.findClosestCityTo(baseCity);
        System.out.println("Closest city to " + baseCity+" = " + closestCity);

    }
}