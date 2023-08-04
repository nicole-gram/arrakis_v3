package com.db.grad.javaapi.model;

import org.junit.Assert;
import org.junit.Test;

public class CounterpartyTest {

    @Test
    public void testCounterpartyConstructorAndGetters() {
        // Create a Counterparty object using the constructor
        Long counterpartyId = 1L;
        String counterpartyName = "Test Counterparty";
        Counterparty counterparty = new Counterparty(counterpartyId, counterpartyName);

        // Check if the constructor sets the fields correctly
        Assert.assertEquals(counterpartyId, counterparty.getId());
        Assert.assertEquals(counterpartyName, counterparty.getName());
    }

    @Test
    public void testSetters() {
        // Create a Counterparty object using the default constructor
        Counterparty counterparty = new Counterparty();

        // Set the fields using setters
        Long counterpartyId = 2L;
        String counterpartyName = "Another Counterparty";
        counterparty.setId(counterpartyId);
        counterparty.setName(counterpartyName);

        // Check if the setters update the fields correctly
        Assert.assertEquals(counterpartyId, counterparty.getId());
        Assert.assertEquals(counterpartyName, counterparty.getName());
    }
}
