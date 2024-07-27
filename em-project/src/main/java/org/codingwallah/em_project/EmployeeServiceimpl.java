/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.codingwallah.em_project;
 

import java.util.ArrayList;
import java.util.List;

import  org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
 


public class EmployeeServiceimpl implements EmployeeService {
    @Autowired
 private EmployeeRepository employeeRepository;
    //List<Employee> employees = new ArrayList<>();

    @Override
    public String createEmployee(Employee employee){
        EmployeeEntity employeeEntity=new EmployeeEntity();
        BeanUtils.copyProperties(employee, employeeEntity);

        employeeRepository.save(employeeEntity);
         //employees.add(employee);
         return "Saved Successfully";
    }

    @Override
    public Employee readEmployee(Long id) {
        EmployeeEntity employeeEntity= employeeRepository.findById(id).get();
        Employee employee=new Employee(); // object 
        BeanUtils.copyProperties( employeeEntity,employee);
        return employee;
        
    }

    @Override 
    public List<Employee> readEmployees(){
        List<EmployeeEntity> employeeList=  employeeRepository.findAll();
        List<Employee> employees = new ArrayList<>();

        for (EmployeeEntity employeeEntity : employeeList) {
            Employee emp=new Employee();
            emp.setId(employeeEntity.getId());
            emp.setName(employeeEntity.getName());
            emp.setEmail(employeeEntity.getEmail());
            emp.setPhone(employeeEntity.getPhone());

                    employees.add(emp);
        }
                 return employees;
    }

    //@SuppressWarnings("unlikely-arg-type")
    @Override
    public boolean deleatEmployee(Long id){
       // employees.remove(id);
       EmployeeEntity emp= employeeRepository.findById(id).get();
       employeeRepository.delete(emp);
        return true;

    
    }
    public String updateEmployee(Long id, Employee employee) {
        EmployeeEntity existingEmployee = employeeRepository.findById(id).get();
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setName(employee.getName());
        existingEmployee.setPhone(employee.getPhone());
        existingEmployee.setId(employee.getId());




        employeeRepository.save(existingEmployee);
    
        return "Update Succesfully ";

    }

    
    
    

}
