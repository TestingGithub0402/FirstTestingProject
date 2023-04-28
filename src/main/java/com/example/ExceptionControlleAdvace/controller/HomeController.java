package com.example.ExceptionControlleAdvace.controller;

import com.example.ExceptionControlleAdvace.entity.Employee;
import com.example.ExceptionControlleAdvace.service.EmpService;
import com.example.ExceptionControlleAdvace.service.EmpServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("emp")
public class HomeController {

    @Autowired
    EmpService empService;

    @PostMapping
    public ResponseEntity<Employee> dataSave(@RequestBody Employee employee) {
        Employee savedEmp = empService.saveData(employee);
        return new ResponseEntity<>(savedEmp, HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Employee> getData(@PathVariable("id") int id) {

        Employee emp = empService.getEmployeeMethod(id);
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }

}
