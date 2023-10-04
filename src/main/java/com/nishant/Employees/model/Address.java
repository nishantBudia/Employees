package com.nishant.Employees.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Entity
@Validated
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @NotBlank
    String street;

    @NotBlank
    String city;

    @NotBlank
    String zipcode;

}
