package com.example.ticket_dashboard.controller;

import com.example.ticket_dashboard.model.Ticket;
import com.example.ticket_dashboard.model.TicketDTO;
import com.example.ticket_dashboard.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    @Autowired
    private TicketService service;

    @GetMapping
    public ResponseEntity<TicketDTO> listarPorMesEAno(
            @RequestParam int mes,
            @RequestParam int ano) {
        return ResponseEntity.ok(service.getTicketsByMesEAno(mes, ano));
    }

    @PostMapping
    public ResponseEntity<Ticket> criarTicket(@RequestBody Ticket ticket) {
        return new ResponseEntity<>(service.criarTicket(ticket), HttpStatus.CREATED);
    }
}