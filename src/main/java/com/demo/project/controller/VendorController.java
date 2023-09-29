package com.demo.project.controller;

import com.demo.project.model.Vendor;
import com.demo.project.service.VendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendor")
public class VendorController {

    public VendorService vendorService;

    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @GetMapping("{id}")
    public Vendor getVendorDetails(@PathVariable("id") String id){
        return vendorService.getDetails(id);
    }

    @GetMapping()
    public List<Vendor> getALLVendorDetails(){
        return vendorService.getAllVendors();
    }

    @PostMapping
    public String createVendorDetails(@RequestBody Vendor vendorDetails){
        return vendorService.createDetails(vendorDetails);
    }

    @PutMapping
    public String updateVendorDetails(@RequestBody Vendor vendorDetails){
        return vendorService.updateDetails(vendorDetails);
    }

    @DeleteMapping("{id}")
    public String deleteVendorDetails(@PathVariable("id") String id){
        return vendorService.deleteDetails(id);
    }
}

