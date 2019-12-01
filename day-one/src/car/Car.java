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
    double mpg = 26.4;

    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;

    // f(x,y,z) = x +1 / z -y;
    // say x = 5;
    // f(5) = 5 + 1 = 6

    public Car(){
        
    }

    // creating a constructor
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    public void printVariables() {
        System.out.println(minSpeed);
        System.out.println(maxSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }

    public void wreckCar() {
        condition = 'C';
    }

    public void upgradeMinSpeed(){
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 10;
    }

    public void getIn(){
        if(numberOfPeopleInCar < maxNumberOfPeopleInCar){
        numberOfPeopleInCar++;
        } else {
            System.out.println("The car is full, " + "max number of people = " + maxNumberOfPeopleInCar);
        }
    }

    public void getOut(){
        if(numberOfPeopleInCar > 0){
        numberOfPeopleInCar--;
        } else {
            System.out.println("No one in the car");
        }
    }

    public double howManyMilesTillOutOfGas(){
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp(){
        return maxFuel * mpg;
    }

    public void turnTheCarOn(){
        if(!isTheCarOn){
            isTheCarOn = true;
        } else {
            System.out.println("The car is already on");
        }
    }

    public static void main(String[] args) {

        // write your code here
        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        tommyCar.turnTheCarOn();


    }
}
