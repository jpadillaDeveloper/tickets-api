package dev.jpadilla.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.jpadilla.api.entity.Ticket;

public interface TicketsRepository extends JpaRepository<Ticket, Integer> {

}
