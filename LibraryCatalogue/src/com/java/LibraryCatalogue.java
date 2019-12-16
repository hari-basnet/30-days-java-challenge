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
    public int getCurrentDay() {
        return this.currentDay;
    }

    public Map<String, Book> getBookCollection() {
        return this.bookCollection;
    }

    public double getInitialLateFee() {
        return this.initialLateFee;
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }

    public int getLengthOfCheckoutPeriod() {
        return this.lengthOfCheckoutPeriod;
    }

    public Book getBook(String bookTitle){
        return getBookCollection().get(bookTitle);
    }

    // Setters
    public void nextDay(){
        currentDay++;
    }

    public void setDay(int day){
        currentDay = day;
    }

    // instance methods
    public void checkOutBook(String title){
        Book book = getBook(title);
        if(book.getIsCheckedOut()){
            sorryBookAlreadyCheckedOut(book);
        }else{
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You just checked out " + title + ". It is due on " +
                (getCurrentDay() + getLengthOfCheckoutPeriod()) + " days.");
        }
    }

    public void returnBook(String title){
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
        if(daysLate > 0){
            System.out.println("You owe the library $" + (getInitialLateFee() + daysLate * getFeePerLateDay()) +
                " because your book is "+ daysLate + " days overdue.");
        }else{
            System.out.println("Books Returned. Thank you");
        }
        book.setIsCheckedOut(false, currentDay);
        currentDay = 0;
    }

    public void sorryBookAlreadyCheckedOut(Book book){
        System.out.println("Sorry, " + book.getTitle() + " is already checked out. "
        + "It should be back on "+ (book.getDayCheckedOut() + getLengthOfCheckoutPeriod()
        + " days."));
    }

    public static void main(String[] args) {
	// write your code here
        Map<String, Book> bookCollection = new HashMap<String, Book>();
        Book harry = new Book("Harry Porter", 825825, 99696969);
        bookCollection.put("Harry Porter", harry);

        LibraryCatalogue  lib = new LibraryCatalogue(bookCollection);

        lib.checkOutBook("Harry Porter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOutBook("Harry Porter");
        lib.setDay(17);
        lib.returnBook("Harry Porter");
        lib.checkOutBook("Harry Porter");
    }
}
