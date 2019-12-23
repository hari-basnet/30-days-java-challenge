package com.java;

import static com.java.Graph.DFS;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node<String> x = new Node("Hello");
        Node<String> y = new Node("world");
        System.out.println(y.getData());
        System.out.println(y.getData());
    
        Node<String> A = new Node<String>("A");
        Node<String> B = new Node<String>("B");
        Node<String> C = new Node<String>("C");
        Node<String> D = new Node<String>("D");
        Node<String> E = new Node<String>("E");
        Node<String> F = new Node<String>("F");
    
        A.setNeighbors(new Node[] {B,C,D});
        B.setNeighbors(new Node[] {A,F});
        C.setNeighbors(new Node[] {A,D,E});
        D.setNeighbors(new Node[] {A,C,F});
        E.setNeighbors(new Node[] {C});
        F.setNeighbors(new Node[] {B,D});
    
        DFS(B);
        DFS(D);
    }
}
