package delta.engine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import delta.engine.dao.FlightStore;

@Controller
public class FlightController {
	
	@RequestMapping("/flights")
	public String allFlights(Model model) {
		model.addAttribute("allFlights",FlightStore.loadAllFligths());
		model.addAttribute("size", FlightStore.loadAllFligths().size());
		return "flights-form";
	}
	
	
	@RequestMapping("/search")
	public String findFlight() {
		return "search-flight-form";
	}

}
