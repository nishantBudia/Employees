package com.nishant.Employees.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Data
@Entity
@Validated
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;

    @NotBlank
    String firstName;

    @NotBlank
    String lastName;

    @OneToOne(targetEntity = Address.class)
    Address address;
}
