package com.fyp.SpringSophie1.Controller;

import com.fyp.SpringSophie1.model.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeAPIService {

    Employee employee;


    @GetMapping("{staffID}")
    public Employee getEmployeeDetails(@PathVariable String staffID)  {

            return employee;

                    //new Employee("A1", "John", "Doe", "Concierge", "1234");
        }

        @PostMapping
        public String createEmployeeDetails(@RequestBody Employee employee) {

        this.employee = employee;
        return "Employee Created Successfully";
        }

    @PutMapping("{staffID}")
    public String updateEmployeeDetails(String staffID) {

        this.employee = null;
        return "Employee Updated Successfully";
    }

    @DeleteMapping
    public String deleteEmployeeDetails(@RequestBody Employee employee) {

        this.employee = employee;
        return "Employee Deleted Successfully";
    }

/*Code for building CRUD operations taken from YouTube video "Java REST API with Spring Boot Tutorial | REST API CRUD Implementation" by ThinkConstructive

 */
}
