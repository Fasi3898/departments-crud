package com.example.department.repository;

import com.example.department.pojo.department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface departmentRepository extends JpaRepository<department, Long> {

}
