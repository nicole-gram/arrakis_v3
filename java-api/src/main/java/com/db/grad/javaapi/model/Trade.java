package com.db.grad.javaapi.model;
import javax.persistence.*;

@Entity
@Table(name = "trades")
public class Trade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @ManyToOne
    @JoinColumn(name = "security_id", nullable = false)
    private Security security;

    @ManyToOne
    @JoinColumn(name = "counterparty_id", nullable = false)
    private Counterparty counterparty;

    @Column(nullable = false, length = 10)
    private String currency;

    @Column(nullable = false, length = 32)
    private String status;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private float unitPrice;

    @Column(nullable = false, length = 32)
    private String buySell;

    @Column(nullable = false)
    private LocalDateTime tradeDate;

    @Column(nullable = false)
    private LocalDateTime settlementDate;

    // Getters and setters, constructors, and other methods as needed
}

