package com.employeeClient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.employeeClient.response.EmployeeResponse;

@FeignClient(value = "Employee-API", url = "${employee.api.url}")
public interface EmployeeClient {

    @GetMapping("/employee/{id}")
    public EmployeeResponse getSingleEmployee(@PathVariable Long id);
    
}
