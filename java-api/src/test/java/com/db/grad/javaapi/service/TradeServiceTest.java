package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.repository.TradeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class TradeServiceTest {

    @Mock
    private TradeRepository tradeRepository;

    @InjectMocks
    private TradeService tradeService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllTrades() {
        List<Trade> trades = new ArrayList<>();
        trades.add(new Trade());
        trades.add(new Trade());

        when(tradeRepository.findAll()).thenReturn(trades);

        List<Trade> result = tradeService.getAllTrades();

        assertEquals(2, result.size());
        verify(tradeRepository, times(1)).findAll();
    }

    @Test
    void testGetTradeByIdFound() {
        long tradeId = 1L;
        Trade trade = new Trade();
        trade.setId(tradeId);

        when(tradeRepository.findById(tradeId)).thenReturn(Optional.of(trade));

        Trade result = tradeService.getTradeById(tradeId);

        assertEquals(trade, result);
        verify(tradeRepository, times(1)).findById(tradeId);
    }

    @Test
    void testGetTradeByIdNotFound() {
        long tradeId = 1L;

        when(tradeRepository.findById(tradeId)).thenReturn(Optional.empty());

        EntityNotFoundException exception = assertThrows(EntityNotFoundException.class,
                () -> tradeService.getTradeById(tradeId));

        assertEquals("Trade not found with id: " + tradeId, exception.getMessage());
        verify(tradeRepository, times(1)).findById(tradeId);
    }

    @Test
    void testCreateTrade() {
        Trade tradeToCreate = new Trade();
        tradeToCreate.setQuantity(100);

        when(tradeRepository.save(any(Trade.class))).thenReturn(tradeToCreate);

        Trade createdTrade = tradeService.createTrade(tradeToCreate);

        assertNotNull(createdTrade.getId());
        assertEquals(100, createdTrade.getQuantity());
        verify(tradeRepository, times(1)).save(tradeToCreate);
    }

    @Test
    void testUpdateTrade() {
        long tradeId = 1L;
        Trade existingTrade = new Trade();
        existingTrade.setId(tradeId);
        existingTrade.setQuantity(50);

        Trade updatedTrade = new Trade();
        updatedTrade.setQuantity(100);

        when(tradeRepository.findById(tradeId)).thenReturn(Optional.of(existingTrade));
        when(tradeRepository.save(any(Trade.class))).thenReturn(updatedTrade);

        Trade result = tradeService.updateTrade(tradeId, updatedTrade);

        assertEquals(updatedTrade.getQuantity(), result.getQuantity());
        verify(tradeRepository, times(1)).findById(tradeId);
        verify(tradeRepository, times(1)).save(existingTrade);
    }

    @Test
    void testDeleteTrade() {
        long tradeId = 1L;

        tradeService.deleteTrade(tradeId);

        verify(tradeRepository, times(1)).deleteById(tradeId);
    }

    @Test
    void testGetActiveTrades() {
        List<Trade> activeTrades = new ArrayList<>();
        activeTrades.add(new Trade());
        activeTrades.add(new Trade());

        when(tradeRepository.findByStatus("active")).thenReturn(activeTrades);

        List<Trade> result = tradeService.getActiveTrades();

        assertEquals(2, result.size());
        verify(tradeRepository, times(1)).findByStatus("active");
    }

    @Test
    void testGetTradesWithinFiveDays() {
        LocalDateTime today = LocalDateTime.now().withYear(2021);
        LocalDateTime fiveDaysFromNow = today.plusDays(5);

        List<Trade> trades = new ArrayList<>();
        trades.add(new Trade());
        trades.add(new Trade());

        when(tradeRepository.findBySettlementDateBetween(today, fiveDaysFromNow)).thenReturn(trades);

        List<Trade> result = tradeService.getTradesWithinFiveDays();

        assertEquals(2, result.size());
        verify(tradeRepository, times(1)).findBySettlementDateBetween(today, fiveDaysFromNow);
    }

    @Test
    void testGetTradesWithinFiveDaysBehind() {
        LocalDateTime today = LocalDateTime.now().withYear(2021);
        LocalDateTime fiveDaysFromPast = today.minusDays(5);

        List<Trade> trades = new ArrayList<>();
        trades.add(new Trade());
        trades.add(new Trade());

        when(tradeRepository.findBySettlementDateBetween(fiveDaysFromPast, today)).thenReturn(trades);

        List<Trade> result = tradeService.getTradesWithinFiveDaysBehind();

        assertEquals(2, result.size());
        verify(tradeRepository, times(1)).findBySettlementDateBetween(fiveDaysFromPast, today);
    }

    // As for getBookOfTrades method, it uses a fixed clientId value (1L) which may need to be handled differently for testing
    // You can either provide a test method with a different clientId or consider refactoring the method to accept clientId as a parameter
    // For now, we'll use a basic test with a fixed clientId of 1L
    @Test
    void testGetBookOfTrades() {
        long clientId = 1L;

        List<Trade> trades = new ArrayList<>();
        trades.add(new Trade());
        trades.add(new Trade());

        when(tradeRepository.findByClientId(clientId)).thenReturn(trades);

        List<Trade> result = tradeService.getBookOfTrades();

        assertEquals(2, result.size());
        verify(tradeRepository, times(1)).findByClientId(clientId);
    }
}
