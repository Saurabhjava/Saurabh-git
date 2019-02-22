package com;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service(value="emp")
public class Employee {
	@Value("${name}")
	private String name;
	@Value("${age}")
	private int age;
	@Resource
	@Qualifier("homeAddress")
	private Address add;		
	
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
	public void printEmployee()
	{
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		add.printAddress();
	}
	
}
