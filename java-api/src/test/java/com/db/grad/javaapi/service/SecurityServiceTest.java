package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.repository.SecurityRepository;
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

class SecurityServiceTest {

    @Mock
    private SecurityRepository securityRepository;

    @InjectMocks
    private SecurityService securityService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetAllSecurities() {
        // Prepare
        List<Security> mockSecurities = new ArrayList<>();
        mockSecurities.add(new Security(1L, "XS1988387210", "123456780", "Issuer1", LocalDateTime.now(), 4.37f, "Type1", 1000f, "USD", "open"));
        mockSecurities.add(new Security(2L, "XS1234567890", "987654321", "Issuer2", LocalDateTime.now(), 3.25f, "Type2", 500f, "EUR", "closed"));

        when(securityRepository.findAll()).thenReturn(mockSecurities);

        // Execute
        List<Security> result = securityService.getAllSecurities();

        // Verify
        assertEquals(2, result.size());
        assertEquals("Issuer1", result.get(0).getIssuerName());
        assertEquals("Issuer2", result.get(1).getIssuerName());
    }

    @Test
    void testGetSecurityById_ExistingId() {
        // Prepare
        Long securityId = 1L;
        Security mockSecurity = new Security(securityId, "XS1988387210", "123456780", "Issuer1", LocalDateTime.now(), 4.37f, "Type1", 1000f, "USD", "open");

        when(securityRepository.findById(securityId)).thenReturn(Optional.of(mockSecurity));

        // Execute
        Security result = securityService.getSecurityById(securityId);

        // Verify
        assertNotNull(result);
        assertEquals("Issuer1", result.getIssuerName());
    }

    @Test
    void testGetSecurityById_NonExistingId() {
        // Prepare
        Long nonExistingId = 10L;

        when(securityRepository.findById(nonExistingId)).thenReturn(Optional.empty());

        // Execute and Verify
        assertThrows(EntityNotFoundException.class, () -> securityService.getSecurityById(nonExistingId));
    }

    @Test
    void testCreateSecurity() {
        // Prepare
        Security securityToCreate = new Security(null, "XS1988387210", "123456780", "Issuer1", LocalDateTime.now(), 4.37f, "Type1", 1000f, "USD", "open");

        when(securityRepository.save(securityToCreate)).thenReturn(new Security(1L, "XS1988387210", "123456780", "Issuer1", LocalDateTime.now(), 4.37f, "Type1", 1000f, "USD", "open"));

        // Execute
        Security createdSecurity = securityService.createSecurity(securityToCreate);

        // Verify
        assertNotNull(createdSecurity.getId());
        assertEquals("Issuer1", createdSecurity.getIssuerName());
    }

    @Test
    void testUpdateSecurity() {
        // Prepare
        Long securityId = 1L;
        Security existingSecurity = new Security(securityId, "XS1988387210", "123456780", "Issuer1", LocalDateTime.now(), 4.37f, "Type1", 1000f, "USD", "open");
        Security updatedSecurityData = new Security(null, "XS1988387220", "0987654321", "UpdatedIssuer", LocalDateTime.now(), 3.45f, "Type2", 500f, "EUR", "closed");

        when(securityRepository.findById(securityId)).thenReturn(Optional.of(existingSecurity));
        when(securityRepository.save(existingSecurity)).thenReturn(existingSecurity);

        // Execute
        Security updatedSecurity = securityService.updateSecurity(securityId, updatedSecurityData);

        // Verify
        assertNotNull(updatedSecurity);
        assertEquals(securityId, updatedSecurity.getId());
        assertEquals("UpdatedIssuer", updatedSecurity.getIssuerName());
        assertEquals("Type2", updatedSecurity.getType());
    }

    @Test
    void testDeleteSecurity() {
        // Prepare
        Long securityId = 1L;

        // Execute
        securityService.deleteSecurity(securityId);

        // Verify
        verify(securityRepository, times(1)).deleteById(securityId);
    }
}
