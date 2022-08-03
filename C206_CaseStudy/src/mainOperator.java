import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;

public class mainOperator {
	
	private ArrayList<Food> foodList = new ArrayList<Food>();
	private ArrayList<Order> orderlist = new ArrayList<Order>();
	private ArrayList<IngredientOrder> ingredientList= new ArrayList<IngredientOrder>();
	private ArrayList<Promotion> promotionlist = new ArrayList<Promotion>();
	private ArrayList<Stall> stallList = new ArrayList<Stall>();
	//empty ArrayLists though
	
	public void listadd() {
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
		
//		Stall	 (int id, String name, LocalDate startOperatingDate, LocalTime operatingTime, String operatorStall)
		stallList.add(new Stall(001, "Japanese Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Lee"));
		stallList.add(new Stall(002, "Chinese Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Wee"));
		stallList.add(new Stall(003, "Indian Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Kee"));
		stallList.add(new Stall(003, "Malay Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Tee"));
		stallList.add(new Stall(003, "Thai Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Yee"));
		
		//public Order(int id, String stall, String food, int price) {
		orderlist.add(new Order(001, "Japanese Food Stall", "Salmon Sushi", 9, false));
		orderlist.add(new Order(002, "Malay Food Stall", "Nasi Lemak", 9, false));
		orderlist.add(new Order(003, "Indian Food Stall", "Roti Prata", 9, false));
		orderlist.add(new Order(004, "Chinese Food Stall", "Tomyam", 9, false));
		
		Date promoDate1 = null; 
		Date promoDate2 = null;
		Date promoDate3 = null;
		//just initialising as null
		try {
			promoDate3 = new SimpleDateFormat("dd/MM/yyyy").parse("8/6/2020");
			promoDate1=new SimpleDateFormat("dd/MM/yyyy").parse("8/10/2020");
			promoDate2=new SimpleDateFormat("dd/MM/yyyy").parse("8/12/2020");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		promotionlist.add(new Promotion(002, 6, promoDate1));
		promotionlist.add(new Promotion(003, 6, promoDate2));
		promotionlist.add(new Promotion(001, 6, promoDate3));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainOperator MO = new mainOperator();
		MO.listadd();
		MO.menu();
		int mainchoice = Helper.readInt("Enter choice > ");
		while (mainchoice != 1 && mainchoice != 2 && mainchoice != 3 && mainchoice != 4 && mainchoice != 5) {
			System.out.println("Invalid Input!");
			mainchoice = Helper.readInt("Enter choice > ");
		}
		
		while (mainchoice != 5) {
			if (mainchoice == 1) {
				MO.doviewfood();
				
			}else if (mainchoice == 2) {
				MO.ordersubmenu();
				MO.doOrder();
				
			}else if (mainchoice == 3) {
				MO.ingredientsubmenu();
				MO.doingredient();
				
			}else if (mainchoice == 4) {
				MO.promotionsubmenu();
				MO.dopromotion();
			}
		}
	}
	
	private void menu() {
		System.out.println("1. View Food Items");
		System.out.println("2. Manage Orders");
		System.out.println("3. Manage Request Orders of ingredients");
		System.out.println("4. Manage Promotion Offers of stalls\n");
	}
	
	//Food no submenu cos its just viewing
	
	private void ordersubmenu() {
		System.out.println("1. View all orders");
		System.out.println("2. Update order status");
		System.out.println("3. Exit to main menu\n");
	}
	
	private void ingredientsubmenu() {
		System.out.println("1. Add request order");
		System.out.println("2. View all request orders");
		System.out.println("3. Edit request order");
		System.out.println("4. Remove request order");
		System.out.println("5. Exit to main menu\n");
	}
	
	private void promotionsubmenu() {
		System.out.println("1. Add Promotion");
		System.out.println("2. View Promotions");
		System.out.println("3. Edit Promotion");
		System.out.println("3. Remove Promotion");
		System.out.println("4. Exit to main menu\n");
	}
	
	private void doviewfood() {
		//retrieving and printing food stuff from food arraylist
		
		for (Food f : foodList) {
			
		}
	}
	
	private void doOrder() {
		int orderchoice = Helper.readInt("Enter choice > ");
		
		
	}
	

	//int id, String ingredientName, boolean orderStatus
	private void doingredient() {
		int ingredientchoice = Helper.readInt("Enter choice > ");
		while (ingredientchoice != 5) {
			if (ingredientchoice == 1) {
				int ingredientID = Helper.readInt("Enter ingredientorderID > ");
				String ingredientName = Helper.readString("Enter ingredientName > ");
				boolean orderStatus = Helper.readBoolean("Enter orderstatus (true/false) > ");
				ingredientList.add(new IngredientOrder(ingredientID, ingredientName, orderStatus));
				System.out.println("Ingredient request order added!");
				ingredientsubmenu();
				ingredientchoice = Helper.readInt("Enter choice > ");
				
			}else if (ingredientchoice == 2) {
				String output = String.format("%-5s %-10s %-10s\n", "ID", "Name", "orderStatus");
				for (IngredientOrder io : ingredientList) {
					output += String.format("%-5d %-10s %-10b\n", io.getId(), io.getIngredientName(), io.isOrderStatus());
				}
				System.out.println(output);
				ingredientsubmenu();
				ingredientchoice = Helper.readInt("Enter choice > ");
				
			}else if (ingredientchoice == 3) {
				int ingredientID = Helper.readInt("Enter ingredientorderID > ");
				boolean orderStatus = Helper.readBoolean("Enter orderstatus (true/false) > ");
				boolean found = false;
				for (IngredientOrder io : ingredientList) {
					if(io.getId() == ingredientID) {
						io.setOrderStatus(orderStatus);
						found = true;
					}
				}
				if (found) {
					System.out.println("Ingredient order status updated!");
				}else {
					System.out.println("Order ID did not match records");
				}
				ingredientsubmenu();
				ingredientchoice = Helper.readInt("Enter choice > ");
				
			}else if (ingredientchoice == 4) {
				int ingredientID = Helper.readInt("Enter ingredientorderID > ");
				int i = 0;
				boolean removed = false;
				while(i < ingredientList.size()) {
					if(ingredientList.get(i).getId() == ingredientID) {
						ingredientList.remove(i);
						removed = true;
					}
				}
				if (removed) {
					System.out.println("IngredientOrder removed");
				}else {
					System.out.println("IngredientOrder not found");
				}
				ingredientsubmenu();
				ingredientchoice = Helper.readInt("Enter choice > ");
			}
		}
	}
	
	//Promotion(int id, int promotionPrice, LocalDate promotionDate)
	private void dopromotion() throws ParseException {
		int promotionchoice = Helper.readInt("Enter choice > ");
		while (promotionchoice != 4) {
			if (promotionchoice == 1) {
				
				try {
					int promotionid = Helper.readInt("Enter promotionid > ");
					int promotionprice = Helper.readInt("Enter promotionprice >");
					String promotiondate = Helper.readString("Enter promotionDate (dd/MM/yyyy:) > ");
					Date promoDate=new SimpleDateFormat("dd/MM/yyyy").parse(promotiondate);
					promotionlist.add(new Promotion(promotionid, promotionprice, promoDate));
					System.out.println("Promotion added!");
					
				}catch (Exception e) {
					System.out.println(e);
				}
				
				
				
				
			}else if (promotionchoice == 2) {
				String output = String.format("%-5s %-10s %-10s\n", "ID", "promoPrice", "promoDate");
				for (Promotion p : promotionlist) {
					Date promodate = p.getPromotionDate();
					String promodatestr = promodate.toString();
					//SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
					//String promodatestr = format1.format(promodate);
					output += String.format("%-5d %-10d %-10s\n", p.getId(), p.getPromotionPrice(), promodatestr);
				}
				System.out.println(output);
				promotionsubmenu();
				
				
			}else if (promotionchoice == 3) {
				try {
					int promotionid = Helper.readInt("Enter promotionid > ");
					int promotionprice = Helper.readInt("Enter promotionprice >");
					String promotiondate = Helper.readString("Enter promotionDate (dd/MM/yyyy:) > ");
					Date promoDate=new SimpleDateFormat("dd/MM/yyyy").parse(promotiondate);
					boolean found = false;
					for (Promotion p : promotionlist) {
						if (promotionid == p.getId()) {
							p.setPromotionPrice(promotionprice);
							p.setPromotionDate(promoDate);
							found = true;
						}
					}
					if (found) {
						System.out.println("Promotion updated!");
					}else {
						System.out.println("Promotionid not found");
					}
					
					
				}catch (Exception e) {
					System.out.println(e);
				}
				
				
			}
		}
	}
	
}

