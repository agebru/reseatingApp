package delta.engine.app;

import java.util.List;

import delta.engine.dao.FlightStore;
import delta.engine.model.Flight;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       List<Flight> flightData=FlightStore.loadAllFligths();
       
       // all flights
       System.out.println("All Flights:\n ========================================\n");
       flightData.stream().forEach(System.out::println);
       
       //only flights to Atlanta
       System.out.println("\n=======================================================================================================\n\n"
       		+ " Flights to Atlanta\n ========================================\n");
       flightData.stream()
       .filter(fl->fl.getTo().equals("Atlanta"))
       .forEach(System.out::println);
    }
}
