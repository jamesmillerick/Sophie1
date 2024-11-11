package com.fyp.SpringSophie1.Repository;


import com.fyp.SpringSophie1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
    Employee findByUsernameAndPassword(String username, String password);
}


/*
EmployeeRepository.java file was suggested by ChatGPT, because repositories in Spring Data JPA
provide a straightforward way to connect with your database. Also is to be ideal for CRUD operations.
 */