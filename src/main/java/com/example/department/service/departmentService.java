package com.example.department.service;

import com.example.department.pojo.department;
import com.example.department.repository.departmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class departmentService {
    @Autowired
    private departmentRepository departmentRepository;
    public department createDepartment(department department){
        return departmentRepository.save(department);
    }
    public List<department> getDepartment(){
        return departmentRepository.findAll();
    }
    public void deleteDepartmentById(Long departmentId)
    {
        departmentRepository.deleteById(departmentId);
    }


        public department updateDepartment(department department, Long departmentId)
        {

            department depDB = departmentRepository.findById(departmentId).get();

            if (Objects.nonNull(department.getDepartmentName())
                    && !"".equalsIgnoreCase(
                    department.getDepartmentName())) {
                depDB.setDepartmentName(
                        department.getDepartmentName());
            }



            if (Objects.nonNull(department.getDepartmentCode())
                    && !"".equalsIgnoreCase(
                    department.getDepartmentCode())) {
                depDB.setDepartmentCode(
                        department.getDepartmentCode());
            }

            return departmentRepository.save(depDB);
        }
    }

