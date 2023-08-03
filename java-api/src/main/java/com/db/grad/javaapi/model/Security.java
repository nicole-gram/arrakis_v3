package com.db.grad.javaapi.model;
import javax.persistence.*;
import java.time.LocalDateTime;

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

    public Security(){}
    public Security(Long id, String isin, String cusip, String issuerName, LocalDateTime maturityDate, float coupon, String type, float faceValue, String currency, String status) {
        this.id = id;
        this.isin = isin;
        this.cusip = cusip;
        this.issuerName = issuerName;
        this.maturityDate = maturityDate;
        this.coupon = coupon;
        this.type = type;
        this.faceValue = faceValue;
        this.currency = currency;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public LocalDateTime getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(LocalDateTime maturityDate) {
        this.maturityDate = maturityDate;
    }

    public float getCoupon() {
        return coupon;
    }

    public void setCoupon(float coupon) {
        this.coupon = coupon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(float faceValue) {
        this.faceValue = faceValue;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
