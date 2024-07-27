package org.codingwallah.em_project;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
@CrossOrigin("http://localhost:3000/")
public class EmpController {
//List<Employee> employees = new ArrayList<>();
   
   EmployeeService employeeSerivce = new EmployeeServiceimpl() ;
//dependancy injection 

   //  @Autowired
  // EmployeeService employeeSerivce;


    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
       
        return employeeSerivce.readEmployees();
    }
    @GetMapping("employees/{id}")
    public List<Employee> getEmployeesById(@PathVariable Long id) {
       
        return employeeSerivce.readEmployee(id);
    }

    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) {
       // employees.add(employee);
       return employeeSerivce.createEmployee(employee); 
        

    }

    @DeleteMapping("employees/{id}") //path variable
        public String deleatEmployee(@PathVariable Long id){
          
         if(employeeSerivce.deleatEmployee(id))
           return "Delete Succsefully";
else       return "Not Found";

        }

    @PutMapping("employees/{id}")
    public String putMethodName(@PathVariable Long id, @RequestBody Employee employee) {
        //TODO: process PUT request
        
        return EmployeeService.updateEmployee(id,employee);
    }
       
    
    
}


    

