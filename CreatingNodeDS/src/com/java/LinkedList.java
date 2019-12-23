package com.java;

public class LinkedList {
	private Node head;
	
	public LinkedList(){
		head = null;
	}
	
	public int find(int n){
		Node current = head;
		int count = 0;
		while(count < n){
			current = current.getNext();
			if(current == null){
				throw new IndexOutOfBoundsException("cannot find item at position" + n);
			}
			count++;
		}
		return current.getData();
	}
	
	public void insert(int pos, int val){
		// create a new node with given value
		Node newNode = new Node(val, null);
		
		// if given position is 0 the set the node to be head
		if(pos == 0){
			newNode.setNext(head);
			head = newNode;
			return;
		}
		
		Node current = head;
		int count = 0;
		while(count < pos -1){
			current = current.getNext();
			if(current == null){
				throw new IndexOutOfBoundsException("cannot find item at position " + (pos -1));
			}
			count++;
		}
	}
	
	public void delete(int pos){
		if(pos == 0){
			head = head.getNext();
			return;
		}
		
		Node current = head;
		int count = 0;
		while(count < pos -1){
			current = current.getNext();
			if(current == null){
				throw new IndexOutOfBoundsException("cannot find item at position " + (pos -1));
			}
			count++;
		}
		
		if(current.getNext() == null){
			throw new IndexOutOfBoundsException("cannot find item at position" + pos);
		}
		
		current.setNext(current.getNext().getNext());
	}
	
	public String toString(){
		String output = "";
		Node current = head;
		while(current != null){
			output += current.getData() + ", ";
			current = current.getNext();
		}
		return output;
	}
	
}
