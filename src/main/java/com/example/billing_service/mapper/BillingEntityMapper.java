package com.example.billing_service.mapper;

import com.example.billing_service.model.Billing;
import com.example.billing_service.repository.BillingEntity;
import com.example.billing_service.repository.BillingRepository;
import org.springframework.stereotype.Component;

@Component
public class BillingEntityMapper {

    public static Billing mapEntitytoModel(BillingEntity be, Billing b){
        b.setId(be.getId());
        b.setAmount(be.getAmount());
        b.setBillDate(be.getBillDate());
        b.setPaymentType(be.getPaymentType());
        b.setCustId(be.getCustId());
        return b;
    }


    public static BillingEntity mapModeltoEntity(BillingEntity be, Billing b){
        be.setId(b.getId());
        be.setAmount(b.getAmount());
        be.setBillDate(b.getBillDate());
        be.setPaymentType(b.getPaymentType());
        be.setCustId(b.getCustId());
        return be;
    }

}
