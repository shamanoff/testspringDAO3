package com.example.model.service;

import com.example.model.entity.Employee;

import java.util.List;

public interface IWServ {



    void save(Employee employee);

    List<Employee> findAll();

    Employee find(Integer id);

    Employee findByName(String name);

    Employee delete(Integer id);




}
