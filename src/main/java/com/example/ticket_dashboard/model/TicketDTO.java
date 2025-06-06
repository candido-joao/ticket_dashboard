package com.example.ticket_dashboard.model;

import java.util.List;
import java.util.Map;

public class TicketDTO {
    private List<Ticket> tickets;
    private Map<String, Long> chamadosPorCliente;
    private Map<String, Long> chamadosPorModulo;

    public TicketDTO(List<Ticket> tickets, Map<String, Long> chamadosPorCliente, Map<String, Long> chamadosPorModulo) {
        this.tickets = tickets;
        this.chamadosPorCliente = chamadosPorCliente;
        this.chamadosPorModulo = chamadosPorModulo;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Map<String, Long> getChamadosPorCliente() {
        return chamadosPorCliente;
    }

    public void setChamadosPorCliente(Map<String, Long> chamadosPorCliente) {
        this.chamadosPorCliente = chamadosPorCliente;
    }

    public Map<String, Long> getChamadosPorModulo() {
        return chamadosPorModulo;
    }

    public void setChamadosPorModulo(Map<String, Long> chamadosPorModulo) {
        this.chamadosPorModulo = chamadosPorModulo;
    }
}