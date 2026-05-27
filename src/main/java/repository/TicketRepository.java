package com.example.helpdesk.repository;

import com.example.helpdesk.model.Ticket;
import com.example.helpdesk.model.TicketStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    // Получить все заявки, отсортированные по дате (новые сначала)
    List<Ticket> findAllByOrderByCreatedAtDesc();

    // Найти заявки по статусу
    List<Ticket> findByStatus(TicketStatus status);
}