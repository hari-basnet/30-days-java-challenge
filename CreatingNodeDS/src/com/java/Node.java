package com.java;

public class Node {
	
	private int data;
	private Node next;
	
	public Node(int d, Node nx){
		
		this.data = d;
		this.next = nx;
	}
	
	// Getters
	public int getData(){
		return data;
	}
	
	public Node getNext(){
		return next;
		
	}
	
	public void setData(int d ){
		data = d;
	}
	
	public void setNext(Node n){
		next = n;
	}
	
	
}
