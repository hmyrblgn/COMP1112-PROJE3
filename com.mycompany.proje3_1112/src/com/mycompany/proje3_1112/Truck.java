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
public abstract class Truck extends Vehicle{

    
    protected double loadingCapacity;
    protected double loaded;
    
    public Truck(String name,double loadingCapacity, double loaded, String id, String plateNumber, int numberOfTires, double dailyFee) {
        super(name,id, plateNumber, numberOfTires, dailyFee);
        this.loadingCapacity = loadingCapacity;
        this.loaded = loaded;
    }

    public Truck(String name,String id, String plateNumber, int numberOfTires, double dailyFee) {
        super(name,id, plateNumber, numberOfTires, dailyFee);
        this.loadingCapacity = 0;
        this.loaded=0.0;
    }

   
    public Truck(String name,String id, String plateNumber, double loadingCapacity,int numberOfTires, double dailyFee,Date starting, Date ending, Date starting_rent, Date ending_rent, boolean equals, boolean equals1) {
        super(name,id, plateNumber, numberOfTires, dailyFee, equals1,equals, starting, ending);
        this.loadingCapacity = loadingCapacity;
        this.loaded=0.0;
    }

    public Truck(String name,double loadingCapacity, String id, String plateNumber, int numberOfTires, double dailyFee) {
        super(name, id, plateNumber, numberOfTires, dailyFee);
        this.loadingCapacity = loadingCapacity;
        this.loaded=0.0;
    }
    

    public double getLoadingCapacity() {
        return loadingCapacity;
    }

    public void setLoadingCapacity(double loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }
    

    public void cancelMe(Date obj1)throws NoCancellationYouMustPayException {
        if(this.available==false){
            if(obj1.after(this.starting_rent)){
                throw new NoCancellationYouMustPayException("You cannot cancel the vehicle in the date you wish because date of cancellation is after of start of renting date!");
            }
            else{
                this.available=true;
                this.starting=new Date();
                this.ending=starting;
            }
        }
    }

    @Override
    public String toString() {
        return super.toString()+" " + loadingCapacity + " " + loaded;
    }

    @Override
    public Vehicle rentMe(Date starting, Date ending) throws SorryWeDontHaveThatOneException{
        if(this.available==false){
            throw new SorryWeDontHaveThatOneException("This car is not available for renting");
        }
        else{
            this.starting=starting;
            this.ending=ending;
            System.out.println("The car has been sucessfully rented for dates!");
        }
        return this;
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

