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
public class TransportTrucks extends Truck{

    private boolean go_abroad;

    public TransportTrucks(String name,double loadingCapacity, String id, String plateNumber, int numberOfTires, double dailyFee, String go) {
        super(name,loadingCapacity, id, plateNumber, numberOfTires, dailyFee);
        if(go.equals("Y")){
            go_abroad=true;
        }
        else{
            go_abroad=false;
        }
    }


    

    TransportTrucks(String name, String id, String plateNumber, double loadingCapacity, int numberOfTires, double dailyFee, Date starting, Date ending, Date starting_rent, Date ending_rent, boolean equals, boolean equals0, boolean equals1) {
        super(name,id,plateNumber,loadingCapacity,numberOfTires,dailyFee,starting,ending,starting_rent,ending_rent,equals,equals1);
        this.go_abroad=equals0;//To change body of generated methods, choose Tools | Templates.
    }

    TransportTrucks(String name, String id, String plateNumber, double loadingCapacity, double loaded, int numberOfTires, double dailyFee, Date starting, Date ending, Date starting_rent, Date ending_rent, boolean equals, boolean equals0, boolean equals1) {
        super(name,id,plateNumber,loadingCapacity,numberOfTires,dailyFee,starting,ending,starting_rent,ending_rent,equals0,equals1);
        this.loaded=loaded;
        this.go_abroad=equals; //To change body of generated methods, choose Tools | Templates.
    }
    
   
    @Override
    public String toString() {
        return "TransportTrucks "+super.toString()+ " "+ go_abroad;
    }

    
}
