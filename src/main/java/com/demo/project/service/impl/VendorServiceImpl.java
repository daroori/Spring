package com.demo.project.service.impl;

import com.demo.project.exception.VendorNotFoundException;
import com.demo.project.repository.VendorRepository;
import com.demo.project.model.Vendor;
import com.demo.project.service.VendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorServiceImpl implements VendorService {

    public VendorRepository vendorRepository;

    public VendorServiceImpl(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    @Override
    public Vendor getDetails(String id) {
        if(vendorRepository.findById(id).isEmpty()){
            throw new VendorNotFoundException("Requested vendor does not exist");
        }
       return vendorRepository.findById(id).get();
    }

    @Override
    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }

    @Override
    public String createDetails(Vendor vendorDetails) {
        vendorRepository.save(vendorDetails);
        return "Successfully CREATED";
    }

    @Override
    public String updateDetails(Vendor vendorDetails) {
        vendorRepository.save(vendorDetails);
        return "Successfully UPDATED";
    }

    @Override
    public String deleteDetails(String id) {
        vendorRepository.deleteById(id);
        return "Successfully DELETED!";
    }
}
