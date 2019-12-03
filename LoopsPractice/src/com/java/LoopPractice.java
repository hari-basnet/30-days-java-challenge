package com.java;

public class LoopPractice {


    public static void practiceWhileLoop(){
        int x = 0;
        while(x < 5){
            System.out.println("The value of x is " + x);
            x++;
        }
    }

    public static void practiceDoWhileLoop(){
        int x = 0;
        do{
            System.out.println("The value of x is " + x);
            x++;
        }while(x < 10);
    }

    public static void practiceForLoop(){
        for(int x = 0; x < 20; x++){
            System.out.println("The value of x is " + x);
            if(x == 10){
                break;
            }
        }
    }

    public static void createMultiplicationTable(){
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 1; j++){
                System.out.println(j + " * " + i + " = " + i * j );
            }
        }
    }
    public static void main(String[] args) {
	// write your code here
        createMultiplicationTable();
    }
}
