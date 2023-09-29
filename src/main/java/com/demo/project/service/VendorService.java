package com.demo.project.service;

import com.demo.project.model.Vendor;

import java.util.List;

public interface VendorService {
    public Vendor getDetails(String id);
    public List<Vendor> getAllVendors();
    public String createDetails(Vendor vendorDetails);
    public String updateDetails(Vendor vendorDetails);
    public String deleteDetails(String id);
}
