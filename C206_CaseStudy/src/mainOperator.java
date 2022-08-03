

public class mainOperator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainOperator MO = new mainOperator();
		MO.menu();
		int mainchoice = Helper.readInt("Enter choice > ");
		while (mainchoice != 1 && mainchoice != 2 && mainchoice != 3 && mainchoice != 4) {
			System.out.println("Invalid Input!");
			mainchoice = Helper.readInt("Enter choice > ");
		}
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
	
	private void menu() {
		System.out.println("1. View Food Items");
		System.out.println("2. Manage Orders");
		System.out.println("3. Manage Request Orders of ingredients");
		System.out.println("4. Manage Promotion Offers of stalls\n");
	}
	
	//Food no submenu cos its just viewing
	
	private void ordersubmenu() {
		System.out.println("1. View all orders");
		System.out.println("2. Update order status\n");
	}
	
	private void ingredientsubmenu() {
		System.out.println("1. Add request order");
		System.out.println("2. View all request orders");
		System.out.println("3. Edit request order");
		System.out.println("4. Remove request order\n");
	}
	
	private void promotionsubmenu() {
		System.out.println("1. Add Promotion");
		System.out.println("2. View Promotions");
		System.out.println("3. Edit Promotion");
		System.out.println("3. Remove Promotion\n");
	}
	
	private void doviewfood() {
		//retrieving and printing food stuff from food arraylist
	}
	
	private void doOrder() {
		int orderchoice = Helper.readInt("Enter choice > ");
	}
	
	private void doingredient() {
		int ingredientchoice = Helper.readInt("Enter choice > ");
	}
	
	private void dopromotion() {
		int promotionchoice = Helper.readInt("Enter choice > ");
	}
	

}
