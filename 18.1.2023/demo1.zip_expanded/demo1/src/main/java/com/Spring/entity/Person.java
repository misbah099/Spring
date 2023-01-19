package com.Spring.entity;

public class Person {
private String name;
public String getName() {
	return name;
}
	public void setName(String name) {
		this.name=name;
		
	}
	public void display() {
		System.out.println("hi :"+name);
}
}
