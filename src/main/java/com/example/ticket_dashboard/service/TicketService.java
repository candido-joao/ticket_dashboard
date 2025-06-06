package com.example.ticket_dashboard.service;

import com.example.ticket_dashboard.model.Ticket;
import com.example.ticket_dashboard.model.TicketDTO;
import com.example.ticket_dashboard.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TicketService {

    @Autowired
    private TicketRepository repository;

    public TicketDTO getTicketsByMesEAno(int mes, int ano) {
        LocalDate inicio = LocalDate.of(ano, mes, 1);
        LocalDate fim = inicio.withDayOfMonth(inicio.lengthOfMonth());

        List<Ticket> tickets = repository.findByDataAberturaBetween(inicio, fim);

        Map<String, Long> porCliente = tickets.stream()
            .collect(Collectors.groupingBy(Ticket::getCliente, Collectors.counting()));

        Map<String, Long> porModulo = tickets.stream()
            .collect(Collectors.groupingBy(Ticket::getModulo, Collectors.counting()));

        return new TicketDTO(tickets, porCliente, porModulo);
    }

    public Ticket criarTicket(Ticket ticket) {
        return repository.save(ticket);
    }
}