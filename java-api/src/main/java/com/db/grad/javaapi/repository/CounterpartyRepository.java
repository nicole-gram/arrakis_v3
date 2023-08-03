package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Counterparty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CounterpartyRepository extends JpaRepository<Counterparty, Long> {
    // You can define custom query methods here if needed
}
