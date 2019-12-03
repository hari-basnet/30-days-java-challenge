package com.java;

public class Person {

	private int age;

	public Person(int initialAge){
		if(initialAge < 0){
			System.out.println("Age is not valid, setting age to 0.");
			this.age = 0;
		}else {
			this.age = initialAge;
		}
	}

	public void amIOld(){

		String message = "";
		if(age < 18 && age > 12 ){
			message = "You are a teenager.";
		}else if ( age < 13){
			message = "You are young.";
		}else {
			message = "You are old.";
		}

		System.out.println(message);
	}


	public void yearPasses() {
		age++;
	}
}
