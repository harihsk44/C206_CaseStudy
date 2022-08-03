import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;

public class mainCanteen { // for customer

	public static void main(String[] args) {
		
		ArrayList<Stall> stallList = new ArrayList<Stall>();
		ArrayList<Food> foodList = new ArrayList<Food>();
		ArrayList<Order> orderList = new ArrayList<Order>();
	
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
		
		//public Order(int id, String stall, String food, int price) {
		orderList.add(new Order(001, "Japanese Food Stall", "Salmon Sushi", 9, false));
		orderList.add(new Order(002, "Malay Food Stall", "Nasi Lemak", 9, false));
		orderList.add(new Order(003, "Indian Food Stall", "Roti Prata", 9, false));
		orderList.add(new Order(004, "Chinese Food Stall", "Tomyam", 9, false));
	
		mainCanteen MC = new mainCanteen();
		MC.doShowMenu();
		
		int option;
		option = Helper.readInt("Enter your option > ");
		
		while (option != 7) {
			if (option == 1) {
				MC.doViewStalls(stallList);
				break;
			} else if (option == 2) {
				MC.doViewFoodMenu(foodList);
				break;
			} else if (option == 3) {
				MC.doAddOrder();
				break;
			} else if (option == 4) {
				MC.doModifyOrders();
				break;
			} else if (option == 5) {
				MC.doRemoveOrder();
				break;
			} else if (option == 6) {
				MC.doMakePayment();
				break;
			} else if (option == 7){
				System.out.println("Thank you for using the Ordering App!");
				break;
			} else {
				System.out.println("Invalid choice, please choose again");
			}
		}
	}
	
	public void doShowMenu() {
		System.out.println("Welcome to the Canteen");
		System.out.println("1. View Stalls");
		System.out.println("2. View Food Menu");
		System.out.println("3. Add Orders");
		System.out.println("4. Modify Orders");
		System.out.println("5. Remove Orders");
		System.out.println("6. Make Payment");
		System.out.println("7. Quit");
	}
	
	public void doViewStalls(ArrayList<Stall> stallList) {
		String output = String.format("%-7s %-20s %-20s %-20s %-20s\n", "ID", "NAME", "OPERATING DATE", "OPERATING TIME", "OPERATING STALL");
		
		for (Stall s : stallList) {
			output += String.format("%-7s %-20s %-20s %-20s %-20s\n", s.getId(), s.getName(), s.getStartOperatingDate(), s.getOperatingTime(), s.getOperatorStall());
		}
		System.out.println(output);
	}
	
	public void doViewFoodMenu(ArrayList<Food> foodList) {
		String output = String.format("%-7s %-20s %-5s %-10s %-5s %-20s", "ID", "NAME", "PRICE", "PROMOTION", "PROMOTION PRICE", "PROMOTION DATE");
		
		for (Food f : foodList) {
			output += String.format("%-7s %-20s %-5s %-10s %-5s %-20s", f.getId(), f.getName(), f.getPrice(), f.isPromotion(), f.getPromotionPrice(), f.getPromotionDate());
		}
		System.out.println(output);
	}
	
	public void doAddOrder() {
		
	}
	
	public void doModifyOrders() {

	}
	
	public void doRemoveOrder() {
		
	}
	
	public void doMakePayment() {
		
	}
}
