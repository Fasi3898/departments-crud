package com.example.department.controller;

import com.example.department.pojo.department;
import com.example.department.service.departmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")

public class departmentController {
    @Autowired
    private departmentService departmentService;
    @PostMapping("/save")
    @ResponseBody
    public department saveDepartment(@RequestBody department department){
        return departmentService.createDepartment(department);
    }
    @GetMapping("/get")
    @ResponseBody
    public List<department> getDepartment(){
        return departmentService.getDepartment();
    }
    @DeleteMapping("/{id}")
    @ResponseBody
    public String deleteDepartmentById(@PathVariable("id") Long departmentId)
    {
        departmentService.deleteDepartmentById(departmentId);
        return "delete successfully";
    }
    @PutMapping("/{id}")
    @ResponseBody
    public department updateDepartment(@RequestBody department department,@PathVariable("id") Long departmentId){
        return departmentService.updateDepartment(department,departmentId);
    }
}
