package com.java;

public class Animal {

	private int age;             // VS private int age

	public Animal(int age){
		this.age = age;
		System.out.println("An animal has been created");
	}

	public void eat(){
		System.out.println("An animal is eating");
	}
	
	// Getter
	public int getAge(){
		return age;
	}
	public static void main(String[] args) {
		// write your code here
		Animal a = new Animal(5);
		Dog d = new Dog();
		Cat c = new Cat();
		d.ruff();
		c.meow();
		System.out.println(c.getAge());

		a.eat();
		d.eat();
		c.eat();
		c.prance();
		d.run();
		
		// what happens if
		// Animal o = new Dog();
		
	}
}
