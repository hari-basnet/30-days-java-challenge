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

    // f(x,y,z) = x +1 / z -y;
    // say x = 5;
    // f(5) = 5 + 1 = 6

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
        numberOfPeopleInCar++;
    }

    public void getOut(){
        numberOfPeopleInCar--;
    }

    public double howManyMilesTillOutOfGas(){
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp(){
        return maxFuel * mpg;
    }

    public static void main(String[] args) {

        // write your code here
        System.out.println("birthday car _______");
        Car birthdayPresent = new Car(500, 5000.55, true );
        birthdayPresent.printVariables();
        birthdayPresent.getIn();
        birthdayPresent.getIn();

        System.out.println("Miles left: " + birthdayPresent.howManyMilesTillOutOfGas());
        System.out.println("Max miles per fillup: " + birthdayPresent.maxMilesPerFillUp());

//        System.out.println("Christmas car ______");
//        Car christmasPresent = new Car(550, 2000, false);
//        christmasPresent.printVariables();
//        christmasPresent.getIn();
//        christmasPresent.printVariables();




    }
}
