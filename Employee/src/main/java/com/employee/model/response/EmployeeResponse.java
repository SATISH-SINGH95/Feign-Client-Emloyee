package com.employee.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class EmployeeResponse {

    private Long employeeId;

    private String empName;

    private Long empCode;

    private String empDesignation;
    
}
