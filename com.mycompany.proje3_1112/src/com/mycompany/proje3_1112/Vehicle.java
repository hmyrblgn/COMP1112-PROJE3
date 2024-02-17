/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proje3_1112;
import java.util.Date;

public abstract class Vehicle implements VehicleOrganization{
  protected String name;
  protected String id;
  protected final String plateNumber;
  protected final int numberOfTires;
  protected double dailyFee;  
  protected boolean available=true;
  protected boolean available_r=true;
  protected Date starting;
  protected Date ending;
  protected Date starting_rent;
  protected Date ending_rent;
  
  
   public Vehicle(String name,String id, String plateNumber, int numberOfTires, double dailyFee) {
        this.name=name;
        this.id = id;
        this.plateNumber = plateNumber;
        this.numberOfTires = numberOfTires;
        this.dailyFee = dailyFee;
        available=true;
        available_r=true;
        starting=new Date();
        ending=starting;
        starting_rent=new Date();
        ending_rent=starting_rent;
    }
   public Vehicle(String name,String id, String plateNumber, int numberOfTires, double dailyFee, Date starting, Date ending) {
        this.name=name; 
        this.id = id;
        this.plateNumber = plateNumber;
        this.numberOfTires = numberOfTires;
        this.dailyFee = dailyFee;
        available=true;
        available_r=true;
        this.starting=starting;
        this.ending=ending;
        this.starting_rent=new Date();
        this.ending_rent=starting_rent;
    }

    public Vehicle(String name , String id, String plateNumber, int numberOfTires, double dailyFee, boolean available_r, boolean available, Date starting, Date ending) {
        this.name=name;
        this.name=name;
        this.id = id;
        this.plateNumber = plateNumber;
        this.numberOfTires = numberOfTires;
        this.dailyFee = dailyFee;
        this.available = available;
        this.available_r=available_r;
        this.starting = starting;
        this.ending = ending;
        this.starting_rent=new Date();
        this.ending_rent=starting_rent;

    }
    
     public Vehicle(String name , String id, String plateNumber, int numberOfTires, double dailyFee, boolean available_r, boolean available, Date starting, Date ending, Date starting_rent, Date ending_rent) {
        this.name=name;
        this.name=name;
        this.id = id;
        this.plateNumber = plateNumber;
        this.numberOfTires = numberOfTires;
        this.dailyFee = dailyFee;
        this.available = available;
        this.available_r=available_r;
        this.starting = starting;
        this.ending = ending;
        this.starting_rent=new Date();
        this.ending_rent=starting_rent;
    }
     
   
    @Override
    public Vehicle bookMe(Date starting, Date ending) throws  SorryWeDontHaveThatOneException{
       
            if(this.available==true){
                this.starting=starting;
                this.ending=ending;
                this.available=false;
            }
            else{
                throw new SorryWeDontHaveThatOneException("The car is not available!");
            }
        
            return this;
        
    }
    
    
    @Override
    public void dropMe(){
        this.available_r=true;
        System.out.println("The total price is: "+this.getDailyFee());
        this.starting_rent=new Date();
        this.ending_rent=starting;
    }

    public double getDailyFee(){
        long timeInMillis1 = starting.getTime();
        long timeInMillis2 = ending.getTime();

        // Calculate the difference in milliseconds
        long diffInMillis = timeInMillis2 - timeInMillis1;

        // Convert milliseconds to seconds
        long diffInSeconds = diffInMillis / 1000;

        // Convert seconds to minutes
        long diffInMinutes = diffInSeconds / 60;

        // Convert minutes to hours
        long diffInHours = diffInMinutes / 60;

        // Convert hours to days
        long diffInDays = diffInHours / 24;

        return (int)diffInDays*dailyFee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Date getStarting() {
        return starting;
    }

    public void setStarting(Date starting) {
        this.starting = starting;
    }

    public Date getEnding() {
        return ending;
    }

    public void setEnding(Date ending) {
        this.ending = ending;
    }
    
    @Override
    public String toString() {
        return name + " "+id + " " + plateNumber + " " + numberOfTires + " " + dailyFee + " " + available + " " + available_r + " " + starting.getDate()+" "+starting.getMonth()+" "+starting.getYear()+ " "+ ending.getDate()+" "+ending.getMonth()+" "+ending.getYear()+" "+starting_rent.getDate()+" "+starting_rent.getMonth()+" "+starting_rent.getYear()+ " "+ ending_rent.getDate()+" "+ending_rent.getMonth()+" "+ending_rent.getYear()+" ";
    }
        
}

