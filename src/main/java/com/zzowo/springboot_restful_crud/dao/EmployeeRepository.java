package com.zzowo.springboot_restful_crud.dao;

import com.zzowo.springboot_restful_crud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
