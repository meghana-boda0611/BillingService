package com.example.billing_service.controller;

import com.example.billing_service.model.Billing;
import com.example.billing_service.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class BillingController {

    @Autowired
    BillingService bs;

    @PostMapping("/billing")
    public void billPayment(@RequestBody Billing b){
        bs.createBill(b);
    }

    @GetMapping("/billing")
    public void getBillingDetails(@RequestParam Long id, @RequestParam String custId, @RequestParam LocalDate billDate, @RequestParam String paymentType){

    }

    @PutMapping("/billing/{id}")
    public void udpatePaymentDetails(@RequestBody Billing b, @PathVariable Long id){

    }

    @DeleteMapping("/billing/{id}")
    public void deleteDetails(@PathVariable Long id){

    }
}
