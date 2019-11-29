package car;

public class Car {


    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

    double maxFuel = 16;
    double currentFuel = 8;


    public void printVariables() {
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
    }

    public void wreckCar() {
        condition = 'C';
    }

    public void upgradeMinSpeed(){
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 10;
    }

    public static void main(String[] args) {

        // write your code here
        Car familyCar = new Car();
        familyCar.printVariables();
        System.out.println("----------------");

        familyCar.upgradeMinSpeed();
        familyCar.printVariables();



    }
}
