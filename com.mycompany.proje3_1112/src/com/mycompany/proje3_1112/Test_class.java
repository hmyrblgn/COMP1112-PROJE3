/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proje3_1112;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author humeyrabilgin
 */
public class Test_class {
    
    public static void readFile(VehiclePark vp){
        
        
        try{
            File file = new File("endOfTheProgram.dat"); // Replace with your file path
            Scanner scanner = new Scanner(file);
            //System.out.println("buradayim");
            while (scanner.hasNext()){ // hasNext method returns true if there is another word in the input
                String word = scanner.next(); // next method scans the next token of the input as a String
                //System.out.println(word);
                if(word.equals("SmallTrucks")){ 
                    String name=scanner.next();
                    String id=scanner.next();
                    String plateNumber=scanner.next();
                    int numberOfTires=scanner.nextInt();
                    double dailyFee=scanner.nextDouble();
                    String available=scanner.next();
                    String available_r=scanner.next();
                    int startDay=scanner.nextInt();
                    int startMonth=scanner.nextInt();
                    int startYear=scanner.nextInt();
                    int endDay=scanner.nextInt();
                    int endMonth=scanner.nextInt();
                    int endYear=scanner.nextInt();
                    int startDayr=scanner.nextInt();
                    int startMonthr=scanner.nextInt();
                    int startYearr=scanner.nextInt();
                    int endDayr=scanner.nextInt();
                    int endMonthr=scanner.nextInt();
                    int endYearr=scanner.nextInt();
                    double loadingCapacity=scanner.nextDouble();
                    double loaded=scanner.nextDouble();
                    Date starting_rent=new Date(startYearr,startMonthr,startDayr);
                    Date ending_rent=new Date(endYearr,endMonthr,endDayr);
                    Date starting=new Date(startYear,startMonth,startDay);
                    Date ending=new Date(endYear,endMonth,endDay);
                    
                    SmallTrucks st=new SmallTrucks(name,id,plateNumber,loadingCapacity,loaded,numberOfTires,dailyFee,starting,ending,starting_rent,ending_rent,available.equals("true"),available_r.equals("true"));
                    vp.addVehicle(st);
                }
                else if(word.equals("TransportTrucks")){
                    String name=scanner.next();
                    String id=scanner.next();
                    String plateNumber=scanner.next();
                    int numberOfTires=scanner.nextInt();
                    double dailyFee=scanner.nextDouble();
                    String available=scanner.next();
                    String available_r=scanner.next();
                    int startDay=scanner.nextInt();
                    int startMonth=scanner.nextInt();
                    int startYear=scanner.nextInt();
                    int endDay=scanner.nextInt();
                    int endMonth=scanner.nextInt();
                    int endYear=scanner.nextInt();
                    int startDayr=scanner.nextInt();
                    int startMonthr=scanner.nextInt();
                    int startYearr=scanner.nextInt();
                    int endDayr=scanner.nextInt();
                    int endMonthr=scanner.nextInt();
                    int endYearr=scanner.nextInt();
                    double loadingCapacity=scanner.nextDouble();
                    double loaded=scanner.nextDouble();
                    Date starting_rent=new Date(startYearr,startMonthr,startDayr);
                    Date ending_rent=new Date(endYearr,endMonthr,endDayr);
                    Date starting=new Date(startYear,startMonth,startDay);
                    Date ending=new Date(endYear,endMonth,endDay);
                    String abroad=scanner.next();
                    
                    TransportTrucks st=new TransportTrucks(name,id,plateNumber,loadingCapacity,loaded,numberOfTires,dailyFee,starting,ending,starting_rent,ending_rent,abroad.equals("true"),available.equals("true"),available_r.equals("true"));
                    vp.addVehicle(st);
                }
                else if(word.equals("Sports")){
                    String name=scanner.next();
                    String id=scanner.next();
                    String plateNumber=scanner.next();
                    int numberOfTires=scanner.nextInt();
                    double dailyFee=scanner.nextDouble();
                    String available=scanner.next();
                    String available_r=scanner.next();
                    int startDay=scanner.nextInt();
                    int startMonth=scanner.nextInt();
                    int startYear=scanner.nextInt();
                    int endDay=scanner.nextInt();
                    int endMonth=scanner.nextInt();
                    int endYear=scanner.nextInt();
                    int startDayr=scanner.nextInt();
                    int startMonthr=scanner.nextInt();
                    int startYearr=scanner.nextInt();
                    int endDayr=scanner.nextInt();
                    int endMonthr=scanner.nextInt();
                    int endYearr=scanner.nextInt();
                    String color=scanner.next();
                    double seatingCapacity=scanner.nextDouble();
                    int numOfDoors=scanner.nextInt();
                    double HP=scanner.nextDouble();
                    String location=scanner.next();
                    Date starting_rent=new Date(startYearr,startMonthr,startDayr);
                    Date ending_rent=new Date(endYearr,endMonthr,endDayr);
                    Date starting=new Date(startYear,startMonth,startDay);
                    Date ending=new Date(endYear,endMonth,endDay);
                    Sports st=new Sports(name,id,plateNumber,numberOfTires,dailyFee,starting,ending,starting_rent,ending_rent,HP,location,color,seatingCapacity,numOfDoors,available.equals("true"),available_r.equals("true"));
                    vp.addVehicle(st);
                }
                else if(word.equals("StationWagon")){
                    String name=scanner.next();
                    String id=scanner.next();
                    String plateNumber=scanner.next();
                    int numberOfTires=scanner.nextInt();
                    double dailyFee=scanner.nextDouble();
                    String available=scanner.next();
                    String available_r=scanner.next();
                    int startDay=scanner.nextInt();
                    int startMonth=scanner.nextInt();
                    int startYear=scanner.nextInt();
                    int endDay=scanner.nextInt();
                    int endMonth=scanner.nextInt();
                    int endYear=scanner.nextInt();
                    int startDayr=scanner.nextInt();
                    int startMonthr=scanner.nextInt();
                    int startYearr=scanner.nextInt();
                    int endDayr=scanner.nextInt();
                    int endMonthr=scanner.nextInt();
                    int endYearr=scanner.nextInt();
                    String color=scanner.next();
                    double seatingCapacity=scanner.nextDouble();
                    int numOfDoors=scanner.nextInt();
                    double loadingCapacity=scanner.nextDouble();
                    double loaded=scanner.nextDouble();
                    String location=scanner.next();
                    Date starting_rent=new Date(startYearr,startMonthr,startDayr);
                    Date ending_rent=new Date(endYearr,endMonthr,endDayr);
                    Date starting=new Date(startYear,startMonth,startDay);
                    Date ending=new Date(endYear,endMonth,endDay);
                    StationWagon st=new StationWagon(name,id,plateNumber,numberOfTires,dailyFee,starting,ending,starting_rent,ending_rent,loadingCapacity,loaded,location,color,seatingCapacity,numOfDoors,available.equals("true"),available_r.equals("true"));
                    vp.addVehicle(st);
                }
                else if(word.equals("SUV")){
                    String name=scanner.next();
                    String id=scanner.next();
                    String plateNumber=scanner.next();
                    int numberOfTires=scanner.nextInt();
                    double dailyFee=scanner.nextDouble();
                    String available=scanner.next();
                    String available_r=scanner.next();
                    int startDay=scanner.nextInt();
                    int startMonth=scanner.nextInt();
                    int startYear=scanner.nextInt();
                    int endDay=scanner.nextInt();
                    int endMonth=scanner.nextInt();
                    int endYear=scanner.nextInt();
                    int startDayr=scanner.nextInt();
                    int startMonthr=scanner.nextInt();
                    int startYearr=scanner.nextInt();
                    int endDayr=scanner.nextInt();
                    int endMonthr=scanner.nextInt();
                    int endYearr=scanner.nextInt();
                    String color=scanner.next();
                    double seatingCapacity=scanner.nextDouble();
                    int numOfDoors=scanner.nextInt();
                    String wd=scanner.next();
                    Date starting_rent=new Date(startYearr,startMonthr,startDayr);
                    Date ending_rent=new Date(endYearr,endMonthr,endDayr);
                    Date starting=new Date(startYear,startMonth,startDay);
                    Date ending=new Date(endYear,endMonth,endDay);
                    SUV st=new SUV(name,id,plateNumber,numberOfTires,dailyFee,starting,ending,starting_rent,ending_rent,color,seatingCapacity,numOfDoors,wd,available.equals("true"),available_r.equals("true"));
                    vp.addVehicle(st);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public static void readFileForCustomer(VehiclePark vp, ArrayList<Menu_customer> list){
        
        
        try{
            File file = new File("CustomerInformation.dat"); // Replace with your file path
            Scanner scanner = new Scanner(file);
            Vehicle st=null;
            //System.out.println("buradayim");
            int index=0;
            while (scanner.hasNext()){ // hasNext method returns true if there is another word in the input
                String b_or_r=scanner.next();
                String name_cus=scanner.next();
                String email=scanner.next();
                Menu_customer cus=new Menu_customer(name_cus,email);
                list.add(cus);
                String word = scanner.next(); // next method scans the next token of the input as a String
                //System.out.println(word);
                if(word.equals("SmallTrucks")){ 
                    String name=scanner.next();
                    String id=scanner.next();
                    String plateNumber=scanner.next();
                    int numberOfTires=scanner.nextInt();
                    double dailyFee=scanner.nextDouble();
                    String available=scanner.next();
                    String available_r=scanner.next();
                    int startDay=scanner.nextInt();
                    int startMonth=scanner.nextInt();
                    int startYear=scanner.nextInt();
                    int endDay=scanner.nextInt();
                    int endMonth=scanner.nextInt();
                    int endYear=scanner.nextInt();
                    int startDayr=scanner.nextInt();
                    int startMonthr=scanner.nextInt();
                    int startYearr=scanner.nextInt();
                    int endDayr=scanner.nextInt();
                    int endMonthr=scanner.nextInt();
                    int endYearr=scanner.nextInt();
                    double loadingCapacity=scanner.nextDouble();
                    double loaded=scanner.nextDouble();
                    Date starting_rent=new Date(startYearr,startMonthr,startDayr);
                    Date ending_rent=new Date(endYearr,endMonthr,endDayr);
                    Date starting=new Date(startYear,startMonth,startDay);
                    Date ending=new Date(endYear,endMonth,endDay);
                    
                    st=new SmallTrucks(name,id,plateNumber,loadingCapacity,numberOfTires,dailyFee,starting,ending,starting_rent,ending_rent,available.equals("true"),available_r.equals("true"));
                    vp.addVehicle(st);
                }
                else if(word.equals("TransportTrucks")){
                    String name=scanner.next();
                    String id=scanner.next();
                    String plateNumber=scanner.next();
                    int numberOfTires=scanner.nextInt();
                    double dailyFee=scanner.nextDouble();
                    String available=scanner.next();
                    String available_r=scanner.next();
                    int startDay=scanner.nextInt();
                    int startMonth=scanner.nextInt();
                    int startYear=scanner.nextInt();
                    int endDay=scanner.nextInt();
                    int endMonth=scanner.nextInt();
                    int endYear=scanner.nextInt();
                    int startDayr=scanner.nextInt();
                    int startMonthr=scanner.nextInt();
                    int startYearr=scanner.nextInt();
                    int endDayr=scanner.nextInt();
                    int endMonthr=scanner.nextInt();
                    int endYearr=scanner.nextInt();
                    double loadingCapacity=scanner.nextDouble();
                    double loaded=scanner.nextDouble();
                    Date starting_rent=new Date(startYearr,startMonthr,startDayr);
                    Date ending_rent=new Date(endYearr,endMonthr,endDayr);
                    Date starting=new Date(startYear,startMonth,startDay);
                    Date ending=new Date(endYear,endMonth,endDay);
                    String abroad=scanner.next();
                    
                    st=new TransportTrucks(name,id,plateNumber,loadingCapacity,numberOfTires,dailyFee,starting,ending,starting_rent,ending_rent,abroad.equals("true"),available.equals("true"),available_r.equals("true"));
                    vp.addVehicle(st);
                }
                else if(word.equals("Sports")){
                    String name=scanner.next();
                    String id=scanner.next();
                    String plateNumber=scanner.next();
                    int numberOfTires=scanner.nextInt();
                    double dailyFee=scanner.nextDouble();
                    String available=scanner.next();
                    String available_r=scanner.next();
                    int startDay=scanner.nextInt();
                    int startMonth=scanner.nextInt();
                    int startYear=scanner.nextInt();
                    int endDay=scanner.nextInt();
                    int endMonth=scanner.nextInt();
                    int endYear=scanner.nextInt();
                    int startDayr=scanner.nextInt();
                    int startMonthr=scanner.nextInt();
                    int startYearr=scanner.nextInt();
                    int endDayr=scanner.nextInt();
                    int endMonthr=scanner.nextInt();
                    int endYearr=scanner.nextInt();
                    String color=scanner.next();
                    double seatingCapacity=scanner.nextDouble();
                    int numOfDoors=scanner.nextInt();
                    double HP=scanner.nextDouble();
                    String location=scanner.next();
                    Date starting_rent=new Date(startYearr,startMonthr,startDayr);
                    Date ending_rent=new Date(endYearr,endMonthr,endDayr);
                    Date starting=new Date(startYear,startMonth,startDay);
                    Date ending=new Date(endYear,endMonth,endDay);
                    st=new Sports(name,id,plateNumber,numberOfTires,dailyFee,starting,ending,starting_rent,ending_rent,HP,location,color,seatingCapacity,numOfDoors,available.equals("true"),available_r.equals("true"));
                    vp.addVehicle(st);
                }
                else if(word.equals("StationWagon")){
                    String name=scanner.next();
                    String id=scanner.next();
                    String plateNumber=scanner.next();
                    int numberOfTires=scanner.nextInt();
                    double dailyFee=scanner.nextDouble();
                    String available=scanner.next();
                    String available_r=scanner.next();
                    int startDay=scanner.nextInt();
                    int startMonth=scanner.nextInt();
                    int startYear=scanner.nextInt();
                    int endDay=scanner.nextInt();
                    int endMonth=scanner.nextInt();
                    int endYear=scanner.nextInt();
                    int startDayr=scanner.nextInt();
                    int startMonthr=scanner.nextInt();
                    int startYearr=scanner.nextInt();
                    int endDayr=scanner.nextInt();
                    int endMonthr=scanner.nextInt();
                    int endYearr=scanner.nextInt();
                    String color=scanner.next();
                    double seatingCapacity=scanner.nextDouble();
                    int numOfDoors=scanner.nextInt();
                    double loadingCapacity=scanner.nextDouble();
                    String location=scanner.next();
                    Date starting_rent=new Date(startYearr,startMonthr,startDayr);
                    Date ending_rent=new Date(endYearr,endMonthr,endDayr);
                    Date starting=new Date(startYear,startMonth,startDay);
                    Date ending=new Date(endYear,endMonth,endDay);
                    st=new StationWagon(name,id,plateNumber,numberOfTires,dailyFee,starting,ending,starting_rent,ending_rent,loadingCapacity,location,color,seatingCapacity,numOfDoors,available.equals("true"),available_r.equals("true"));
                    vp.addVehicle(st);
                }
                else if(word.equals("SUV")){
                    String name=scanner.next();
                    String id=scanner.next();
                    String plateNumber=scanner.next();
                    int numberOfTires=scanner.nextInt();
                    double dailyFee=scanner.nextDouble();
                    String available=scanner.next();
                    String available_r=scanner.next();
                    int startDay=scanner.nextInt();
                    int startMonth=scanner.nextInt();
                    int startYear=scanner.nextInt();
                    int endDay=scanner.nextInt();
                    int endMonth=scanner.nextInt();
                    int endYear=scanner.nextInt();
                    int startDayr=scanner.nextInt();
                    int startMonthr=scanner.nextInt();
                    int startYearr=scanner.nextInt();
                    int endDayr=scanner.nextInt();
                    int endMonthr=scanner.nextInt();
                    int endYearr=scanner.nextInt();
                    String color=scanner.next();
                    double seatingCapacity=scanner.nextDouble();
                    int numOfDoors=scanner.nextInt();
                    String wd=scanner.next();
                    Date starting_rent=new Date(startYearr,startMonthr,startDayr);
                    Date ending_rent=new Date(endYearr,endMonthr,endDayr);
                    Date starting=new Date(startYear,startMonth,startDay);
                    Date ending=new Date(endYear,endMonth,endDay);
                    st=new SUV(name,id,plateNumber,numberOfTires,dailyFee,starting,ending,starting_rent,ending_rent,color,seatingCapacity,numOfDoors,wd,available.equals("true"),available_r.equals("true"));
                    vp.addVehicle(st);
                }
                if(b_or_r.equals("R")){
                    list.get(index++).getRentedList().add(st);
                }
                else{
                    list.get(index++).getBookedList().add(st);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    
    public static void main(String args[]) throws SorryWeDontHaveThatOneException {
        
        Scanner scn=new Scanner(System.in);
        int press=0;
        System.out.println("1-ADMIN\n2-CUSTOMER ");
        int choice;
        VehiclePark vp=new VehiclePark();
        readFile(vp);
        ArrayList<Menu_customer> m_customer_list=new ArrayList<>();
        readFileForCustomer(vp,m_customer_list);
        do{
            choice=scn.nextInt();
        }while(choice!=1 && choice!=2);
        
        if(choice==1){
            Menu_admin admin=new Menu_admin();
            
            do{
                System.out.println("(Press 1) Display all vehicles");
                System.out.println("(Press 2) Display available vehicles");
                System.out.println("(Press 3) Add a new vehicle to the system.");
                System.out.println("(Press 4) Remove vehicle");
                System.out.println("(Press 5) Reports: creates daily reports");
                System.out.println("(Press 6) Quit: stop running.");
                press=scn.nextInt();
                if(press==1){
                    admin.display_allVehicles(vp);
                }
                else if(press==2){
                    System.out.println("ENTER THE STARTING DATE (Y/M/D)");
                    int year=scn.nextInt();
                    int month=scn.nextInt();
                    int day=scn.nextInt();
                    Date dt=new Date(year,month,day);
                    System.out.println("ENTER THE ENDING DATE (Y/M/D)");
                    int year_end=scn.nextInt();
                    int month_end=scn.nextInt();
                    int day_end=scn.nextInt();
                    Date dt_end=new Date(year_end,month_end,day_end);
                    admin.display_availableVehicles(vp, dt, dt_end);
                }
                else if(press==3){
                    admin.add(vp);
                }
                else if(press==4){
                    admin.remove(vp);
                }
                else if(press==5){
                    admin.report(vp);
                }
                else if(press==6){
                    admin.stop_running(vp);
                }
            }while(press!=6);
      
        }
        if(choice==2){
            Menu_customer cus = null;
                  
            System.out.println("1)Sign in\n2)Sign up");
            do{
                choice=scn.nextInt();
            }while(choice!=1 && choice!=2);
            
            if(choice==2){
                while(true){
                    boolean check=true;
                    System.out.print("Enter your name: ");
                    String str=scn.next();
                    System.out.print("Enter your email: ");
                    String email=scn.next();
                    cus=new Menu_customer(str,email);
                    for(int i=0;i<m_customer_list.size();i++){
                        if(m_customer_list.get(i).email.equals(email)){
                            System.out.println("\nEmail is already used by another user! Enter name and email again!\n");
                            check=false;
                        }
                    }
                    if(check){
                        break;
                    }
                }

                m_customer_list.add(cus);
            }
            else{
                while(true){
                    boolean check=false;
                    System.out.print("Enter your email: ");
                    String email=scn.next();

                    for(int i=0;i<m_customer_list.size();i++){
                        if(m_customer_list.get(i).email.equals(email)){
                            cus=m_customer_list.get(i);
                            m_customer_list.remove(i);
                            System.out.println("\nYou have signed in!\n");
                            check=true;
                            break;
                        }
                    }
                    if(check){
                        break;
                    }
                }
            }
            
            do{
                System.out.println("(Press 1) Display all vehicles");
                System.out.println("(Press 2) Display available vehicles");
                System.out.println("(Press 3) Display available vehicles by type");
                System.out.println("(Press 4) Book vehicle");
                System.out.println("(Press 5) Cancel my booking");
                System.out.println("(Press 6) rent a vehicle,");
                System.out.println("(Press 7) drop a vehicle.");
                System.out.println("(Press 8) Quit:stop running.");
                press=scn.nextInt();
                if(press==1){
                    cus.display_allVehicles(vp);
                }
                else if(press==2){
                    System.out.println("ENTER THE STARTING DATE (Y/M/D)");
                    int year=scn.nextInt();
                    int month=scn.nextInt();
                    int day=scn.nextInt();
                    Date dt=new Date(year,month,day);
                    System.out.println("ENTER THE ENDING DATE (Y/M/D)");
                    int year_end=scn.nextInt();
                    int month_end=scn.nextInt();
                    int day_end=scn.nextInt();
                    Date dt_end=new Date(year_end,month_end,day_end);
                    cus.display_availableVehicles(vp, dt, dt_end);
                }
                else if(press==3){
                    System.out.println("Which type of vehicle do you want?(Sports,StationWagon,SUV,SmallTrucks,TransportTrucks)");
                    String type=scn.next();
                    System.out.println("ENTER THE STARTING DATE (Y/M/D)");
                    int year=scn.nextInt();
                    int month=scn.nextInt();
                    int day=scn.nextInt();
                    Date dt=new Date(year,month,day);
                    System.out.println("ENTER THE ENDING DATE (Y/M/D)");
                    int year_end=scn.nextInt();
                    int month_end=scn.nextInt();
                    int day_end=scn.nextInt();
                    Date dt_end=new Date(year_end,month_end,day_end);
                    
                    
                    cus.type_vehicles(vp,type,dt, dt_end);

                }
                else if(press==4){
                    System.out.println("ENTER THE STARTING DATE (Y/M/D)");
                    int year=scn.nextInt();
                    int month=scn.nextInt();
                    int day=scn.nextInt();
                    Date dt=new Date(year,month,day);
                    System.out.println("ENTER THE ENDING DATE (Y/M/D)");
                    int year_end=scn.nextInt();
                    int month_end=scn.nextInt();
                    int day_end=scn.nextInt();
                    Date dt_end=new Date(year_end,month_end,day_end);
                    cus.book(vp,dt,dt_end);
                    
                }
                else if(press==5){
                    cus.cancelBook(vp);
                }
                else if(press==6){
                    cus.rent(vp);
                }
                else if(press==7){
                    cus.drop(vp);
                }
                else if(press==8){
                    m_customer_list.add(cus);
                    cus.stop_running(vp);
                    cus.write_customers_informations(m_customer_list);
                }
            }while(press!=8);
        }
    }
    
}
