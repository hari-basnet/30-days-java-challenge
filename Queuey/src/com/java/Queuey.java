package com.java;

import java.util.LinkedList;

public class Queuey {

	 private LinkedList queue;

	public Queuey () {
		queue = new LinkedList();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public int size() {
		return  queue.size();
	}

	// enqueing an item
	public void enqueue(int n) {
		queue.addLast(n);
	}

	public int dequeue() {
		return (int) queue.remove(0);
	}

	// returns the first item
	public int peek() {
		return (int) queue.get(0);
	}
}
