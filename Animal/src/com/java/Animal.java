package com.java;

public abstract class Animal {

	private int age;             // VS private int age

	public Animal(int age){
		this.age = age;
		System.out.println("An animal has been created");
	}

	public abstract void eat();
	
	public void sleep(){
		System.out.println("An animal is sleeping");
	}
	// Getter
	public int getAge(){
		return age;
	}
	public static void main(String[] args) {
		// write your code here
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.eat();
		c.eat();
		
		d.sleep();
		c.sleep();
		// what happens if
		// Animal o = new Dog();
		
		// Object casting
		Object dog = new Dog();
		Dog realDog = (Dog) dog;
		realDog.sleep();
		
		Object str = "est";
		String realString = (String) str;
		realString.getBytes();
		
		// what happens when ???
		Dog doggy = new Dog();
		if(d instanceof Animal){
			Animal animal = (Animal) doggy;
			animal.sleep();
		}
		doggy.sleep();
		
	}
}
