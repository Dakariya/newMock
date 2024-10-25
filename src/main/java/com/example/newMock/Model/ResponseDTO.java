package com.example.newMock.Model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ResponseDTO {
    private String rqUID;
    private String clientId;
    private String account;
    private String currency;
    private Double balance;
    private BigDecimal maxLimit;
}
