package test;

import java.util.Scanner;

public class TicketApproval {
 public void approve()
 {
	 TicketDetails ticketDetail=new TicketDetails();
	 System.out.println("");
	 System.out.println("Approver: Please enter 3 for approve and 4 for cancel/Reject");
	 Scanner sc=new Scanner(System.in);
	 int approverInput = sc.nextInt();
	 switch (approverInput) {
	case 3:
		ticketDetail.setTicketStatus("Approved");
		System.out.println("Please Enter ticket resolution details ");
		sc.nextLine();
		String resolution = sc.nextLine();
		ticketDetail.setTicketResolution(resolution);
		System.out.println("");
		System.out.println("Ticket details");
		System.out.println("Number : "+ticketDetail.getTicketNumber());
		System.out.println("Description : "+ticketDetail.getTicketDescription());
		System.out.println("Type : "+ticketDetail.getTickeType());
		System.out.println("Status : "+ticketDetail.getTicketStatus());
		System.out.println("Resolution : "+ticketDetail.getTicketResolution());
		System.out.println("");
		System.out.println("User Input: ");
		System.out.println("Please enter 5 for close the ticket");
		int userFinalInput = sc.nextInt();
		if(userFinalInput==5)
		{
			ticketDetail.setTicketStatus("Close");
			System.out.println(" ");
			System.out.println("Number : "+ticketDetail.getTicketNumber());
			System.out.println("Description : "+ticketDetail.getTicketDescription());
			System.out.println("Type : "+ticketDetail.getTickeType());
			System.out.println("Status : "+ticketDetail.getTicketStatus());
			System.out.println("Resolution : "+ticketDetail.getTicketResolution());
		}else
		{System.out.println("Please provide correct value");}
		break;
	case 4:
		ticketDetail.setTicketStatus("Cancelled");
		System.out.println("");
		System.out.println("Ticket details");
		System.out.println("Number : "+ticketDetail.getTicketNumber());
		System.out.println("Description : "+ticketDetail.getTicketDescription());
		System.out.println("Type : "+ticketDetail.getTickeType());
		System.out.println("Status : "+ticketDetail.getTicketStatus());
		System.out.println("Resolution : "+ticketDetail.getTicketResolution());
		break;

	default:
		System.out.println("Please provide correct details");
		break;
	}
	 sc.close();
 }

}
