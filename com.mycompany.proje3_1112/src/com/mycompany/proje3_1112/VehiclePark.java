/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proje3_1112;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author humeyrabilgin
 */
public class VehiclePark {
    private ArrayList<Vehicle> list;

    public VehiclePark() {
        list=new ArrayList<>();
    }
    
    public void displayVehicles(){
        if(!list.isEmpty()){
            for(int i = 0; i < list.size(); i++) {
                System.out.println(i+") "+list.get(i));
            }
        }
    
}
    public void displayAvailableVehicles(Date a,Date b){
        for(int i=0; i<list.size();i++){
            if(a.after(list.get(i).getEnding())){
                System.out.println(i+")"+list.get(i));
            }
        }
    }
    public void addVehicle(Vehicle obj){
        if(!list.contains(obj)){
            list.add(obj);
        }
        
    }
    public void removeVehicle(Vehicle obj){
        list.remove(obj);
    }
    public Vehicle bookVehicle(Date obj1, Date obj2) throws SorryWeDontHaveThatOneException{ 
        Scanner scn=new Scanner(System.in);
        int choice;
        displayAvailableVehicles(obj1,obj2);
        System.out.println("Which car do you want to book?");
        do{
            choice=scn.nextInt();
        }while(choice<0 || choice>list.size());
        
        Vehicle veh=list.get(choice).bookMe(obj1,obj2);
        return veh;
        
    }
    public void cancelBooking(Vehicle a){
        
    }
    public Vehicle rentVehicle(Date starting, Date ending, int index) throws SorryWeDontHaveThatOneException{
        Vehicle veh=list.get(index).rentMe(starting, ending);
        return veh;
    }
    
    
    public void dailyReport(String filename){
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))){
            for (Object object : list) {
                writer.println(object.toString());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    public ArrayList<Vehicle> getList() {
        return list;
    }

    public void setList(ArrayList<Vehicle> list) {
        this.list = list;
    }
    public void typeVehicles(String type,Date dt,Date dt_end){
          for(int i=0; i<list.size();i++){
              if("smallTrucks".equals(type)){
                  if(list.get(i) instanceof SmallTrucks && dt.after(list.get(i).getEnding())){ //
                      System.out.println(list.get(i));
                  }
              }
              else if("TransportTrucks".equals(type)){
                  if(list.get(i) instanceof TransportTrucks && dt.after(list.get(i).getEnding())){ //
                      System.out.println(list.get(i));

                  }
              }
              else if("Sports".equals(type)){
                  if(list.get(i) instanceof Sports && dt.after(list.get(i).getEnding())){ //
                      System.out.println(list.get(i));
                      
                  }
              }
              else if("StationWagon".equals(type)){
                  if(list.get(i) instanceof StationWagon && dt.after(list.get(i).getEnding())){ //
                       System.out.println(list.get(i));
                     
                  }
              }
              else if("SUV".equals(type)){
                   if(list.get(i) instanceof SUV && dt.after(list.get(i).getEnding())){ //
                      System.out.println(list.get(i));
                      
                  }
                   
              }
             
              
        }
    }
}

