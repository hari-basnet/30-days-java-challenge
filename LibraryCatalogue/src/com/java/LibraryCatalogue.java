package com.java;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {

    private Map<String, Book> bookCollection = new HashMap<String, Book>();
    private int currentDay = 0;
    private int lengthOfCheckoutPeriod = 7;
    private double initialLateFee = 0.50;
    private double feePerLateDay = 1.00;


    // constructors
    public LibraryCatalogue( Map<String, Book> collection){
        this.bookCollection = collection;
    }

    public LibraryCatalogue(Map<String, Book> collection, int lengthOfCheckoutPeriod, double initialLateFee, double feePerLateDay){
        this.bookCollection = collection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }

    // Getters

    public Map<String, Book> getBookCollection() {
        return this.bookCollection;
    }

    public int getCurrentDay() {
        return this.currentDay;
    }

    public int getLengthOfCheckoutPeriod() {
        return this.lengthOfCheckoutPeriod;
    }

    public double getInitialLateFee() {
        return this.initialLateFee;
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
