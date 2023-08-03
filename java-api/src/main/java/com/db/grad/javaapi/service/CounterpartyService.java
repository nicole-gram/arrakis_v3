package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Counterparty;
import com.db.grad.javaapi.repository.CounterpartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class CounterpartyService {
    private final CounterpartyRepository counterpartyRepository;

    @Autowired
    public CounterpartyService(CounterpartyRepository counterpartyRepository) {
        this.counterpartyRepository = counterpartyRepository;
    }

    public List<Counterparty> getAllCounterparties() {
        return counterpartyRepository.findAll();
    }

    public Counterparty getCounterpartyById(Long id) {
        return counterpartyRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Counterparty not found with id: " + id));
    }

    public Counterparty createCounterparty(Counterparty counterparty) {
        return counterpartyRepository.save(counterparty);
    }

    public Counterparty updateCounterparty(Long id, Counterparty updatedCounterparty) {
        Counterparty counterparty = getCounterpartyById(id);
        counterparty.setName(updatedCounterparty.getName());
        return counterpartyRepository.save(counterparty);
    }

    public void deleteCounterparty(Long id) {
        counterpartyRepository.deleteById(id);
    }
}
