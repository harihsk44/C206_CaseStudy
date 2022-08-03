import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;

public class mainAdmin {
	public ArrayList<Food> foodList = new ArrayList<Food>();
	public static void main(String[] args) {
		//Daren do this :)
		ArrayList<Stall> stallList = new ArrayList<Stall>();
		ArrayList<IngredientOrder> ingredientList = new ArrayList<IngredientOrder>();
		ArrayList<Food> foodList = new ArrayList<Food>();
		
		//	Stall	 (int id, String name, LocalDate startOperatingDate, LocalTime operatingTime, String operatorStall)
		stallList.add(new Stall(001, "Japanese Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Lee"));
		stallList.add(new Stall(002, "Chinese Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Wee"));
		stallList.add(new Stall(003, "Indian Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Kee"));
		stallList.add(new Stall(003, "Malay Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Tee"));
		stallList.add(new Stall(003, "Thai Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Yee"));
		
		//	Food	 (int id, String name, int price, boolean isPromotion, int promotionPrice, Date promotionDate) 
		foodList.add(new Food(001, "Salmon Sushi", 9, false, 6, LocalDate.of(2020, Month.JANUARY, 8)));
		foodList.add(new Food(002, "Bak Kut Teh", 9, false, 6, LocalDate.of(2020, Month.JANUARY, 8)));
		foodList.add(new Food(003, "Roti Plata", 9, false, 6, LocalDate.of(2020, Month.JANUARY, 8)));
		foodList.add(new Food(004, "Nasi Lemak", 9, false, 6, LocalDate.of(2020, Month.JANUARY, 8)));
		foodList.add(new Food(005, "Tomyam", 9, false, 6, LocalDate.of(2020, Month.JANUARY, 8)));
		
		//	IngredientOrder(int id, String ingredientName, boolean orderStatus)
		ingredientList.add(new IngredientOrder(001, "Rice", false));
		ingredientList.add(new IngredientOrder(002, "Fish", false));
		ingredientList.add(new IngredientOrder(003, "Peanut", false));
		ingredientList.add(new IngredientOrder(004, "Flour", false));
		ingredientList.add(new IngredientOrder(005, "Prawn", false));
	}
	
	private void displayMenu() {
		System.out.println("Manage Stall"); //Daren do this
		System.out.println("Manage Food Item");
		System.out.println("View Promotion Offer");
		System.out.println("View Ingredient Request Order"); //Daren do this
		System.out.println("Purchase Ingredient Online");
		System.out.println("Generate Sales Report"); //Daren do this
	}
	
	private void displayEditStallMenu() {
		System.out.println("View Stall");
		System.out.println("Add Stall");
		System.out.println("Remove Stall");
		System.out.println("Change Stall");
	}
	
	private void displayEditFoodItemMenu() {
		System.out.println("View FoodItem");
		System.out.println("Add FoodItem");
		System.out.println("Remove FoodItem");
		System.out.println("Change FoodItem");
	}
	
	private void doManageStall() {
		displayEditStallMenu();
		(int id, String name, LocalDate startOperatingDate, LocalTime operatingTime, String operatorStall)
		String output = String.format(null, "ID", "NAME", "START OPERATION DATE", "");
	}
	
	private void doEditFoodItem() {
		
	}
	
	private void doViewPromotionOffer(String ID) {
		//view promotion offers
		String output = "";
		
		//output += String.format("%s %s", foodid,foodname,blah blah blah)
		System.out.println(output);
	}
	
	private void doViewIngredientRequestOrder() {
		
	}
	
	private void doPurchaseIngredientOnline() {
		
	}
	
	private void doGenerateSalesReport() {
		
	}
}
