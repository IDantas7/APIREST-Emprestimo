package com.example.desafioJr.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CustomerRequest {

    private int age;
    private String cpf;
    private String name;
    private double income;
    private String location;

}
