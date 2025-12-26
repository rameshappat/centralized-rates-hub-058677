package com.organization.rates;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Collections;
import java.util.Optional;

class RateServiceTest {
    @InjectMocks
    private RateService rateService;

    @Mock
    private RateRepository rateRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createRate() {
        Rate rate = new Rate(1L, "Standard", BigDecimal.valueOf(2.5), LocalDate.now(), null);
        when(rateRepository.save(any(Rate.class))).thenReturn(rate);
        Rate createdRate = rateService.createRate(rate);
        assertEquals(rate.getId(), createdRate.getId());
    }

    @Test
    void getRateById() {
        Rate rate = new Rate(1L, "Standard", BigDecimal.valueOf(2.5), LocalDate.now(), null);
        when(rateRepository.findById(1L)).thenReturn(Optional.of(rate));
        Optional<Rate> foundRate = rateService.getRateById(1L);
        assertTrue(foundRate.isPresent());
        assertEquals(rate.getId(), foundRate.get().getId());
    }

    @Test
    void getAllRates() {
        when(rateRepository.findAll()).thenReturn(Collections.emptyList());
        List<Rate> rates = rateService.getAllRates();
        assertNotNull(rates);
        assertTrue(rates.isEmpty());
    }
}