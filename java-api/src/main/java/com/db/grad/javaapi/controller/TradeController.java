package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trades")
public class TradeController {
    private final TradeService tradeService;

    @Autowired
    public TradeController(TradeService tradeService) {
        this.tradeService = tradeService;
    }

    // Define endpoints for trade CRUD operations

    @GetMapping("/{active}")
    public ResponseEntity<List<Trade>> getActiveTrades() {
        List<Trade> activeTrades = tradeService.getActiveTrades();
        return ResponseEntity.ok(activeTrades);
    }

    @GetMapping("/within-five-days")
    public List<Trade> getTradesWithinFiveDays() {
        return tradeService.getTradesWithinFiveDays();
    }

}
