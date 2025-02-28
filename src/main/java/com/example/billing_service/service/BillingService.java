package com.example.billing_service.service;

import com.example.billing_service.mapper.BillingEntityMapper;
import com.example.billing_service.model.Billing;
import com.example.billing_service.repository.BillingEntity;
import com.example.billing_service.repository.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.time.LocalDate;

@Service
public class BillingService {
    @Autowired
    BillingRepository billrepo;
    @Autowired
    DataSource ds;


        public void createBill(Billing b){
        BillingEntity be=new BillingEntity();
        BillingEntityMapper.mapModeltoEntity(be, b);
        billrepo.save(be);
    }

    public void getBilldetails(Long id,  String custId,  LocalDate billDate,  String paymentType ){

        JdbcTemplate jt= new JdbcTemplate(ds);
        String select = "Select * from billing ";
        StringBuilder sb=new StringBuilder();
        if (id != null){
            sb.append("id = ?");
        }






    }

}
