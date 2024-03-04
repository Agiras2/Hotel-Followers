/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelfollowers;
import java.util.Scanner;

/**
 *
 * @author estudiantelis
 */

public class Guest {
    private String name;
    private int id;
    private int phoneNo;
    private String adress;
    private int roomNo;
    private double bill;

    public Guest() {
    }
   
    
    public Guest(String name, int id, int phoneNo, String adress, int roomNo, double bill) {
        this.name = name;
        this.id = id;
        this.phoneNo = phoneNo;
        this.adress = adress;
        this.roomNo = roomNo;
        this.bill = bill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }
    
    public void orderFood(Chef chef, FoodBill bill,Recepcionist recepcionist){
        double sobreCargo;
        if (chef.getLocation().equalsIgnoreCase("Frances")){
            sobreCargo = 0.15;
            System.out.println("Entre al sobrecargo");
            System.out.println("el sobrecargo es de: " + sobreCargo);
        }else{
            sobreCargo = 0;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("Hola " + name + " Seleccione la comida que quiere llevar: ");
        System.out.println("Opcion0. Facturar comida");
        System.out.println("Opcion1. Desayuno - 10000");
        System.out.println("Opcion2.Almuerzo - 20000");
        System.out.println("Opcion3.Comida - 15000");
        System.out.println("---------------------------");
        int opcion = 1;
        recepcionist.calculateFoodBill(bill,opcion);
            
        while(opcion != 0 ){
            opcion = scanner.nextInt();
            if (opcion == 1){
            recepcionist.calculateFoodBill(bill, opcion);
            }
        
            if (opcion == 2){
            recepcionist.calculateFoodBill(bill, opcion);
            }
        
            if (opcion == 3){
            recepcionist.calculateFoodBill(bill, opcion);
            }
            System.out.println("La cuenta parcial es " + bill.getBillNo());
        }
        
       bill.setBillNo(bill.getBillNo()+bill.getBillNo()*sobreCargo);
        
    }

    @Override
    public String toString() {
        return "Guest{" + "Name=" + name + ", Id=" + id+ ", PhoneNo=" + phoneNo + ", Adress=" + adress + ", RoomNo=" + roomNo +'}';
    
    
    }
}

  
