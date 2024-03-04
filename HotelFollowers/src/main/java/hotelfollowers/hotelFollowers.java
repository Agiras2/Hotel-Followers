package hotelfollowers;

/**
 *
 * @author estudiantelis
 */
public class hotelFollowers {
    public static void main(String[] args) {
            System.out.println("Facturación por alimentos 1 de Marzo 2024, Hotel Followers");
            Guest e1= new Guest();
            Chef e2= new Chef("Frances");
            FoodItems e3= new FoodItems();
            FoodBill e4 = new FoodBill("carlos",0) ;
            Recepcionist e5 = new Recepcionist();
            e1.orderFood(e2,e4,e5);
            e4.generateFoodBill();
    }
}