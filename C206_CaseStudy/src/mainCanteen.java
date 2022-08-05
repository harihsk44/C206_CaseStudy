import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;

public class mainCanteen { // for customer

	public static void main(String[] args) {
		
		ArrayList<Stall> stallList = new ArrayList<Stall>();
		ArrayList<Food> foodList = new ArrayList<Food>();
		ArrayList<Order> orderList = new ArrayList<Order>();
		ArrayList<Payment> paymentList = new ArrayList<Payment>();
	
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
		orderList.add(new Order(001, "Japanese Food Stall", "Salmon Sushi", 9, true));
		orderList.add(new Order(002, "Malay Food Stall", "Nasi Lemak", 9, true));
		orderList.add(new Order(003, "Indian Food Stall", "Roti Prata", 9, false));
		orderList.add(new Order(004, "Chinese Food Stall", "Tomyam", 9, false));
		
		paymentList.add(new Payment(001, "Mr. Lol", "cash", "Salmon Sushi", 9, LocalDate.of(2020, 1, 8)));
		paymentList.add(new Payment(002, "Mr. Li", "NETS", "Bak Kut Teh", 6, LocalDate.of(2020, 1, 8)));
		paymentList.add(new Payment(003, "Mr. Po", "PayWay", "Roti Plata", 9, LocalDate.of(2020, 1, 8)));
		paymentList.add(new Payment(004, "Mr. Op", "PayNow", "Tomyam", 6, LocalDate.of(2020, 1, 8)));
		paymentList.add(new Payment(005, "Mr. Liq", "PayNow", "Nasi Lemak", 9, LocalDate.of(2020, 1, 8)));
	
		mainCanteen MC = new mainCanteen();
		MC.doShowMenu();
		
		int option;
		option = Helper.readInt("Enter your option > ");
		
		while (option != 7) {
			if (option == 1) {
				MC.doViewStalls(stallList);
				option = Helper.readInt("Enter your option > ");
			} else if (option == 2) {
				MC.doViewFoodMenu(foodList);
				option = Helper.readInt("Enter your option > ");
			} else if (option == 3) {
				MC.doManageOrders(orderList);
			} else if (option == 4) {
				MC.doMakePayment(orderList, paymentList);
				option = Helper.readInt("Enter your option > ");
			} else if (option == 5) {
				System.out.println("Thank you for using the Ordering App!");
				option = Helper.readInt("Enter your option > ");
			} else {
				System.out.println("Invalid choice, please choose again");
			}
		}
	}
	
	public void doShowMenu() {
		System.out.println("Welcome to the Canteen");
		System.out.println("1. View Stalls");
		System.out.println("2. View Food Menu");
		System.out.println("3. Manage Orders");
		System.out.println("4. Make Payment");
		System.out.println("5. Quit");
	}
	
	public void doViewStalls(ArrayList<Stall> stallList) {
		System.out.println("AVAILABLE STALLS");
		String output = String.format("%-7s %-20s %-20s %-20s %-20s\n", "ID", "NAME", "OPERATING DATE", "OPERATING TIME", "OPERATING STALL");
		
		for (Stall s : stallList) {
			output += String.format("%-7s %-20s %-20s %-20s %-20s\n", s.getId(), s.getName(), s.getStartOperatingDate(), s.getOperatingTime(), s.getOperatorStall());
		}
		System.out.println(output);
	}
	
	public void doViewFoodMenu(ArrayList<Food> foodList) {
		System.out.println("FOOD MENU");
		String output = String.format("%-7s %-20s %-5s %-10s %-25s %-20s\n", "ID", "NAME", "PRICE", "PROMOTION", "PROMOTION PRICE", "PROMOTION DATE");
		
		for (Food f : foodList) {
			output += String.format("%-7s %-20s %-5s %-10s %-25s %-20s\n", f.getId(), f.getName(), f.getPrice(), f.isPromotion(), f.getPromotionPrice(), f.getPromotionDate());
		}
		System.out.println(output);
	}
	
	public void doManageOrders(ArrayList<Order> orderList) {
		System.out.println("ORDER MANAGEMENT");
		System.out.println("1. View Orders");
		System.out.println("2. Add Orders");
		System.out.println("3. Update Orders");
		System.out.println("4. Remove Orders");
		System.out.println("5. Place Order");
		int option = Helper.readInt("What do you want to do to your orders? > ");
		
		while (option != 5) {
			if (option == 1) {
				System.out.println("VIEW ORDER");
				String output = String.format("%-7s %-20s %-25s %-10s\n", "ID", "STALL", "FOOD", "PRICE");
				
				for (Order o : orderList) {
					output += String.format("%-7s %-20s %-25s %-10s\n", o.getId(), o.getStall(), o.getFood(), o.getPrice());
				}
				System.out.println(output);
				break;
			} else if (option == 2) {
		        System.out.println("ADD ORDER");
		        int id = Helper.readInt("Enter Order ID > ");
		        String name = Helper.readString("Enter Stall Name > ");
		        String food = Helper.readString("Enter Food Name > ");
		        int price = Helper.readInt("Enter Price > ");
		        boolean status = Helper.readBoolean("Pay already (T/F) > ");
		        
		        if (status == true) {
		        	System.out.println("Food added!");
		        	orderList.add(new Order(id, name, food, price, status));
		        } else {
		        	System.out.println("You need to pay first!");
		        }
		        break;
			} else if (option == 3) {
		        System.out.println("UPDATE ORDER");
		        // customer only allow to update order quantity (increase by one/decrease by one, if reaches over 5, not allowed)
		        int id = Helper.readInt("Enter Stall ID > ");
		        
		        boolean found = false;
		        
		        for (Order o : orderList) {
		          if(o.getId() == id) {
		            id = Helper.readInt("Enter new Order ID > ");
		            String sName = Helper.readString("Enter new Stall Name > ");
		            String fName = Helper.readString("Enter new Food Name > ");
		            int price = Helper.readInt("Enter new Price > ");
		            boolean status = Helper.readBoolean("Paid already? > ");
		            
		            o.setStall(sName);
		            o.setFood(fName);
		            o.setPrice(price);
		            o.setStatus(status);
		            found = true;
		            System.out.println("Order Updated");
		            break;
		          }
		        }
		        if (found == false) {
		          System.out.println("Invalid Order!");		          
		        }
		        break;
			} else if (option == 4) {
		        System.out.println("REMOVE ORDER");
		        int id = Helper.readInt("Enter Order ID > ");
		        
		        boolean found = false;
		        
		        for (Order o : orderList) {
		          if(o.getId() == id) {
		            orderList.remove(o);
		            found = true;
		            System.out.println("Order Removed");
		            break;
		          }
		        }
		        if (found == false) {
		          System.out.println("Invalid Order!");
		        }
		        break;
			} else if (option == 5) {
				System.out.println("PLACE ORDER");
				int id = Helper.readInt("Enter Food ID > ");
				
				for (Order o : orderList) {
					if (id == o.getId()) {
						o.setStatus(true);
					} else {
						o.setStatus(false);
						System.out.println("This ID is not available for ordering");
					}
				}
				break;
			} else {
				System.out.println("Invalid option!");
			}
		}
	}
	
	// need one more method to calculate total cost
	
	public void doMakePayment(ArrayList<Order> orderList, ArrayList<Payment> paymentList) {
		System.out.println("MAKE PAYMENT");
		
		String output = String.format("%-10s %-10s %-10s %-10s %-10s %-10s", 
				"ID", "CUSTOMER NAME", "PAYMENT METHOD", "FOOD PURCHASED", "TOTAL", "PAYMENT DATE");
		 //Payment(int id, String custName, String method, String foodpurchased, int total, LocalDate payDate)
		 
		int total = 0;
		int id = paymentList.size() + 1;
		String name = Helper.readString("Enter name > ");
		String method = Helper.readString("Enter payment method > ");
		String food = Helper.readString("Enter food purchased > ");
		
		for (Order o : orderList) {
			if(o.getStatus() == true) {
				total += o.getPrice();
			}
		}
		paymentList.add(new Payment(id, name, method, food, total, LocalDate.of(2020, 1, 8)));
		
		System.out.println("Total payment is $" + total);
		System.out.println("Payment Successful");
	}
}
