package org.example.controller;

import com.alibaba.fastjson.JSON;
import org.example.entity.Employee;
import org.example.exception.CustomException;
import org.example.mapper.EmployeeMapper;
import org.example.request.EmployeeRequest;
import org.example.response.ResultEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 16339
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private TransactionTemplate transactionTemplate;

    @Resource
    private EmployeeMapper employeeMapper;



    /**
     * 如果形参名字非要与报文中数据名字不一致，可以添加@RequestParam("xxx") String name注解添加别名取数据
     * @param name
     * @return
     */
    @GetMapping("/hello")
    public String hello(String name) throws Exception {
        if (!StringUtils.hasText(name)) {
            throw new CustomException(ResultEnum.DATA_NOT_FOUND);
        }
        return "hello:" + name;
    }

    @GetMapping("/hello02")
    public void hello02(HttpServletResponse response, EmployeeRequest request) throws IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json;charset=utf-8");
        String json = JSON.toJSONString(request);
        PrintWriter out = response.getWriter();
        out.write(json);
        out.flush();
        out.close();
    }

    @GetMapping("/hello03")
    public Object hello03(@Valid EmployeeRequest employeeRequest) {
        return employeeRequest;
    }

    @GetMapping("/hello04")
    public Object hello04() {
        List<String> list = new ArrayList<>();
        list.add("11");
        list.add("11");
        list.add("11");
        list.add("11");
        return list;
    }

    @GetMapping("/hello05")
    public Map hello05() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "aaa");
        map.put("2", "aaa");
        map.put("3", "aaa");
        map.put("4", "aaa");
        return map;
    }

    @GetMapping("/save")
    @Transactional(rollbackFor = Exception.class)
    public Object save(Employee employee) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                // 需要在事务内执行的代码写在这里，通常是调用mapper层代码
            }
        });
        return employee;
    }

}
