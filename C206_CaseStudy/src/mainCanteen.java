import java.util.ArrayList;

public class mainCanteen { // for customer

	private ArrayList<Stall> stallList = new ArrayList<Stall>();
	private ArrayList<Food> foodList = new ArrayList<Food>();
	private ArrayList<Order> orderList = new ArrayList<Order>();
	
	public static void main(String[] args) {
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
		for (Stall s : stallList) {
			System.out.println(s);
		}
	}
	
	private void doViewFoodMenu() {
		for (Food f : foodList) {
			System.out.println(f);
		}
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
				for (Order o : orderList) {
					System.out.println(o);
				}
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
