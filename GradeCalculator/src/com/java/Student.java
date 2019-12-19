package com.java;

class Student extends Person{
	private int[] testScores;
	
	/*
	 *   Class Constructor
	 *
	 *   @param firstName - A string denoting the Person's first name.
	 *   @param lastName - A string denoting the Person's last name.
	 *   @param id - An integer denoting the Person's ID number.
	 *   @param scores - An array of integers denoting the Person's test scores.
	 */
	// Write your constructor here
	Student(String firstName, String lastName, int id, int[] scores){
		super(firstName, lastName, id);
		this.testScores = scores;
	}
	/*
	 *   Method Name: calculate
	 *   @return A character denoting the grade.
	 */
	// Write your method here
	
	public char calculate(){
		int totalAverage = 0;
		int averageGrade;
		
		// adding the total
		for(int i = 0; i < testScores.length; i++){
			totalAverage += testScores[i];
		}
		
		averageGrade = totalAverage / testScores.length;
		
		if (averageGrade >= 90 && averageGrade <= 100){
			return 'O';
		}else if (averageGrade >= 80 && averageGrade <= 90){
			return 'E';
		}else if (averageGrade >= 70 && averageGrade <= 80){
			return 'A';
		}else if (averageGrade >= 55 && averageGrade <= 70){
			return 'P';
		}else if (averageGrade >= 40 && averageGrade <= 55){
			return 'D';
		}else if (averageGrade < 40){
			return 'T';
		}else {
			return Character.MIN_VALUE;
		}
		
	}
}