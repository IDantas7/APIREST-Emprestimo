package com.example.desafioJr.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/customer-loans")
public class LoanController {

    @PostMapping
    public Map<String, Object> getAvailableLoans(@RequestBody Map<String, Object> request){
        int age = (int)request.get("age");
        String name =  (String)request.get("name");
        double income = (double)request.get("income");
        String location = (String)request.get("location");

        List<Map<String, Object>> loans = new ArrayList<Map<String, Object>>();

        if (income <= 3000) {
            loans.add(createLoans("PERSONAL", 4));
            loans.add(createLoans("GUARANTEED", 3));

        }

        if (income <= 5000){
            loans.add(createLoans("CONSIGNMENT", 2));
        }

        if (income > 3000 && income <= 5000 && age < 30 && "SP".equalsIgnoreCase(location)){
            loans.add(createLoans("PERSONAL", 4));
            loans.add(createLoans("GUARANTEED", 3));
        }

        Map<String, Object> response = new HashMap<>();
        response.put("customer", name);
        response.put("loans", loans);

        return response;
    }

    private Map<String, Object> createLoans(String type, int interesRate){
        Map<String, Object> loan = new HashMap<>();
        loan.put("type", type);
        loan.put("interesRate", interesRate);
        return loan;
    }
}
