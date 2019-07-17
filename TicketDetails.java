package test;

import java.util.Scanner;

public class TicketDetails {	
	static String ticketDescription;
	static String tickeType;
	static int ticketNumber=100;
	static String ticketStatus;
	static String ticketResolution;
	public String getTicketDescription() {
		return ticketDescription;
	}
	public void setTicketDescription(String ticketDescription) {
		TicketDetails.ticketDescription = ticketDescription;
	}
	public String getTickeType() {
		return tickeType;
	}
	public void setTickeType(String tickeType) {
		TicketDetails.tickeType = tickeType;
	}
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		TicketDetails.ticketNumber = ticketNumber;
		ticketNumber++;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		switch (ticketStatus) {
		case "New":
			TicketDetails.ticketStatus = "New";
			break;
		case "Approve":
			TicketDetails.ticketStatus = "Approve";
			break;
		case "Close":
			TicketDetails.ticketStatus = "Close";
			break;
		default:
			break;
		}
	}
	public String getTicketResolution() {
		return ticketResolution;
	}
	public void setTicketResolution(String ticketResolution) {
		TicketDetails.ticketResolution = ticketResolution;
	}
	

	

}
