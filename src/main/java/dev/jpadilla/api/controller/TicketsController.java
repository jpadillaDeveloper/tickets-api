package dev.jpadilla.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.jpadilla.api.entity.Ticket;
import dev.jpadilla.api.service.ITicketsService;

@RestController
@RequestMapping("/api")
public class TicketsController {
	
	@Autowired
	private ITicketsService serviceTickets;
	
	@GetMapping("/tickets")
	public List<Ticket> getAllTickets(){
		return serviceTickets.getAllTickets();
	}
	
	@PostMapping("/tickets")
	public Ticket saveTicket(@RequestBody Ticket ticket) {
		serviceTickets.guardarTicket(ticket);
		return ticket;
	}
	
	@PutMapping("/tickets")
	public Ticket editTicket(@RequestBody Ticket ticket) {
		serviceTickets.guardarTicket(ticket);
		return ticket;
	}
	
	@DeleteMapping("/tickets/{id}")
	public String deleteTicket(@PathVariable("id") int idTicket) {
		serviceTickets.eliminarTicket(idTicket);
		return "Ticket Eliminado";
	}

}
