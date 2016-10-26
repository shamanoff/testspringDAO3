package com.example.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.json.JSONException;
import org.json.JSONObject;

import javax.persistence.*;

@Entity(name = "Employee")
@Table(name = "employee")
//@Scope("prototype")
public class Employee implements IEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 6, nullable = false)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "position")
    private String position;
    @Column(name = "salary")
    private Integer salary;
    @Column(name = "special")

    // TODO: 24/10/2016 conveter
    @javax.persistence.Transient
    @JsonIgnore
    private JSONObject jsonObject;

    public Employee() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }


    public Employee(String name, Integer id, String position, Integer salary) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.salary = salary;
//        this.jsonObject = new JSONObject();
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getSalary() {
        return salary;
    }



    public JSONObject jsonObject() throws JSONException {
        return jsonObject;
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
