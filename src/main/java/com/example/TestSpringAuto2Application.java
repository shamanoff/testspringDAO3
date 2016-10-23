package com.example;

import com.example.model.entity.Employee;
import com.example.model.service.WServ;
import org.json.JSONException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringAuto2Application {

	public static void main(String[] args) throws JSONException {
		BeanFactory beanFactory = SpringApplication.run(TestSpringAuto2Application.class, args);
		beanFactory.getBean(WServ.class).save(new Employee("Vasia", 3333, "Manager", 20000));
		beanFactory.getBean(WServ.class).save(new Employee("Vasia", 4444, "Manager", 20000));
		beanFactory.getBean(WServ.class).save(new Employee("Vasia", 5555, "Manager", 20000));

        System.out.println(beanFactory.getBean(WServ.class).find(3333));
//        System.out.println(beanFactory.getBean(Dao.class).findAll());
//		beanFactory.getBean(WServ.class).print(3333);
	/*	Employee employee = beanFactory.getBean(Dao.class).findOne(3333);
		employee.jsonObject().put("super", "superAdmin");
		System.out.println(employee.getJsonObject().getString("super2"));*/
        beanFactory.getBean(WServ.class).delete(3333);


//        System.out.println(beanFactory.getBean(Dao.class).findAll());
    }
}
