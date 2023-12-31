package com.employee.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.entity.Employee;
import com.employee.model.request.EmployeeRequest;
import com.employee.model.response.EmployeeResponse;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeResponse createEmployee(EmployeeRequest employeeRequest) {
        Employee emp = new Employee();
        emp.setEmpName(employeeRequest.getEmpName());
        emp.setEmpCode(employeeRequest.getEmpCode());
        emp.setEmpDesignation(employeeRequest.getEmpDesignation());

        Employee save = employeeRepository.save(emp);

        EmployeeResponse response = save.getAsObject();

        return response;
    }   

    @Override
    public EmployeeResponse getSingleEmployeeResponse(Long empId) {

        Employee emp = employeeRepository.findById(empId).orElseThrow(()->new RuntimeException("Employee not found with Id "+ empId));
        EmployeeResponse response = emp.getAsObject();
        return response;
    }
    
}
