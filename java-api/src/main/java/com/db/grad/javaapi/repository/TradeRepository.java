package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.model.Trade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TradeRepository extends JpaRepository<Trade, Long> {
    // You can define custom query methods here if needed
    List<Trade> findByStatus(String status);

    List<Trade> findBySettlementDateBetween(LocalDateTime startDate, LocalDateTime endDate);
    @Query(nativeQuery = true, value = "SELECT t.* " +
            "FROM trades t " +
            "INNER JOIN book_client bc ON t.book_id = bc.book_id " +
            "INNER JOIN client c ON bc.client_id = c.id " +
            "WHERE c.id = :client_id")
    List<Trade> findByClientId(@Param("client_id") Long clientId);





}

