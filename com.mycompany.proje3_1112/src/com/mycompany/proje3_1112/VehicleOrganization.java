/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proje3_1112;
import java.util.Date;
/**
 *
 * @author humeyrabilgin
 */
public interface VehicleOrganization {
    public Vehicle bookMe(Date starting,Date ending )throws  SorryWeDontHaveThatOneException;
    public void cancelMe(Date obj1)throws NoCancellationYouMustPayException;
    default Vehicle rentMe(Date starting,Date ending,String location )throws SorryWeDontHaveThatOneException{
        return null;
    // FOR DELIVERABLE VEHICLES
    }
    default Vehicle rentMe(Date starting,Date ending)throws SorryWeDontHaveThatOneException{
        return null;
    // FOR UNDELIVERABLE VEHICLES
    }
    public void dropMe();
    default void loadMe(double amount)throws OverWeightException{
        
    }

}
