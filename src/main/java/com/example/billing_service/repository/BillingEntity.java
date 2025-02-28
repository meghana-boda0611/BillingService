package com.example.billing_service.repository;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "billing")
@Data
public class BillingEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private double amount;
    private LocalDate billDate;
    private String paymentType;
    private String custId;
}
