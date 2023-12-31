package com.employee.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequest {

    private String empName;

    private Long empCode;

    private String empDesignation;
    
}
