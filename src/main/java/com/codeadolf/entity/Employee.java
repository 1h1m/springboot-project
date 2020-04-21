package com.codeadolf.entity;

import java.util.Date;

/**
 * 员工表
 */
public class Employee {

    private Integer id;//主键
    private String lastName;//员工姓名
    private String email;//邮箱
    private Integer sex;//性别,男1，女0
    private Department department;//部门
    private Date birth;//出生

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", sex=" + sex +
                ", department=" + department +
                ", birth=" + birth +
                '}';
    }

    public Employee(Integer id, String lastName, String email, Integer sex, Department department, Date birth) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.sex = sex;
        this.department = department;
        this.birth = new Date();
    }

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
