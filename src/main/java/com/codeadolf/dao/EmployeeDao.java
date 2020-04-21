package com.codeadolf.dao;


import com.codeadolf.entity.Department;
import com.codeadolf.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Repository
public class EmployeeDao {

    private static Map<Integer, Employee> employees = null;

    //员工所属的部门
    @Autowired
    private DepartmentDao departmentDao;

    static {
        employees = new HashMap<Integer, Employee>();//创建一个部门表
        employees.put(1001,new Employee(1001,"张三","2781591086@qq.com",1,new Department(101,"教学部"),new Date()));
        employees.put(1002,new Employee(1002,"李四","2781591086@qq.com",0,new Department(102,"市场部"),new Date()));
        employees.put(1003,new Employee(1003,"王五","2781591086@qq.com",1,new Department(103,"教研部"),new Date()));
        employees.put(1004,new Employee(1004,"赵六","2781591086@qq.com",0,new Department(104,"运营部"),new Date()));
        employees.put(1005,new Employee(1005,"钱七","2781591086@qq.com",1,new Department(105,"后勤部"),new Date()));
    }
    //增加一个员工
    //主键自增
    private static Integer initid =1006;
    public void save(Employee employee){
        if (employee.getId()==null){
            employee.setId(initid++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));

        employees.put(employee.getId(),employee);
    }

    //查询全部员工能力
    public Collection<Employee> getAll(){
        return employees.values();
    }


    //通过id查询员工
    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }

    //删除员工
    public void delete(Integer id){
        employees.remove(id);
    }

}
