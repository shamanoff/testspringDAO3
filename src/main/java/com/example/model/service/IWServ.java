package com.example.model.service;

import com.example.model.entity.Employee;

import java.util.List;

public interface IWServ {

    void print(Integer id);

    void save(Employee employee);

    List<Employee> findAll();

    Employee find(Integer id);

    Employee delete(Integer id);




}
