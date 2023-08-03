package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class SecurityService {
    private final SecurityRepository securityRepository;

    @Autowired
    public SecurityService(SecurityRepository securityRepository) {
        this.securityRepository = securityRepository;
    }

    public List<Security> getAllSecurities() {
        return securityRepository.findAll();
    }

    public Security getSecurityById(Long id) {
        return securityRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Security not found with id: " + id));
    }

    public Security createSecurity(Security security) {
        return securityRepository.save(security);
    }

    public Security updateSecurity(Long id, Security updatedSecurity) {
        Security security = getSecurityById(id);
        security.setIsin(updatedSecurity.getIsin());
        security.setCusip(updatedSecurity.getCusip());
        security.setIssuerName(updatedSecurity.getIssuerName());
        security.setMaturityDate(updatedSecurity.getMaturityDate());
        security.setCoupon(updatedSecurity.getCoupon());
        security.setType(updatedSecurity.getType());
        security.setFaceValue(updatedSecurity.getFaceValue());
        security.setCurrency(updatedSecurity.getCurrency());
        security.setStatus(updatedSecurity.getStatus());
        return securityRepository.save(security);
    }

    public void deleteSecurity(Long id) {
        securityRepository.deleteById(id);
    }
}
