package com.example.ExceptionControlleAdvace.service;

import com.example.ExceptionControlleAdvace.entity.Employee;
import com.example.ExceptionControlleAdvace.exception.EmptyInputException;
import com.example.ExceptionControlleAdvace.repo.HomeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService implements EmpServiceInterface{

    @Autowired
    HomeRepo repo;

    @Override
    public Employee saveData(Employee employee) {

        if(employee.getName().length() == 0 || employee.getName().isEmpty()) {
            throw new EmptyInputException("", "");
        }

        Employee savedEmployee = repo.save(employee);
        return savedEmployee;

    }

    @Override
    public Employee getEmployeeMethod(int id) {
        Employee employee = repo.findById(id).get();
        return employee;
    }
}
