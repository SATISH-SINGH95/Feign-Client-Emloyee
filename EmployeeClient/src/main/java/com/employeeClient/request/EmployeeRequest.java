package com.employeeClient.request;

import lombok.Data;

@Data
public class EmployeeRequest {

    private Long employeeId;

    private String empName;

    private Long empCode;

    private String empDesignation;
    
}
