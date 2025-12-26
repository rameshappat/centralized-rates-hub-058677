package com.organization.rates;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Rate {
    private Long id;
    private String type;
    private BigDecimal value;
    private LocalDate effectiveDate;
    private LocalDate expirationDate;

    public Rate(Long id, String type, BigDecimal value, LocalDate effectiveDate, LocalDate expirationDate) {
        this.id = id;
        this.type = type;
        this.value = value;
        this.effectiveDate = effectiveDate;
        this.expirationDate = expirationDate;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}