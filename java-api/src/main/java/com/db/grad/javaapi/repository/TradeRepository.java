package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Trade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TradeRepository extends JpaRepository<Trade, Long> {
    // You can define custom query methods here if needed
    List<Trade> findByStatus(String status);

    List<Trade> findBySettlementDateBetween(LocalDateTime startDate, LocalDateTime endDate);


}

