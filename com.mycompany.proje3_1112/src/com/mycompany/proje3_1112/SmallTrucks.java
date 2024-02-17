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
class SmallTrucks extends Truck{

    public SmallTrucks(String name, double loadingCapacity, String id, String plateNumber, int numberOfTires, double dailyFee) {
        super(name, loadingCapacity, id, plateNumber, numberOfTires, dailyFee);
    }

   
    SmallTrucks(String name, String id, String plateNumber, double loadingCapacity, int numberOfTires, double dailyFee, Date starting, Date ending, Date starting_rent, Date ending_rent, boolean equals, boolean equals1) {
       super(name,id,plateNumber,loadingCapacity,numberOfTires,dailyFee,starting,ending,starting_rent,ending_rent,equals,equals1); //To change body of generated methods, choose Tools | Templates.
    }

    SmallTrucks(String name, String id, String plateNumber, double loadingCapacity, double loaded, int numberOfTires, double dailyFee, Date starting, Date ending, Date starting_rent, Date ending_rent, boolean equals, boolean equals0) {
       super(name,id,plateNumber,loadingCapacity,numberOfTires,dailyFee,starting,ending,starting_rent,ending_rent,equals,equals0);
       this.loaded=loaded;
    }

    
  
    @Override
    public String toString() {
        return "SmallTrucks "+super.toString();
    }
}
