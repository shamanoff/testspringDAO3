package com.example.model.dao;

import com.example.model.entity.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Dao implements IDao {

    @Autowired
    private BeanFactory beanFactory;


    private Map<Integer, Employee> map = new HashMap<>();


    @Override
    public  void save(Employee entity) {
        map.put(entity.getId(), entity);
    }

    @Override
    public void upDate(Employee employee) {
        if(employee.getId() == null){
            throw new IllegalStateException("not null");
        }
        map.replace(employee.getId(), employee);
    }

    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(map.values()) ;
    }

    @Override
    public Employee delete(Integer id) {
        return map.remove(id);
    }

    @Override
    public Employee findOne(Integer id){
        return map.get(id);
    }





}
