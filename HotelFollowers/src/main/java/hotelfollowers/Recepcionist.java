/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelfollowers;

/**
 *
 * @author estudiantelis
 */
public class Recepcionist {
    String name;
    int id;
    int phoneNo;
    String location;
    
    public void calculateFoodBill(FoodBill bill,int opcion){
        
        if (opcion==1) {
            FoodItems e1 = new FoodItems();
            e1.setPrice(50);
            bill.setBillNo(bill.getBillNo()+ e1.getPrice());
        }
        
        if (opcion==2) {
            FoodItems e2 = new FoodItems();
            e2.setPrice(100);
            bill.setBillNo(bill.getBillNo()+ e2.getPrice());
        }
        
        if (opcion==3) {
            FoodItems e3 = new FoodItems();
            e3.setPrice(200);
            
            bill.setBillNo(bill.getBillNo()+ e3.getPrice());
        }
       
    }
}