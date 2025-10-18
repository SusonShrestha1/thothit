package com.hashcode;

import java.util.Objects;

public class Dog {

	String name = "tommy";
	int age = 12;
	String color = "black";

	@Override
	public int hashCode() {
		return Objects.hash(age, color, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return age == other.age && Objects.equals(color, other.color) && Objects.equals(name, other.name);
	}

}
