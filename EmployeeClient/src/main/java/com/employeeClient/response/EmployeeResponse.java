package com.employeeClient.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeResponse {

    private Long employeeId;

    private String empName;

    private Long empCode;

    private String empDesignation;
    
}
