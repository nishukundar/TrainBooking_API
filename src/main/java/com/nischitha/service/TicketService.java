package com.nischitha.service;

import java.util.Collection;


import com.nischitha.binding.Passenger;
import com.nischitha.binding.Ticket;

public interface TicketService {

	public Ticket bookTicket(Passenger p);
	public Collection<Ticket> getAllTickets();
}
