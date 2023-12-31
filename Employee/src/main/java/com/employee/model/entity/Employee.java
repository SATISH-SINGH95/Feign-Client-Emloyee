package com.employee.model.entity;

import com.employee.model.response.EmployeeResponse;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    private String empName;

    private Long empCode;

    private String empDesignation;

    public EmployeeResponse getAsObject(){
        EmployeeResponse response = new EmployeeResponse();
        response.setEmployeeId(this.employeeId);
        response.setEmpCode(this.empCode);
        response.setEmpDesignation(this.empDesignation);
        response.setEmpName(this.empName);
        return response;
        
    }

}
