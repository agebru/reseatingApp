package delta.engine.model;

import java.time.LocalDateTime;

public class Flight {
	private int flightNumber;
	private String name;
	private String from;
	private String to;
	private LocalDateTime startTime;
	private LocalDateTime destinationTime;

	public Flight() {

	}

	public Flight(int flightNumber, String name, String from, String to, LocalDateTime startTime,
			LocalDateTime destinationTime) {
		this.flightNumber = flightNumber;
		this.name = name;
		this.from = from;
		this.to = to;
		this.startTime = startTime;
		this.destinationTime = destinationTime;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getDestinationTime() {
		return destinationTime;
	}

	public void setDestinationTime(LocalDateTime destinationTime) {
		this.destinationTime = destinationTime;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", name=" + name + ", from=" + from + ", to=" + to
				+ ", startTime=" + startTime + ", destinationTime=" + destinationTime + "]";
	}
	
	
	

}
