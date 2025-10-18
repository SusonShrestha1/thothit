package com.hashcode;

import java.util.Objects;

public class Dog1 {
	
	private String name;
	private int age;
	private String color;
	private int price;
	
	public Dog1() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Dog1(String name, int age, String color, int price) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.price = price;
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



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Dog1 [name=" + name + ", age=" + age + ", color=" + color + ", price=" + price + "]";
	}



	/*when there is no equal method is not overridden then it will check the hashcode by default which will let the user to print duplicate value */
	/*if the equal method is overriden then the hascode overriden method is used to overrride the hashcode for the same content to assign same hashcode to prevent duplication */
	@Override
	public int hashCode() {
		return Objects.hash(age, color, name, price);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog1 other = (Dog1) obj;
		return age == other.age && Objects.equals(color, other.color) && Objects.equals(name, other.name)
				&& price == other.price;
	}
	
	

}
