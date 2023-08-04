package com.db.grad.javaapi.model;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDateTime;

public class TradeTest {

    @Test
    public void testTradeConstructorAndGetters() {
        // Create a Trade object using the constructor
        Long tradeId = 1L;

        Book book = new Book(1L, "Test Book");
        Security security = new Security(1L, "US1234567890", "123456789", "Test Issuer", LocalDateTime.of(2023, 12, 31, 23, 59, 59), 2.5f, "Bond", 1000f, "USD", "Active");
        Counterparty counterparty = new Counterparty(1L, "Test Counterparty");

        String currency = "USD";
        String status = "Active";
        int quantity = 100;
        float unitPrice = 50.5f;
        String buySell = "Buy";
        LocalDateTime tradeDate = LocalDateTime.now();
        LocalDateTime settlementDate = tradeDate.plusDays(3);

        Trade trade = new Trade(tradeId, book, security, counterparty, currency, status, quantity, unitPrice, buySell, tradeDate, settlementDate);

        // Check if the constructor sets the fields correctly
        Assert.assertEquals(tradeId, trade.getId());
        Assert.assertEquals(book, trade.getBook());
        Assert.assertEquals(security, trade.getSecurity());
        Assert.assertEquals(counterparty, trade.getCounterparty());
        Assert.assertEquals(currency, trade.getCurrency());
        Assert.assertEquals(status, trade.getStatus());
        Assert.assertEquals(quantity, trade.getQuantity());
        Assert.assertEquals(unitPrice, trade.getUnitPrice(), 0.0001); // Float comparison with delta
        Assert.assertEquals(buySell, trade.getBuySell());
        Assert.assertEquals(tradeDate, trade.getTradeDate());
        Assert.assertEquals(settlementDate, trade.getSettlementDate());
    }

    @Test
    public void testSetters() {
        // Create a Trade object using the default constructor
        Trade trade = new Trade();

        // Set the fields using setters
        Long tradeId = 2L;

        Book book = new Book(2L, "Another Book");
        Security security = new Security(2L, "GB0987654321", "987654321", "Another Issuer", LocalDateTime.of(2024, 12, 31, 23, 59, 59), 3.0f, "Stock", 500f, "GBP", "Inactive");
        Counterparty counterparty = new Counterparty(2L, "Another Counterparty");

        String currency = "GBP";
        String status = "Inactive";
        int quantity = 200;
        float unitPrice = 30.0f;
        String buySell = "Sell";
        LocalDateTime tradeDate = LocalDateTime.now().minusDays(1);
        LocalDateTime settlementDate = tradeDate.plusDays(2);

        trade.setId(tradeId);
        trade.setBook(book);
        trade.setSecurity(security);
        trade.setCounterparty(counterparty);
        trade.setCurrency(currency);
        trade.setStatus(status);
        trade.setQuantity(quantity);
        trade.setUnitPrice(unitPrice);
        trade.setBuySell(buySell);
        trade.setTradeDate(tradeDate);
        trade.setSettlementDate(settlementDate);

        // Check if the setters update the fields correctly
        Assert.assertEquals(tradeId, trade.getId());
        Assert.assertEquals(book, trade.getBook());
        Assert.assertEquals(security, trade.getSecurity());
        Assert.assertEquals(counterparty, trade.getCounterparty());
        Assert.assertEquals(currency, trade.getCurrency());
        Assert.assertEquals(status, trade.getStatus());
        Assert.assertEquals(quantity, trade.getQuantity());
        Assert.assertEquals(unitPrice, trade.getUnitPrice(), 0.0001); // Float comparison with delta
        Assert.assertEquals(buySell, trade.getBuySell());
        Assert.assertEquals(tradeDate, trade.getTradeDate());
        Assert.assertEquals(settlementDate, trade.getSettlementDate());
    }
}