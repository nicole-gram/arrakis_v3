package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.service.CounterpartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/counterparties")
public class CounterpartyController {
    private final CounterpartyService counterpartyService;

    @Autowired
    public CounterpartyController(CounterpartyService counterpartyService) {
        this.counterpartyService = counterpartyService;
    }

    // Define endpoints for counterparty CRUD operations
}

