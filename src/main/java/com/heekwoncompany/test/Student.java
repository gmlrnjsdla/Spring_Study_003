package com.heekwoncompany.test;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private int age;
	private ArrayList<String> hobbys;
	private int height;
	private int weight;
	
		
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Student(String name, int age, ArrayList<String> hobbys) {
		super();
		this.name = name;
		this.age = age;
		this.hobbys = hobbys;
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public ArrayList<String> getHobbys() {
		return hobbys;
	}



	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}



	

	
	
}
