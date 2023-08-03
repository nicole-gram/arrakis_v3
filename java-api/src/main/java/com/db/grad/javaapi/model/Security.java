package com.db.grad.javaapi.model;
import javax.persistence.*;

@Entity
@Table(name = "security")
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String isin;

    @Column(length = 50)
    private String cusip;

    @Column(nullable = false)
    private String issuerName;

    @Column(nullable = false)
    private LocalDateTime maturityDate;

    @Column(nullable = false)
    private float coupon;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private float faceValue;

    @Column(nullable = false)
    private String currency;

    @Column(length = 32)
    private String status;

    // Getters and setters, constructors, and other methods as needed
}
