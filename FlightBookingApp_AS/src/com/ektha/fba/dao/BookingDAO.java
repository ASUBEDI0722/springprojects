package com.ektha.fba.dao;

import com.ektha.fba.entity.Ticket;
import com.ektha.fba.entity.TicketDBTable;

public class BookingDAO {
	
	public void saveTicket(Ticket ticket) {
		
		TicketDBTable ticketDBTable = new TicketDBTable();
		ticketDBTable.setTicket(ticket);
		
	}
}
