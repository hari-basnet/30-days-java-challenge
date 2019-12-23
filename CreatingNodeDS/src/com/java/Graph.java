package com.java;// Requires the Node class with generics and arbitrary number of connections
// (that's the third one in Node.java)

import java.util.ArrayList;
import java.util.Stack;

public class Graph {
	
	public static void DFS(Node start) {
		ArrayList<Node> visited = new ArrayList<Node>();
		Stack<Node> stack = new Stack<Node>();
		stack.push(start);
		
		while (!stack.empty()) {
			Node current = stack.pop();
			if (!visited.contains(current)) {
				System.out.print(current.getData() + ", ");
				visited.add(current);
				Node[] neighbors = current.getNeighbors();
				for (int i=neighbors.length-1; i>=0; i--) {
					stack.push( neighbors[i] );
				}
			}
		}
		
		System.out.println("");
	}
}