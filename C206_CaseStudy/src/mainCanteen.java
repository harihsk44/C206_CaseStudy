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
	
		mainCanteen MC = new mainCanteen();
		MC.doShowMenu();
		
		int option = Helper.readInt("Enter your option > ");
		option = -1;
		
		while (option != 7) {
			if (option == 1) {
				MC.doViewStalls();
			} else if (option == 2) {
				MC.doViewFoodMenu();
			} else if (option == 3) {
				MC.doPlaceOrder();
			} else if (option == 4) {
				MC.doModifyOrders();
			} else if (option == 5) {
				MC.doMakePayment();
			} else {
				System.out.println("Thank you for using the Ordering App!");
			}
		}
	}
	
	private void doShowMenu() {
		System.out.println("Welcome to the Canteen");
		System.out.println("1. View Stalls");
		System.out.println("2. View Food Menu");
		System.out.println("3. Place Order");
		System.out.println("4. Modify Orders");
		System.out.println("5. Make Payment");
		System.out.println("6. Quit");
	}
	
	private void doViewStalls() {

	}
	
	private void doViewFoodMenu() {

	}
	
	private void doPlaceOrder() {
		
	}
	
	private void doModifyOrders() {
		System.out.println("1. View Orders");
		System.out.println("2. Add Orders");
		System.out.println("3. Remove Orders");
		
		int qns = Helper.readInt("What do you want to modify? > ");
		qns = -1;
		
		while (qns != 5) {
			if (qns == 1) {

			} else if (qns == 2) {
				
			} else if (qns == 3) {
				
			} else {
				System.out.println("Invalid choice, please choose again");
			}
		}
	}
	
	private void doMakePayment() {
		
	}
}
