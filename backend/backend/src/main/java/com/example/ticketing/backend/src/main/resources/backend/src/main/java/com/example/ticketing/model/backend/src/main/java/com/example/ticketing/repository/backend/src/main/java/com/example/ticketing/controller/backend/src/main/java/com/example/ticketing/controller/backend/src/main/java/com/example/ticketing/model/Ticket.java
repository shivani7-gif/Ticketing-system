package com.example.ticketing.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(length = 1000)
    private String description;

    @Column(nullable = false)
    private String status;  // e.g. OPEN, IN_PROGRESS, CLOSED

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;  // the user who created the ticket
}
