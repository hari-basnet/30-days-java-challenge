package com.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node x = new Node(1, null);
        Node y = new Node(2, x);
        System.out.println( y.getData() );
        System.out.println( y.getNext().getData() );
    
    
        LinkedList ll = new LinkedList();
        ll.insert(0, 2);
        ll.insert(0, 1);
        System.out.println(ll.find(1));
    
        ll.insert(0, 0);
        System.out.println(ll);
    
        ll.insert(1, 100);
        System.out.println(ll);
    
        ll.delete(2);
        System.out.println(ll);
    }
}
