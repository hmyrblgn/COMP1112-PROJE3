/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proje3_1112;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author humeyrabilgin
 */
public interface Menu {
    public abstract void display_allVehicles(VehiclePark obj1);
    public abstract void display_availableVehicles(VehiclePark obj2,Date x,Date y);
    public abstract void stop_running(VehiclePark obj);
    
    
    
}