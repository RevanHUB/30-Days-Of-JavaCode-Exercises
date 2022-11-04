package com.david_daw23._car;

/**
 * @author REVAN
 */
public class Car {
    String model = null;
    Integer maxSpeed = 100;
    Integer actualSpeed = 0;
    char status = 'O'; // operative or broken;
  
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
    public Integer getSpeed() {
        return this.actualSpeed;
    }
    public char getStatus() {
        return this.status;
    }
    public char getModel() {
        return this.status;
    }
    public void showContent() {
        System.out.println("Model: " + this.model);
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Actual Speed: " + this.actualSpeed);
        System.out.println("Status: " + this.status);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Car Class Component!");
        Car myCar = new Car();
        myCar.setModel("Volkswaggen");
        myCar.setSpeed();
        myCar.setStatus('B');
        myCar.showContent();
        Car neighbourCar = (Car) myCar;
        if(myCar.getStatus() == 'B') System.out.println("The vehicle is broken . ");
        if(myCar.getStatus() == 'O') System.out.println("The vehicle is operative . ");
        
        System.out.println("---------------");
        
        System.out.println("Cloned car: ");
        neighbourCar.setStatus('O');
        neighbourCar.showContent();
        if(neighbourCar.getStatus() == 'B') System.out.println("The vehicle is broken . ");
        if(neighbourCar.getStatus() == 'O') System.out.println("The vehicle is operative . ");
        
        
    }
}
