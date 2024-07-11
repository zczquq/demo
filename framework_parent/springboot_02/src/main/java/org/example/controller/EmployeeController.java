package org.example.controller;

import org.example.entity.Employee;
import org.example.service.IEmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 16339
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Resource
    IEmployeeService employeeService;

    @PostMapping("/save")
    public Object save(Employee employee) {
        employeeService.save(employee);
        return employee;
    }

    @PostMapping("/delete")
    public Object delete(Employee employee) {
        employeeService.remove(employee, false);
        return employee;
    }

    @PostMapping("/detail")
    public Employee detail(Employee employee) {
        employeeService.detail(employee);
        return employee;
    }

    @PostMapping("/login")
    public Employee login(Employee employee) {
        employeeService.login(employee);
        return employee;
    }

}
