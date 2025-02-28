package com.example.billing_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepository extends JpaRepository<BillingEntity, Long> {
}
