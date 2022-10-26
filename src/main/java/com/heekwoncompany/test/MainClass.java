package com.heekwoncompany.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		Student stu1 = ctx.getBean("student1",Student.class);
		System.out.println(stu1.getName());
		System.out.println(stu1.getAge());
		System.out.println(stu1.getHobbys());
		System.out.println(stu1.getHeight());
		System.out.println(stu1.getWeight());
		
		Student stu2 = ctx.getBean("student2",Student.class);
		System.out.println(stu2.getName());
		System.out.println(stu2.getAge());
		System.out.println(stu2.getHobbys());
		System.out.println(stu2.getHeight());
		System.out.println(stu2.getWeight());
		
//		Student stu3 = ctx.getBean("student3",Student.class);
//		System.out.println(stu3.getName());
//		System.out.println(stu3.getAge());
//		System.out.println(stu3.getHobbys());
//		System.out.println(stu3.getHeight());
//		System.out.println(stu3.getWeight());
		
		Student stu4 = ctx.getBean("student4",Student.class);
		System.out.println(stu4.getName());
		System.out.println(stu4.getAge());
		System.out.println(stu4.getHobbys());
		System.out.println(stu4.getHeight());
		System.out.println(stu4.getWeight());
	}

}
