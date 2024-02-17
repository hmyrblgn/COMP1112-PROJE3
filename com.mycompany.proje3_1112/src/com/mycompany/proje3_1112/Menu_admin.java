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

public class Menu_admin implements Menu{
    public void display_allVehicles(VehiclePark obj1){
        obj1.displayVehicles();
    }
    public void display_availableVehicles(VehiclePark obj2,Date x,Date y){
        obj2.displayAvailableVehicles(x, y);
    }
    public void add(VehiclePark obj){
        
        Scanner scn=new Scanner(System.in);
        System.out.println("1) Car\n2) Truck");
        int choice=scn.nextInt();
        
        if(choice==1){
            System.out.println("1) Sports\n2) StationWagon\n3) SUV");
            choice=scn.nextInt();
            if(choice==1){
                System.out.print("Enter ID of car: ");
                String id=scn.next();
                System.out.print("Enter plateNumber of car: ");
                String plateNumber=scn.next();
                System.out.print("Enter number of tires: ");
                int numOfTires=scn.nextInt();
                System.out.print("Car name: ");
                String name=scn.next();
                System.out.print("Color name: ");
                String Color=scn.next();
                System.out.print("seatingCapacity: ");
                double seatingCapacity=scn.nextDouble();
                System.out.print("numOfDoors: ");
                int numOfDoors=scn.nextInt();
                System.out.print("HP: ");
                double HP=scn.nextDouble();
                System.out.print("Daily Fee: ");
                double fee=scn.nextDouble();
                
                Sports sp=new Sports(name,HP,Color,seatingCapacity,numOfDoors,id,plateNumber,numOfTires,fee);
                
                obj.getList().add(sp);
                obj.dailyReport("hum.dat");
            }
            else if(choice==2){
                System.out.print("Enter ID of car: ");
                String id=scn.next();
                System.out.print("Enter plateNumber of car: ");
                String plateNumber=scn.next();
                System.out.print("Enter number of tires: ");
                int numOfTires=scn.nextInt();
                System.out.print("Car name: ");
                String name=scn.next();
                System.out.print("Color name: ");
                String Color=scn.next();
                System.out.print("seatingCapacity: ");
                double seatingCapacity=scn.nextDouble();
                System.out.print("numOfDoors: ");
                int numOfDoors=scn.nextInt();
                System.out.print("LoadingCapacity: ");
                double LoadingCapacity=scn.nextDouble();
                System.out.print("Daily Fee: ");
                double fee=scn.nextDouble();
                
                StationWagon sw=new StationWagon(name,LoadingCapacity,Color,seatingCapacity,numOfDoors,id,plateNumber,numOfTires,fee);
                obj.getList().add(sw);
                
            }
            else if(choice==3){
                System.out.print("Enter ID of car: ");
                String id=scn.next();
                System.out.print("Enter plateNumber of car: ");
                String plateNumber=scn.next();
                System.out.print("Enter number of tires: ");
                int numOfTires=scn.nextInt();
                System.out.print("Car name: ");
                String name=scn.next();
                System.out.print("Color name: ");
                String Color=scn.next();
                System.out.print("seatingCapacity: ");
                double seatingCapacity=scn.nextDouble();
                System.out.print("numOfDoors: ");
                int numOfDoors=scn.nextInt();
                System.out.print("WD: ");
                String wd=scn.next();
                System.out.print("Daily Fee: ");
                double fee=scn.nextDouble();
                
                SUV suv=new SUV(name,wd,Color,seatingCapacity,numOfDoors,id,plateNumber,numOfTires,fee);
                
                obj.getList().add(suv);
            }
        }
        else if(choice==2){
            System.out.print("1) SmallTruck\n2)TransportTrucks: ");
            choice=scn.nextInt();
            if(choice==1){
                System.out.print("Enter ID of car: ");
                String id=scn.next();
                System.out.print("Enter plateNumber of car: ");
                String plateNumber=scn.next();
                System.out.print("Enter number of tires: ");
                int numOfTires=scn.nextInt();
                System.out.print("Car name: ");
                String name=scn.next();
                System.out.print("Color name: ");
                String Color=scn.next();
                System.out.print("loadingCapacity:: ");
                double loadingCapacity=scn.nextDouble();
                System.out.print("Daily Fee: ");
                double fee=scn.nextDouble();
                SmallTrucks st=new SmallTrucks(name,loadingCapacity,id,plateNumber,numOfTires,fee);

                obj.getList().add(st);
            }
            else if(choice==2){
                System.out.print("Enter ID of car: ");
                String id=scn.next();
                System.out.print("Enter plateNumber of car: ");
                String plateNumber=scn.next();
                System.out.print("Enter number of tires: ");
                int numOfTires=scn.nextInt();
                System.out.print("Car name: ");
                String name=scn.next();
                System.out.print("Color name: ");
                String Color=scn.next();
                System.out.print("loadingCapacity:: ");
                double loadingCapacity=scn.nextDouble();
                System.out.print("Daily Fee: ");
                double fee=scn.nextDouble();
                System.out.print("Go abroad(Y/N): ");
                String go_abroad=scn.next();
                TransportTrucks tt=new TransportTrucks(name,loadingCapacity,id,plateNumber,numOfTires,fee,go_abroad);
            
                obj.getList().add(tt);
            }
        }
    }
    
    public void remove(VehiclePark obj){
        Scanner scn=new Scanner(System.in);
        obj.displayVehicles();
        int choice;
        do{
            System.out.println("Which vehicle do you want to delete: ");
            choice=scn.nextInt();
        }while(choice<0 || choice>=obj.getList().size());
        
        obj.getList().remove(choice);
    }

    public void report(VehiclePark obj){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename=scn.next();

        obj.dailyReport(filename);

           
    }

    public void stop_running(VehiclePark obj){
        obj.dailyReport("endOfTheProgram.dat");
    }
    
}
