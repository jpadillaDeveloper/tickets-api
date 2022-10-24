package dev.jpadilla.api.service;

import java.util.List;

import dev.jpadilla.api.entity.Ticket;

public interface ITicketsService {
	
	List<Ticket> getAllTickets();
	
	void guardarTicket(Ticket ticket);
	
	void eliminarTicket(int idTicket);

}
