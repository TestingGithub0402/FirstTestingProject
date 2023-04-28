package com.example.ExceptionControlleAdvace.repo;

import com.example.ExceptionControlleAdvace.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepo extends JpaRepository<Employee, Integer> {
}
