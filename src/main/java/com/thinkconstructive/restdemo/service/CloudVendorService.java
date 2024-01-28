package com.thinkconstructive.restdemo.service;

import com.thinkconstructive.restdemo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVedor(CloudVendor cloudeVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudeVendor(String cloudVendorId);
    public CloudVendor getCloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendor();

}
