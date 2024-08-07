package com.example.restfulcrud.controller;

import com.example.restfulcrud.dao.DepartmentDao;
import com.example.restfulcrud.dao.EmployeeDao;
import com.example.restfulcrud.entities.Department;
import com.example.restfulcrud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;
    
    @Autowired
    DepartmentDao departmentDao;

    /**
     * 查询所有员工返回列表页面
     * @return
     */
    @GetMapping("/emps")
    public String list(Model model) {
        Collection<Employee> employees = employeeDao.getAll();
        // 放在请求域中
        model.addAttribute("emps", employees);
        // thymeleaf默认拼串
        return "emp/list";
    }

    /**
     * 跳转添加员工页面
     */
    @GetMapping("/emp")
    public String toAddPage(Model model) {
        // 跳转到员工页之前先查出所有的部门
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts", departments);
        return "/emp/add";
    }

    /**
     * 添加员工
     * SpringMVC自动将请求参数和入参对象的属性进行一一绑定；要求请求参数的名字和javaBean入参的对象里面的属性名是一样的
     * @param employee
     * @return
     */
    @PostMapping("/emp")
    public String addEmp(Employee employee) {
        System.out.println("保存的员工信息" + employee);
        employeeDao.save(employee);
        // 来到员工列表页面
        // redirect：表示重定向到一个地址
        // forward：表示转发到一个地址
        return "redirect:/emps";
    }

    /**
     * 来到修改页面，查出员工id，修改员工信息并在页面回显
     */
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model) {
        Employee employee = employeeDao.get(id);
        // 保存员工信息
        model.addAttribute("emp", employee);
        // 查出部门
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts", departments);
        // 回到修改页面（add.html重用）
        return "/emp/add";
    }

    /**
     * 修改员工
     * @param employee
     * @return
     */
    @PutMapping("/emp")
    public String updateEmployee(Employee employee) {
        System.out.println("修改的员工数据：" + employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    /**
     * 删除员工
     */
    @DeleteMapping("/emp/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id) {
        System.out.println("删除的员工id："+id);
        employeeDao.delete(id);
        return "redirect:/emps";
    }
}
