package com.nishant.Employees.service;


import com.nishant.Employees.model.Address;
import com.nishant.Employees.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddressRepo repo;
    public String addAddress(Address address) {
        return repo.save(address).toString();
    }

    public List<Address> getAllAddresses() {
        return repo.findAll();
    }

    public Address getAddress(Integer id) {
        return repo.findById(id).get();
    }

    public String updateAddress(Address address, Integer id) {
        address.setId(id);
        return repo.save(address).toString();
    }

    public String deleteAddress(Integer id) {
        repo.deleteById(id);
        return "Success";
    }
}
