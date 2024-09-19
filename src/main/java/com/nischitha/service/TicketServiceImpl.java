package com.nischitha.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.nischitha.binding.Passenger;
import com.nischitha.binding.Ticket;

@Service
public class TicketServiceImpl implements TicketService{

	Map<Integer, Ticket> db=new HashMap<>();
	
	
	@Override
	public Ticket bookTicket(Passenger p) {

		Ticket t = new Ticket();
		
		Random r = new Random();
		int ticketNum = r.nextInt(5);
		t.setTicketNum(ticketNum);
		
	    BeanUtils.copyProperties(p, t);
	    
	    t.setStatus("CONFIRMED");
	    
	    db.put(ticketNum, t);
	    
		return t;
	}

	@Override
	public Collection<Ticket> getAllTickets() {
       Collection<Ticket> values = db.values();
		return values;
	}

}
