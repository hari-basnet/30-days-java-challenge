package com.java;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Difference {
	
	private int[] elements;
	public int maximumDifference;
	
	// Add your code here
	Difference(int[] elements){
		this.elements = elements;
	}
	
	public void computeDifference(){
		IntSummaryStatistics stat = Arrays.stream(elements).summaryStatistics();
		
		int minValue = stat.getMin();
		int maxValue = stat.getMax();
		
		maximumDifference = maxValue - minValue;
	}
	
	
}
