package delta.engine.service;

import java.util.List;

import delta.engine.model.Flight;

public interface IFlightService {
	List<Flight> getAllFilights();
	void addFlight(Flight flight);
	Flight findOne(int flightNumber);
	
	void deleteFlight(int flightNumber);

}
