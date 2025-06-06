package com.example.ticket_dashboard.repository;

import com.example.ticket_dashboard.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByDataAberturaBetween(LocalDate inicio, LocalDate fim);
}