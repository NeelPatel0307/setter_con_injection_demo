package com.example.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoApplication {

	public static void main(String[] args) {



		ApplicationContext context =
				new ClassPathXmlApplicationContext("beans.xml");
Student neel = context.getBean("Student", Student.class);
neel.display();

	}

}
