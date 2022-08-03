import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;

public class mainAdmin {
	
	public static void main(String[] args) {
		ArrayList<Stall> stallList = new ArrayList<Stall>();
		ArrayList<IngredientOrder> ingredientList = new ArrayList<IngredientOrder>();
		ArrayList<Food> foodList = new ArrayList<Food>();
		
		//	Stall	 (int id, String name, LocalDate startOperatingDate, LocalTime operatingTime, String operatorStall)
		stallList.add(new Stall(001, "Japanese Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Lee"));
		stallList.add(new Stall(002, "Chinese Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Wee"));
		stallList.add(new Stall(003, "Indian Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Kee"));
		stallList.add(new Stall(004, "Malay Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Tee"));
		stallList.add(new Stall(005, "Thai Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Yee"));
		
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
		
		mainAdmin ma = new mainAdmin();
		ma.doManageStall(stallList);
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
	
	private void doManageStall(ArrayList<Stall> stallList) {
		displayEditStallMenu();
//		Stall	 (int id, String name, LocalDate startOperatingDate, LocalTime operatingTime, String operatorStall)
		
		int option = 0;
		
		while (option != 5) {
			if (option == 1) {
				String output = String.format("%-5s %-20s %-25s %-15s %-20s\n", "ID", "NAME", "START OPERATION DATE", "OPERATING TIME", "STALL OPERATOR");
				
				for (Stall s : stallList) {
					output += String.format("%-5s %-20s %-25s %-15s %-20s\n", s.getId(), s.getName(), s.getStartOperatingDate(), s.getOperatingTime(), s.getOperatorStall());
				}
				System.out.println(output);
			}
			else if(option == 2) {
				System.out.println("**ADD STALL**");
				int id = Helper.readInt("Enter Stall ID > ");
				String name = Helper.readString("Enter Stall Name > ");
				LocalDate startOperatingDate = LocalDate.of(2020, Month.JANUARY, 8);
				LocalTime operatingTime = LocalTime.of(10,43,12);
				String operatorStall = Helper.readString("Enter Stall Operator > ");
				
				stallList.add(new Stall(id, name, startOperatingDate, operatingTime, operatorStall));
			}
			else if(option == 3) {
				System.out.println("**REMOVE STALL**");
				int id = Helper.readInt("Enter Stall ID > ");
				
				boolean found = false;
				
				for (Stall s : stallList) {
					if(s.getId() == id) {
						stallList.remove(s);
						found = true;
						System.out.println("Stall Removed");
					}
				}
				if (found == false) {
					System.out.println("Stall Not Found");
				}
			}
			else if(option == 4) {
				System.out.println("**UPDATE STALL**");
				int id = Helper.readInt("Enter Stall ID > ");
				
				boolean found = false;
				
				for (Stall s : stallList) {
					if(s.getId() == id) {
						id = Helper.readInt("Enter Stall ID > ");
						String name = Helper.readString("Enter Stall Name > ");
						String operatorStall = Helper.readString("Enter Stall Operator > ");
						
						s.setName(name);
						s.setOperatorStall(operatorStall);
						found = true;
						System.out.println("Stall Updated");
					}
				}
				if (found == false) {
					System.out.println("Stall Not Found");
				}
			}
		}
	}
	
	private void doManageFoodItem() {
//		Food	 (int id, String name, int price, boolean isPromotion, int promotionPrice, Date promotionDate) 
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
