package com.nishant.Employees.controller;


import com.nishant.Employees.model.Address;
import com.nishant.Employees.service.AddressService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("addresses")
public class AddressController {
    @Autowired
    AddressService service;

    /*
    POST
     */

    @PostMapping()
    public String addAddress(@RequestBody @Valid Address address){
        return service.addAddress(address);
    }

    /*
    GET
     */

    @GetMapping
    public List<Address> getAllAddresses(){
        return service.getAllAddresses();
    }

    @GetMapping("{id}")
    public Address getAddress(@PathVariable Integer id){
        return service.getAddress(id);
    }

    /*
    PUT
     */

    @PutMapping("{id}")
    public String updateAddress(@RequestBody @Valid Address address,@PathVariable Integer id){
        return service.updateAddress(address,id);
    }

    /*
    DELETE
     */

    @DeleteMapping("{id}")
    public String deleteAddress(@PathVariable Integer id){
        return service.deleteAddress(id);
    }

}
