package com.fyp.SpringSophie1.Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.fyp.SpringSophie1.model.Employee;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

/*
Code taken from IS3312 Project - material covered in tutor classes (adapted to my project)
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Autowired
    private EmployeeAPIService employeeAPIService;

    /*
    Code taken from IS3312 Project - material covered in tutor classes (adapted to my project)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Employee employee = employeeAPIService.authenticate(username, password);

        if (employee != null) {
            String role = employee.getRole();

            if ("ROLE_EVENT_MANAGER".equals(role)) {
                response.sendRedirect("EventDashboard.html");
            } else if ("ROLE_STAFF".equals(role)) {
                response.sendRedirect("HomePage.html");
            } else {
                response.sendError(HttpServletResponse.SC_FORBIDDEN, "Unauthorised");
            }
        } else {
            response.sendRedirect("login.html?error=Invalid credentials");
        }
    }
}
