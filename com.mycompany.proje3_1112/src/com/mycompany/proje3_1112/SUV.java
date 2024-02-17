package com.mycompany.proje3_1112;

import java.util.Date;

public class SUV extends Car{
    private String wd;

    public SUV(String name, String wd, String color, double seatingCapacity, int numOfDoors, String id, String plateNumber, int numberOfTires, double dailyFee) {
        super(name, color, seatingCapacity, numOfDoors, id, plateNumber, numberOfTires, dailyFee);
        this.wd = wd;
    }

   
    SUV(String name, String id, String plateNumber, int numberOfTires, double dailyFee, Date starting, Date ending, Date starting_rent, Date ending_rent, String color, double seatingCapacity, int numOfDoors, String wd, boolean equals, boolean equals1) {
        super(name, color, seatingCapacity, numOfDoors, id, plateNumber, numberOfTires, dailyFee,starting,ending,starting_rent,ending_rent,equals,equals1);
        this.wd = wd; 
    }
     
    

    @Override
    public Vehicle rentMe(Date starting, Date ending) throws SorryWeDontHaveThatOneException{
        if(this.available==false){
            throw new SorryWeDontHaveThatOneException("This car is not available for renting");
        }
        else{
            this.starting_rent=starting;
            this.ending_rent=ending;
            System.out.println("The car has been sucessfully rented for dates!");
        }
        return this;
    }

    @Override
    public String toString() {
        return "SUV "+super.toString()+" " + wd;
    }
    
}

