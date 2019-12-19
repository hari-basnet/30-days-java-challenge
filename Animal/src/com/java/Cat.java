package com.java;

public class Cat extends Animal{

	public Cat(){
		super(12);
		System.out.println("A cat has been created");
	}
	
	public void eat(){
		System.out.println("A cat is eating");
	}

	public void meow(){
		System.out.println("A cat meows");
	}
	
	public void sleep(){
		System.out.println("A cat is sleeping");
	}

	public void prance(){
		System.out.println("A cat is prancing");
	}
}
