package com.java;

import java.util.concurrent.TimeUnit;

public class HotChocolate {

    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drinkHotChocolate(double cocoaTemp) throws TooColdException, TooHotException{
        if(cocoaTemp >= tooHot){
            throw new TooHotException();
        }else if(cocoaTemp <= tooCold){
            throw new TooColdException();
        }
    }
    public static void main(String[] args) throws InterruptedException {
	// write your code here
        double currentCocoaTemp = 210;
        boolean wrongTemp = true;
        while (wrongTemp){
        try{
            drinkHotChocolate(currentCocoaTemp);
            System.out.println("That chocolate drink was fine");
            wrongTemp = false;
        }catch(TooHotException e){
            System.out.println("That is too hot ");
            currentCocoaTemp = currentCocoaTemp - 5;
        }catch(TooColdException e2){
            System.out.println("that is too cold, Its like Arctic");
            currentCocoaTemp = currentCocoaTemp + 5;
        }

        }
        TimeUnit.SECONDS.sleep(2);;
        System.out.println("And its gone");
    }
}
