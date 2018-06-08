package delta.engine.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import delta.engine.model.Flight;

public class FlightStore {
	private static List<Flight> flights = new ArrayList<>();

	private FlightStore() {

	}

	static {
		Flight flight1 = new Flight(1001, "Delta01", "Chicago", "Atlanta", LocalDate.now().atTime(9, 30),
				LocalDate.now().atTime(10, 30));

		Flight flight2 = new Flight(1104, "Delta30", "Columbus", "Maryland", LocalDate.now().atTime(11, 35),
				LocalDate.now().atTime(12, 30));
		Flight flight3 = new Flight(1220, "Delta40", "Lost Angelos", "Iowa", LocalDate.now().atTime(8, 30),
				LocalDate.now().atTime(10, 30));
		Flight flight4 = new Flight(1031, "Delta66", "New York", "DC", LocalDate.now().atTime(1, 40),
				LocalDate.now().atTime(3, 30));
		Flight flight5 = new Flight(1079, "Delta32", "Chicago", "Atlanta", LocalDate.now().atTime(4, 10),
				LocalDate.now().atTime(6, 45));

		flights.add(flight1);
		flights.add(flight2);
		flights.add(flight3);
		flights.add(flight4);
		flights.add(flight5);

	}

	public static List<Flight> loadAllFligths() {
		return flights;
	}

	public static Flight findFlight(int flightNumber) {
		return flights.stream()
				      .filter(flyt -> flyt.getFlightNumber() == flightNumber)
				      .findFirst().get();
	}
	
	public static Flight findFlightByName(String name) {
		return flights.stream()
				      .filter(flyt -> flyt.getName().equals(name))
				      .findFirst().get();
	}

}
