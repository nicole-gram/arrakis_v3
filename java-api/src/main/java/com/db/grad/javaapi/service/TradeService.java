package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class TradeService {
    private final TradeRepository tradeRepository;

    @Autowired
    public TradeService(TradeRepository tradeRepository) {
        this.tradeRepository = tradeRepository;
    }

    public List<Trade> getAllTrades() {
        return tradeRepository.findAll();
    }

    public Trade getTradeById(Long id) {
        return tradeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Trade not found with id: " + id));
    }

    public Trade createTrade(Trade trade) {
        return tradeRepository.save(trade);
    }

    public Trade updateTrade(Long id, Trade updatedTrade) {
        Trade trade = getTradeById(id);
        trade.setBook(updatedTrade.getBook());
        trade.setSecurity(updatedTrade.getSecurity());
        trade.setCounterparty(updatedTrade.getCounterparty());
        trade.setCurrency(updatedTrade.getCurrency());
        trade.setStatus(updatedTrade.getStatus());
        trade.setQuantity(updatedTrade.getQuantity());
        trade.setUnitPrice(updatedTrade.getUnitPrice());
        trade.setBuySell(updatedTrade.getBuySell());
        trade.setTradeDate(updatedTrade.getTradeDate());
        trade.setSettlementDate(updatedTrade.getSettlementDate());
        return tradeRepository.save(trade);
    }

    public void deleteTrade(Long id) {
        tradeRepository.deleteById(id);
    }

    public List<Trade> getActiveTrades() {
        return tradeRepository.findByStatus("active");
    }

    public List<Trade> getTradesWithinFiveDays() {
        LocalDateTime today = LocalDateTime.now();
        today = today.withYear(2021);
        LocalDateTime fiveDaysFromNow = today.plusDays(5);
        return tradeRepository.findBySettlementDateBetween(today, fiveDaysFromNow);
    }

    public List<Trade> getTradesWithinFiveDaysBehind() {
        LocalDateTime today = LocalDateTime.now();
        today = today.withYear(2021);
        LocalDateTime fiveDaysFromPast = today.minusDays(5);
        return tradeRepository.findBySettlementDateBetween(fiveDaysFromPast,today);
    }

    public List<Trade> getBookOfTrades() {
        //client_id--> book_client and get the book id then get any
        // trade that matches book ids
        Long clientId = 1L;
        return tradeRepository.findByClientId(cliend);
    }



}

