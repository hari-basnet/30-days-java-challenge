package com.java;

public class Node {
	// properties
	Node next;
	int data;
	
	public Node(int newData){
		data = newData;
		next = null;
	}
	
	public Node (int newData, Node newNext){
		data = newData;
		next = newNext;
		
	}
	
	// Getters and Setters
	
	public int getData() {
		return data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
}
