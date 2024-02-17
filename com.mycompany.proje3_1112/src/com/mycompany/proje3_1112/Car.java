/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proje3_1112;

import java.util.Date;

/**
 *
 * @author humeyrabilgin
 */
public abstract class Car extends Vehicle{
    private String color;
    private double seatingCapacity;
    private int numOfDoors;

    public Car(String name,String color, double seatingCapacity, int numOfDoors, String id, String plateNumber, int numberOfTires, double dailyFee) {
        super(name,id, plateNumber, numberOfTires, dailyFee);
        this.color = color;
        this.seatingCapacity = seatingCapacity;
        this.numOfDoors = numOfDoors;
    }
    
    public Car(String name,String color, double seatingCapacity, int numOfDoors, String id, String plateNumber, int numberOfTires, double dailyFee, Date starting, Date ending, Date starting_rent, Date ending_rent, boolean equals, boolean equals1) {
        super(name,id, plateNumber, numberOfTires, dailyFee, equals1,equals, starting, ending, starting_rent, ending_rent);
        this.color = color;
        this.seatingCapacity = seatingCapacity;
        this.numOfDoors = numOfDoors;
    }
    


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return super.toString()+" " + color + " " + seatingCapacity + " " + numOfDoors;
    }

    public double getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(double seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    

    public void cancelMe(Date obj1) throws NoCancellationYouMustPayException {
        if(this.available==false){
            if(obj1.after(this.starting_rent)){
                
                throw new NoCancellationYouMustPayException("You cannot cancel the vehicle in the date you wish because booking of the car will be started before the date that you entered!");
            }
            else{
                this.available=true;
                this.starting=new Date();
                this.ending=starting;
            }
        }
    }
    

    @Override
    public void dropMe(){
        this.available_r=true;
        System.out.println("The total price is: "+this.getDailyFee());
        this.starting_rent=new Date();
        this.ending_rent=starting_rent;
        
    }

    

    
    
   
}

