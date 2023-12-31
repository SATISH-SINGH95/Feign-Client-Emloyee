package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.request.EmployeeRequest;
import com.employee.model.response.EmployeeResponse;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    public ResponseEntity<EmployeeResponse> createEmployee(@RequestBody EmployeeRequest employeeRequest){
        EmployeeResponse employee = employeeService.createEmployee(employeeRequest);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<EmployeeResponse> getSingleEmployee(@PathVariable Long id){
        EmployeeResponse employee = employeeService.getSingleEmployeeResponse(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
}
