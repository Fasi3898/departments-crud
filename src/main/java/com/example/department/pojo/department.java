package com.example.department.pojo;

import jakarta.persistence.*;

@Entity
@Table(name="department")
public class department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "department_id")
    private long departmentId;
    @Column(name = "department_name")
    private String departmentName;
    @Column(name = "department_code")
    private String departmentCode;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public long getDepartmentId() {
        return departmentId;
    }
    public department(){

    }

    public department(long departmentId, String departmentName, String departmentCode) {
        super();
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

}
