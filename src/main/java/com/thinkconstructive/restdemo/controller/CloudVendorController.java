package com.thinkconstructive.restdemo.controller;


import com.thinkconstructive.restdemo.model.CloudVendor;
import com.thinkconstructive.restdemo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
        //kkkk
    }

    //Read Specific Cloud Vendor
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.getCloudVendor(vendorId);
    }

    //Read All CloudVendor Details From the DB
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails(){
        return cloudVendorService.getAllCloudVendor();
    }

    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendor cloudeVendor){
        cloudVendorService.createCloudVedor(cloudeVendor);
        return "Vendor Created Succesfully :)";
    }

    @PutMapping
    public String updateCloudeVendorDetails(@RequestBody CloudVendor cloudeVendor){
        cloudVendorService.updateCloudVendor(cloudeVendor);
        return "Updated Vendor Details Succesfully :)";
    }

    @DeleteMapping("{vendorId}")
    public String deleteVendorDetails(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudeVendor(vendorId);
        return "Vendor Deleted SucessFully :)";
    }
}
