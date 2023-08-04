package com.db.grad.javaapi.model;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDateTime;

public class SecurityTest {

    @Test
    public void testSecurityConstructorAndGetters() {
        // Create a Security object using the constructor
        Long securityId = 1L;
        String isin = "US1234567890";
        String cusip = "123456789";
        String issuerName = "Test Issuer";
        LocalDateTime maturityDate = LocalDateTime.of(2023, 12, 31, 23, 59, 59);
        float coupon = 2.5f;
        String type = "Bond";
        float faceValue = 1000f;
        String currency = "USD";
        String status = "Active";

        Security security = new Security(securityId, isin, cusip, issuerName, maturityDate, coupon, type, faceValue, currency, status);

        // Check if the constructor sets the fields correctly
        Assert.assertEquals(securityId, security.getId());
        Assert.assertEquals(isin, security.getIsin());
        Assert.assertEquals(cusip, security.getCusip());
        Assert.assertEquals(issuerName, security.getIssuerName());
        Assert.assertEquals(maturityDate, security.getMaturityDate());
        Assert.assertEquals(coupon, security.getCoupon(), 0.0001); // Float comparison with delta
        Assert.assertEquals(type, security.getType());
        Assert.assertEquals(faceValue, security.getFaceValue(), 0.0001); // Float comparison with delta
        Assert.assertEquals(currency, security.getCurrency());
        Assert.assertEquals(status, security.getStatus());
    }

    @Test
    public void testSetters() {
        // Create a Security object using the default constructor
        Security security = new Security();

        // Set the fields using setters
        Long securityId = 2L;
        String isin = "GB0987654321";
        String cusip = "987654321";
        String issuerName = "Another Issuer";
        LocalDateTime maturityDate = LocalDateTime.of(2024, 12, 31, 23, 59, 59);
        float coupon = 3.0f;
        String type = "Stock";
        float faceValue = 500f;
        String currency = "GBP";
        String status = "Inactive";

        security.setId(securityId);
        security.setIsin(isin);
        security.setCusip(cusip);
        security.setIssuerName(issuerName);
        security.setMaturityDate(maturityDate);
        security.setCoupon(coupon);
        security.setType(type);
        security.setFaceValue(faceValue);
        security.setCurrency(currency);
        security.setStatus(status);

        // Check if the setters update the fields correctly
        Assert.assertEquals(securityId, security.getId());
        Assert.assertEquals(isin, security.getIsin());
        Assert.assertEquals(cusip, security.getCusip());
        Assert.assertEquals(issuerName, security.getIssuerName());
        Assert.assertEquals(maturityDate, security.getMaturityDate());
        Assert.assertEquals(coupon, security.getCoupon(), 0.0001); // Float comparison with delta
        Assert.assertEquals(type, security.getType());
        Assert.assertEquals(faceValue, security.getFaceValue(), 0.0001); // Float comparison with delta
        Assert.assertEquals(currency, security.getCurrency());
        Assert.assertEquals(status, security.getStatus());
    }
}
