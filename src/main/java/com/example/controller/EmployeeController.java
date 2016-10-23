package com.example.controller;


import com.example.model.entity.Employee;
import com.example.model.service.IWServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    public IWServ wServ;

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody Employee employee) {
        wServ.save(employee);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/all")
    public ResponseEntity<List<Employee>> readAll() {
        return ResponseEntity.ok(wServ.findAll());
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public Employee delete(@PathVariable("id") Integer id) {
         ResponseEntity.ok(wServ.find(id));
        return wServ.delete(id);

    }
    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public ResponseEntity<Employee> find(@PathVariable("id")Integer id) {
        return ResponseEntity.ok(wServ.find(id));
    }


}
