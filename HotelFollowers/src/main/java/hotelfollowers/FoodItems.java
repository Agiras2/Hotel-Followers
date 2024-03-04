/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelfollowers;

/**
 *
 * @author estudiantelis
 */
public class FoodItems {
    private String name;
    private int id;
    private int price;
    
    public FoodItems() {
    }

    public FoodItems(int price, String name, int id) {
        this.name = name;
        this.id = id;
        this.price = price;
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
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FoodItem{" + "Name=" + name + ", Id=" + id + ", Price=" + price + '}';
    }

   
    
}
