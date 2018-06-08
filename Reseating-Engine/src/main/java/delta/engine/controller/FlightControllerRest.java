package delta.engine.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import delta.engine.dao.FlightStore;
import delta.engine.model.Flight;

@RestController
public class FlightControllerRest {
	
	
	@GetMapping("/all-flights")
	public List<Flight> flights(){
		return FlightStore.loadAllFligths();
	}
	
	@GetMapping("/all-flights/{id}")
	public Flight findFlight(@PathVariable("id") int flightNumber){
		return FlightStore.findFlight(flightNumber);
	}
	
	
	/*@GetMapping("/all-flights/{name}")
	public Flight findFlightByName(@PathVariable("name") String flightName){
		return FlightStore.findFlightByName(flightName);
	}*/

}
