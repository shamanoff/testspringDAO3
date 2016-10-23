package com.example.model.service;


import com.example.model.dao.IDao;
import com.example.model.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WServ implements IWServ {

    @Autowired
    private IDao iDao;


    @Override
    public void print(Integer id) {
        Employee employee = (Employee) iDao.findOne(id);
        System.out.println(employee.toString());
    }

    @Override
    public void save(Employee employee) {
        iDao.save(employee);

    }

    @Override
    public List<Employee> findAll() {
        return iDao.findAll();
    }

    @Override
    public Employee find(Integer id) {
        return iDao.findOne(id);
    }


    public Employee delete(Integer id) {
        return iDao.delete(id);

    }


}
