/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelfollowers;

/**
 *
 * @author estudiantelis
 */
public class FoodBill {
    private String guestName;
    private double billNo;
    
    public FoodBill(String guestName,int billNo){
        this.guestName = guestName;
        this.billNo = billNo;
    }
    
    private String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public double getBillNo() {
        return billNo;
    }

    public void setBillNo(double billNo) {
        this.billNo = billNo;
    }
    
    public void generateFoodBill(){
        System.out.println("---------------------");
        System.out.println("Su factura de comida es: " + getBillNo() + " pesos");
    }
    
    
   
}