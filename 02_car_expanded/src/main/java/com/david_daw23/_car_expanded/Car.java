package com.david_daw23._car_expanded;

/**
 * @author REVAN
 */
public class Car {
    private String model = null;
    private final Integer maxSpeed = 100;
    private Integer actualSpeed = 0;
    private char status = 'O'; // operative or broken;
    private final double maxFuel = 16;
    private double currentFuel = 8;
    private double mpg = 26.4;
    private Integer peopleInCar = 0;
    private boolean carActive = false;
    
    public Car() { // on construct
        this.peopleInCar = 1;
        this.carActive = true;
    }
    
    public void setSpeed() {
        this.actualSpeed = this.actualSpeed + 10;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setStatus(char value) {
        if (value == 'O') this.status = 'O';
        if (value == 'B') this.status = 'B';
    }
    public void setFuel(double value) {
        this.currentFuel = value;
    }
    
    
    public Integer getSpeed() {
        return this.actualSpeed;
    }
    
    public char getStatus() {
        return this.status;
    }
    
    public char getModel() {
        return this.status;
    }
    
    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }
    
    public void someoneEnter() {
        this.peopleInCar++;
    }
    
    public void someoneGoesOut() {
        this.peopleInCar--;
    }
            
    public Integer getPeopleInCar() {
        return this.peopleInCar;
    }

    public void showContent() {
        System.out.println("Model: " + this.model);
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Actual Speed: " + this.actualSpeed);
        System.out.println("Status: " + this.status);
        System.out.println("Miles till fuel consumition: " + this.howManyMilesTillOutOfGas());
        System.out.println("People in car: " + this.peopleInCar);
        if(this.carActive == true) System.out.println("The car is ON."); else System.out.println("The car is OFF.");
    }

   
    public static void main(String[] args) {
        System.out.println("Welcome to Car Class Component!");
        Car myCar = new Car();
        myCar.setModel("Volkswaggen");
        myCar.setSpeed();
        myCar.setStatus('O');
        myCar.someoneEnter();
        myCar.showContent();
        System.out.println("---------------");
        System.out.println("Changes v2: (someone goes out) ");
        myCar.someoneGoesOut();
        myCar.showContent();
        myCar.setFuel(100);
        System.out.println("---------------");
        System.out.println("Changes v3: (more gas) ");
        myCar.showContent();
    }
}
