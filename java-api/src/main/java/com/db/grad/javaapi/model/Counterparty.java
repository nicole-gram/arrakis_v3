package com.db.grad.javaapi.model;

import javax.persistence.*;

@Entity
@Table(name = "counterparty")
public class Counterparty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    // Getters and setters, constructors, and other methods as needed
}
