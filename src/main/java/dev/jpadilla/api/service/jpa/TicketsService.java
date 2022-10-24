package dev.jpadilla.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.jpadilla.api.entity.Ticket;
import dev.jpadilla.api.repository.TicketsRepository;
import dev.jpadilla.api.service.ITicketsService;

@Service
public class TicketsService implements ITicketsService {

	@Autowired
	private TicketsRepository repoTickets;
	
	public List<Ticket> getAllTickets() {
		return repoTickets.findAll();
	}

	@Override
	public void guardarTicket(Ticket ticket) {
		repoTickets.save(ticket);		
	}

	@Override
	public void eliminarTicket(int idTicket) {
		repoTickets.deleteById(idTicket);		
	}

}
