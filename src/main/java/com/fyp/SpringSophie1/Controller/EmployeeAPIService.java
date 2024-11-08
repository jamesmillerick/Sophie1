package com.fyp.SpringSophie1.Controller;

import com.fyp.SpringSophie1.Repository.EmployeeRepository;
import com.fyp.SpringSophie1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeAPIService {

    /*
    @Autowired annotation came from ChatGPT, it was a more effective way to enable loose coupling between
    the interface and the controller class
     */
    @Autowired
    private EmployeeRepository employeeRepository;  //Injects the EmployeeRepository into my controller class (EmployeeAPIService)


    Employee employee;


    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();  // Retrieves all employees from the database
    }
    //GetMapping annotation allows the user to fetch staff data from the PostgreSQL database.
    @GetMapping("{staffID}")
    public Employee getEmployeeDetails(@PathVariable int staffID) {
        return employeeRepository.findById(staffID).orElse(null); // Retrieves an employee by ID
    }
    //PostMapping annotation allows the user to create a staffID and fill in rest of user credentials into the PostgreSQL database in the employee table
        @PostMapping
        public ResponseEntity<Employee> createEmployeeDetails(@RequestBody Employee employee) {
            Employee createdEmployee = employeeRepository.save(employee);
            return ResponseEntity.ok(createdEmployee);
        }


        //@PutMapping annotation allows the user to update any staffID credentials in the PostgreSQL database in the employee table
    @PutMapping("{staffID}")
    public ResponseEntity<Employee> updateEmployeeDetails(@PathVariable int staffID, @RequestBody Employee employeeDetails) {
        return employeeRepository.findById(staffID).map(employee -> {
            employee.setfName(employeeDetails.getfName());
            employee.setsName(employeeDetails.getsName());
            employee.setRole(employeeDetails.getRole());
            employee.setPassword(employeeDetails.getPassword());
            employee.setTasks(employeeDetails.getTasks());
            Employee updatedEmployee = employeeRepository.save(employee);
            return ResponseEntity.ok(updatedEmployee);
        }).orElse(ResponseEntity.notFound().build());
    }
//@DeleteMapping annotation should allow the user to delete any staff from the PostgreSQL database in the employees table
    @DeleteMapping("{staffID}")
    public ResponseEntity<Void> deleteEmployeeDetails(@PathVariable int staffID) {
        if (employeeRepository.existsById(staffID)) {
            employeeRepository.deleteById(staffID);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

/*
Code for building CRUD operations taken from YouTube video
"Java REST API with Spring Boot Tutorial | REST API CRUD Implementation"
by ThinkConstructive, published Oct 2023 - https://www.youtube.com/watch?v=FRT38sQeZ-w
 */
}
