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
public class Sports extends Car{
    private double HP;
    private String location; // To keep renting location 

    public Sports(String name, double HP, String color, double seatingCapacity, int numOfDoors, String id, String plateNumber, int numberOfTires, double dailyFee) {
        super(name,color, seatingCapacity, numOfDoors, id, plateNumber, numberOfTires, dailyFee);
        this.HP = HP;
    }

 

    Sports(String name, String id, String plateNumber, int numberOfTires, double dailyFee, Date starting, Date ending, Date starting_rent, Date ending_rent, double HP, String location, String color, double seatingCapacity, int numOfDoors, boolean equals, boolean equals1) {
        super(name, color, seatingCapacity, numOfDoors, id, plateNumber, numberOfTires, dailyFee,starting,ending,starting_rent,ending_rent,equals,equals1); //To change body of generated methods, choose Tools | Templates.
        this.HP=HP;
        this.location=location;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
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
        return "Sports "+super.toString()+" " + HP + " " + location;
    }

    
    
}
