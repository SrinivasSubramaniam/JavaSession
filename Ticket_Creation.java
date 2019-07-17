package test;

import java.util.Scanner;

public class Ticket_Creation {

	public static void main(String[] args) {
		TicketDetails ticketDetail=new TicketDetails();
		TicketApproval ticketApproval=new TicketApproval();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 1 for Create new Ticket or 2 for exit");
		int userInput = sc.nextInt();
		switch (userInput) {
		case 1:
			System.out.println("Please enter ticket description");
			sc.nextLine();
			String inputicketDetailescription = sc.nextLine();
			ticketDetail.setTicketDescription(inputicketDetailescription);
			System.out.println("Please enter ticket type");
			String inputType = sc.nextLine();
			ticketDetail.setTickeType(inputType);
			ticketDetail.setTicketStatus("New");
			System.out.println("");
			System.out.println("Ticket details");
			System.out.println("Number : "+ticketDetail.getTicketNumber());
			System.out.println("Description : "+ticketDetail.getTicketDescription());
			System.out.println("Type : "+ticketDetail.getTickeType());
			System.out.println("Status : "+ticketDetail.getTicketStatus());
			ticketApproval.approve();
			break;
		case 2:
			System.out.println("Exitted");
			System.exit(0);
		default:
			System.out.println("Please enter the correct value");
			break;
		}
sc.close();
	}

}
