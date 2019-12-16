package com.java;

public class Cat extends Animal{

	public Cat(){
		super(12);
		System.out.println("A cat has been created");
	}

	public void meow(){
		System.out.println("A cat meows");
	}

	public void prance(){
		System.out.println("A cat is prancing");
	}
}
