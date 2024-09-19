package com.nischitha.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nischitha.binding.Passenger;
import com.nischitha.binding.Ticket;
import com.nischitha.service.TicketService;


@RestController
public class TicketController {

	private TicketService ticketService;
	
	public TicketController(TicketService ticketService) {
		this.ticketService=ticketService;
	}
	
	@PostMapping("/ticket")
	public Ticket bookTicket(@RequestBody Passenger p) {
		Ticket bookTicket = ticketService.bookTicket(p);
		return bookTicket;
	}
	
	@GetMapping("/tickets")
	public Collection<Ticket>  getAllTickets() {
		Collection<Ticket> allTickets = ticketService.getAllTickets();
		return allTickets;
	}
	
	
}
