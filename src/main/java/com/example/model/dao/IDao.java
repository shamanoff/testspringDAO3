package com.example.model.dao;

import com.example.model.entity.Employee;

import java.util.List;

public interface IDao {
    void save(Employee entity);

    Employee findOne(Integer id);
    List<Employee> findAll();
    Employee delete(Integer id);
    void upDate(Employee employee);
}
