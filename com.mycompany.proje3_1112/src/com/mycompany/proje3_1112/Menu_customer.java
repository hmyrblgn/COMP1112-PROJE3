/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proje3_1112;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author humeyrabilgin
 */


public class Menu_customer implements Menu{
    
    ArrayList<Vehicle> booked_vehicles; 
    ArrayList<Vehicle> rented_vehicles; 
    public String name;
    public String email;
    
    public Menu_customer(String name){
        this.name=name;
        booked_vehicles=new ArrayList<>();
    }
    public Menu_customer(String name, String email){
        this.name=name;
        this.email=email;
        booked_vehicles=new ArrayList<>();
        rented_vehicles=new ArrayList<>();
    }
    
    public void display_allVehicles(VehiclePark obj1){
        obj1.displayVehicles();
    }
    public void display_availableVehicles(VehiclePark obj2,Date x,Date y){
        obj2.displayAvailableVehicles(x,y);

    }
    
    public void rent(VehiclePark obj) throws SorryWeDontHaveThatOneException{
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the starting dates: (YEAR:MONTH:DAY)");
        int year=scn.nextInt();
        int month=scn.nextInt();
        int day=scn.nextInt();
        Date dt=new Date(year,month,day);
        System.out.println("Enter the ending dates: (YEAR:MONTH:DAY)");
        int year_end=scn.nextInt();
        int month_end=scn.nextInt();
        int day_end=scn.nextInt();
        Date dt_end=new Date(year_end,month_end,day_end);
        obj.displayAvailableVehicles(dt, dt_end);
        System.out.println("Which car dou you want to choice: ");
        int choice;
        do{
            choice=scn.nextInt();
        }while(choice<0 || choice>=obj.getList().size());
        
        Vehicle veh=obj.rentVehicle(dt,dt_end,choice);
        if(!rented_vehicles.contains(veh) && veh!=null){
            rented_vehicles.add(veh);
        }
    }
    
    public void displayRented(){
        for(int i=0;i<rented_vehicles.size();i++){
            System.out.println(i+") "+rented_vehicles.get(i));
        }
    }
    
    public void drop(VehiclePark obj){
        Scanner scn=new Scanner(System.in);
        this.displayRented();
        int choice;
        if(rented_vehicles.isEmpty()==false){
            do{
                System.out.println("Which vehicle do you want to drop?");
                choice=scn.nextInt();
            }while(choice<0 && choice>=rented_vehicles.size());
            
            obj.getList().get(choice).dropMe();
            rented_vehicles.remove(choice);
        }
    }
    
    
    public void type_vehicles(VehiclePark obj3,String type,Date start,Date end){
      obj3.typeVehicles(type,start,end);
             
    }
    public void book(VehiclePark obj, Date obj1, Date obj2) throws SorryWeDontHaveThatOneException{
        Vehicle veh=obj.bookVehicle(obj1, obj2);
        if(!rented_vehicles.contains(veh)){
            rented_vehicles.add(veh);
        }
        if(veh!=null && !booked_vehicles.contains(veh)){
            booked_vehicles.add(veh);
        }
    }
    
    public void displayBooked(){
        for(int i=0;i<booked_vehicles.size();i++){
            System.out.println(i+") "+booked_vehicles.get(i));
        }
    }
    
    public void cancelBook(VehiclePark obj){
        Scanner scn=new Scanner(System.in);
        this.displayBooked();
        int choice;
        if(!booked_vehicles.isEmpty()){
            do{
                System.out.println("Which vehicle do you want to cancel booking?");
                choice=scn.nextInt();
            }while(choice<0 || choice>=booked_vehicles.size());
            obj.cancelBooking(booked_vehicles.get(choice));
            booked_vehicles.remove(choice);
        }
        
     
        
    }
    
    @Override
    public void stop_running(VehiclePark obj){
        obj.dailyReport("endOfTheProgram.dat");
    }
    
    public ArrayList<Vehicle> getBookedList(){
        return this.booked_vehicles;
    }
    
    public ArrayList<Vehicle> getRentedList(){
        return this.rented_vehicles;
    }
    
    public void write_customers_informations(ArrayList<Menu_customer> list){
        try (PrintWriter writer = new PrintWriter(new FileWriter("CustomerInformation.dat"))) {
            for(int i=0;i<list.size();i++){
                for(int j=0;j<list.get(i).getBookedList().size();j++){
                    writer.println("B "+name+" "+email+" "+list.get(i).getBookedList().get(j).toString());
                }
            }
            for(int i=0;i<list.size();i++){
                for(int j=0;j<list.get(i).getRentedList().size();j++){
                    writer.println("R "+name+" "+email+" "+list.get(i).getRentedList().get(j).toString());
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
   
}
