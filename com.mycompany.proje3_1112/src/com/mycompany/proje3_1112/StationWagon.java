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
public class StationWagon extends Car{
    private double loadingCapacity;
    private double loaded=0.0;
    private String location; // To keep renting location 

    public StationWagon(String name, double loadingCapacity, String color, double seatingCapacity, int numOfDoors, String id, String plateNumber, int numberOfTires, double dailyFee) {
        super(name,color, seatingCapacity, numOfDoors, id, plateNumber, numberOfTires, dailyFee);
        this.loadingCapacity = loadingCapacity;
    }

   


    StationWagon(String name, String id, String plateNumber, int numberOfTires, double dailyFee, Date starting, Date ending, Date starting_rent, Date ending_rent, double loadingCapacity, String location, String color, double seatingCapacity, int numOfDoors, boolean equals, boolean equals1) {
        super(name, color, seatingCapacity, numOfDoors, id, plateNumber, numberOfTires, dailyFee,starting,ending,starting_rent,ending_rent,equals,equals1);
        this.loadingCapacity = loadingCapacity;
        
        this.location=location; 
    }

    StationWagon(String name, String id, String plateNumber, int numberOfTires, double dailyFee, Date starting, Date ending, Date starting_rent, Date ending_rent, double loadingCapacity, double loaded, String location, String color, double seatingCapacity, int numOfDoors, boolean equals, boolean equals1) {
        super(name, color, seatingCapacity, numOfDoors, id, plateNumber, numberOfTires, dailyFee,starting,ending,starting_rent,ending_rent,equals,equals1);
        this.loadingCapacity = loadingCapacity;
        this.loaded=loaded;
        this.location=location; 
    }
    
   

    @Override
    public Vehicle rentMe(Date starting, Date ending, String location) throws SorryWeDontHaveThatOneException{
        if(this.available==false){
            throw new SorryWeDontHaveThatOneException("This car is not available for renting");
        }
        else{
            this.location=location;
            this.starting_rent=starting;
            this.ending_rent=ending;
            System.out.println("The car has been sucessfully rented for dates!");
        }
        return this;
    }

    @Override
    public String toString() {
        return "StationWagon "+super.toString()+" " + loadingCapacity + " " + loaded + " " + location;
    }
    
    @Override
    public void loadMe(double amount) throws OverWeightException {
        if(loaded+amount>this.loadingCapacity){
            throw new OverWeightException("Limited loaded capacity!!");
        }
        else{
            loaded+=amount;
        }
    }
  
}