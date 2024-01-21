package pl.szlify.exchangeApiApplication.model.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ExchangeResponse {

    private String fromCurrency;
    private String toCurrency;
    private BigDecimal originalAmount;
    private BigDecimal exchangedAmount;
    private double exchangeRate;
}
