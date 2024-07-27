package org.codingwallah.em_project;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
@Component
@Repository
public interface EmployeeService  {
    String createEmployee(Employee employee);
    List<Employee> readEmployees();
    boolean deleatEmployee(Long id);
    static String updateEmployee(Long id ,Employee employee) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateEmployee'");
    }
    Employee readEmployee(Long id);




    
}
