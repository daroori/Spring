package com.demo.project.controller;

import com.demo.project.model.Vendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendor")
public class VendorAPIService {

    Vendor vendorDetails;

    @GetMapping("{id}")
    public Vendor getVendorDetails(String id){
        return vendorDetails;
    }

    @PostMapping
    public String createVendorDetails(@RequestBody Vendor vendorDetails){
        this.vendorDetails = vendorDetails;
        return "Vendor details created successfully";
    }

    @PutMapping
    public String updateVendorDetails(@RequestBody Vendor vendorDetails){
        this.vendorDetails = vendorDetails;
        return "Vendor details UPDATED successfully";
    }

    @DeleteMapping("{id}")
    public String deleteVendorDetails(String id){
        this.vendorDetails = null;
        return "Vendor details DELETED successfully";
    }
}

