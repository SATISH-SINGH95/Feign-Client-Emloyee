package com.employee.service;

import com.employee.model.request.EmployeeRequest;
import com.employee.model.response.EmployeeResponse;

public interface EmployeeService {

    EmployeeResponse createEmployee(EmployeeRequest employeeRequest);

    EmployeeResponse getSingleEmployeeResponse(Long empId);
    
}
