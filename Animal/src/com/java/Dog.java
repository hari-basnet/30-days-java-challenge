package com.java;

public class Dog extends Animal {

		// subclass constructor
		public Dog(){
			super(15);                                            // referencing constructor of the super class
			System.out.println("A dog has been created");
		}
		
		public void eat(){
			System.out.println("A dog is eating");
		}
		
		public void sleep(){
			System.out.println("A dog is sleeping");
		}

		public void ruff(){
			System.out.println("The dog says ruff");
		}

		public void run (){
			System.out.println("The dog is running");
		}
}
