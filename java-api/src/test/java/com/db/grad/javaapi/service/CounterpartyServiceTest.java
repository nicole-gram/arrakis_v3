package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Counterparty;
import com.db.grad.javaapi.repository.CounterpartyRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CounterpartyServiceTest {

    @Mock
    private CounterpartyRepository counterpartyRepository;

    @InjectMocks
    private CounterpartyService counterpartyService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetAllCounterparties() {
        // Prepare
        List<Counterparty> mockCounterparties = new ArrayList<>();
        mockCounterparties.add(new Counterparty(1L, "Counterparty1"));
        mockCounterparties.add(new Counterparty(2L, "Counterparty2"));

        when(counterpartyRepository.findAll()).thenReturn(mockCounterparties);

        // Execute
        List<Counterparty> result = counterpartyService.getAllCounterparties();

        // Verify
        assertEquals(2, result.size());
        assertEquals("Counterparty1", result.get(0).getName());
        assertEquals("Counterparty2", result.get(1).getName());
    }

    @Test
    void testGetCounterpartyById_ExistingId() {
        // Prepare
        Long counterpartyId = 1L;
        Counterparty mockCounterparty = new Counterparty(counterpartyId, "Counterparty1");

        when(counterpartyRepository.findById(counterpartyId)).thenReturn(Optional.of(mockCounterparty));

        // Execute
        Counterparty result = counterpartyService.getCounterpartyById(counterpartyId);

        // Verify
        assertNotNull(result);
        assertEquals("Counterparty1", result.getName());
    }

    @Test
    void testGetCounterpartyById_NonExistingId() {
        // Prepare
        Long nonExistingId = 10L;

        when(counterpartyRepository.findById(nonExistingId)).thenReturn(Optional.empty());

        // Execute and Verify
        assertThrows(EntityNotFoundException.class, () -> counterpartyService.getCounterpartyById(nonExistingId));
    }

    @Test
    void testCreateCounterparty() {
        // Prepare
        Counterparty counterpartyToCreate = new Counterparty(null, "New Counterparty");

        when(counterpartyRepository.save(counterpartyToCreate)).thenReturn(new Counterparty(1L, "New Counterparty"));

        // Execute
        Counterparty createdCounterparty = counterpartyService.createCounterparty(counterpartyToCreate);

        // Verify
        assertNotNull(createdCounterparty.getId());
        assertEquals("New Counterparty", createdCounterparty.getName());
    }

    @Test
    void testUpdateCounterparty() {
        // Prepare
        Long counterpartyId = 1L;
        Counterparty existingCounterparty = new Counterparty(counterpartyId, "Counterparty1");
        Counterparty updatedCounterpartyData = new Counterparty(null, "Updated Counterparty");

        when(counterpartyRepository.findById(counterpartyId)).thenReturn(Optional.of(existingCounterparty));
        when(counterpartyRepository.save(existingCounterparty)).thenReturn(existingCounterparty);

        // Execute
        Counterparty updatedCounterparty = counterpartyService.updateCounterparty(counterpartyId, updatedCounterpartyData);

        // Verify
        assertNotNull(updatedCounterparty);
        assertEquals(counterpartyId, updatedCounterparty.getId());
        assertEquals("Updated Counterparty", updatedCounterparty.getName());
    }

    @Test
    void testDeleteCounterparty() {
        // Prepare
        Long counterpartyId = 1L;

        // Execute
        counterpartyService.deleteCounterparty(counterpartyId);

        // Verify
        verify(counterpartyRepository, times(1)).deleteById(counterpartyId);
    }
}
