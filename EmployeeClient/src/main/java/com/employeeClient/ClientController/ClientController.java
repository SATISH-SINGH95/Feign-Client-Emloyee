package com.employeeClient.ClientController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeClient.client.EmployeeClient;
import com.employeeClient.response.EmployeeResponse;

@RequestMapping("/client")
@RestController
public class ClientController {

    @Autowired
    private EmployeeClient client;

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponse> getSingleEmployee(@PathVariable Long id){
        EmployeeResponse singleEmployee = client.getSingleEmployee(id);
        return new ResponseEntity<>(singleEmployee, HttpStatus.OK);
    }
    
}
