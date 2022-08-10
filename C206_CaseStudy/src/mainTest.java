
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * Team 1, 5 Aug 2022 11:42:40 am
 */

public class mainTest {
	private Stall s1;
	private Stall s2;
	private Stall s3;
	private Stall s4;
	private Stall s5;
	
	private Food f1;
	private Food f2;
	private Food f3;
	private Food f4;
	private Food f5;
	
	private Order o1;
	private Order o2;
	private Order o3;
	private Order o4;
	
	private Payment p1;
	private Payment p2;
	private Payment p3;
	private Payment p4;
	private Payment p5;
	
	private Promotion pr1;
	private Promotion pr2;
	private Promotion pr3;
	
	private ArrayList<Stall> stallList;
	private ArrayList<Food> foodList;
	private ArrayList<Order> orderList;
	private ArrayList<Payment> paymentList;
	private ArrayList<Promotion> promotionList;
	
	public mainTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		// prepare test data
		s1 = new Stall(001, "Japanese Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Lee");
		s2 = new Stall(002, "Chinese Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Wee");
		s3 = new Stall(003, "Indian Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Kee");
		s4 = new Stall(004, "Malay Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Tee");
		s5 = new Stall(005, "Thai Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Yee");
		
		f1 = new Food(001, "Salmon Sushi", 9, false, 6, LocalDate.of(2020, 1, 8));
		f2 = new Food(002, "Bak Kut Teh", 9, true, 6, LocalDate.of(2020, 1, 8));
		f3 = new Food(003, "Roti Plata", 9, false, 6, LocalDate.of(2020, 1, 8));
		f4 = new Food(004, "Nasi Lemak", 9, true, 6, LocalDate.of(2020, 1, 8));
		f5 = new Food(005, "Tomyam", 9, false, 6, LocalDate.of(2020, 1, 8));
		
		o1 = new Order(001, "Japanese Food Stall", "Salmon Sushi", 9, false);
		o2 = new Order(002, "Malay Food Stall", "Nasi Lemak", 9, false);
		o3 = new Order(003, "Indian Food Stall", "Roti Prata", 9, false);
		o4 = new Order(004, "Chinese Food Stall", "Tomyam", 9, false);
		
		p1 = new Payment(001, "Mr. Lol", "cash", "Salmon Sushi", 9, LocalDate.of(2020, 1, 8));
		p2 = new Payment(002, "Mr. Li", "NETS", "Bak Kut Teh", 6, LocalDate.of(2020, 1, 8));
		p3 = new Payment(003, "Mr. Po", "PayWay", "Roti Plata", 9, LocalDate.of(2020, 1, 8));
		p4 = new Payment(004, "Mr. Op", "PayNow", "Tomyam", 6, LocalDate.of(2020, 1, 8));
		p5 = new Payment(005, "Mr. Liq", "PayNow", "Nasi Lemak", 9, LocalDate.of(2020, 1, 8));
		
		
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
		
		pr1 = new Promotion(001, 6.00, promoDate3);
		pr2 = new Promotion(002, 6.00, promoDate1);
		pr3 = new Promotion(003, 6.00, promoDate2);
		
		stallList = new ArrayList<Stall>();
		orderList = new ArrayList<Order>();
		foodList = new ArrayList<Food>();
		paymentList = new ArrayList<Payment>();
		promotionList = new ArrayList<Promotion>();
	}
	
	// =============================================================== ADMINISTRATOR TEST ============================================================
	
	// @Before
	@Test
	public void testAddFoodItem() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Food arraylist to add to", foodList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		mainAdmin.AddFoodItem(foodList, f1);		
		assertEquals("Test if that Food arraylist size is 1?", 1, foodList.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that Food is added same as 1st item of the list?", f1, foodList.get(0));
		
		//Add another item. test The size of the list is 2?
		mainAdmin.AddFoodItem(foodList, f2);
		mainAdmin.AddFoodItem(foodList, f3);
		assertEquals("Test that Food arraylist size is 3?", 3, foodList.size());
		assertSame("Test that Food is added same as 3rd item of the list?", f3, foodList.get(2));
	}
	@Test
	public void testViewAllFoodList() {
		// Test if Food list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Food arraylist to add to", foodList);
		
		//test if the list of foods retrieved from the mainAdmin is empty
		String allFood= mainAdmin.retrieveAllFoodItem(foodList);
		String testOutput = "";
		assertEquals("Check that ViewAllFoodlist", testOutput, allFood);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		mainAdmin.AddFoodItem(foodList, f1);
		mainAdmin.AddFoodItem(foodList, f2);
		assertEquals("Test if that food arraylist size is 2?", 2, foodList.size());
		
		//test if the expected output string same as the list of foods retrieved from the mainAdmin
		allFood= mainAdmin.retrieveAllFoodItem(foodList);

		testOutput = String.format("%-10d %-30s %-10d %-10s %-20d %-20s\n",001, "Salmon Sushi", 9, false, 6, LocalDate.of(2020, 1, 8));
		testOutput += String.format("%-10d %-30s %-10d %-10s %-20d %-20s\n",002, "Bak Kut Teh", 9, true, 6, LocalDate.of(2020, 1, 8));
	
		assertEquals("Check that ViewAllFoodlist", testOutput, allFood);
		
	}

	@Test
	public void testDeleteFoodItem() {
		//boundary
		assertNotNull("test if there is valid Food arraylist to remove from", foodList);
		
		mainAdmin.AddFoodItem(foodList, f1);
		mainAdmin.AddFoodItem(foodList, f2);
		mainAdmin.AddFoodItem(foodList, f3);
		mainAdmin.AddFoodItem(foodList, f4);
		
		boolean deleteItem1 = mainAdmin.DeleteFoodItem(foodList, "Salmon Sushi");
		assertTrue("Test if Food ID 1 is deleted", deleteItem1);
		
		boolean deleteItem2 = mainAdmin.DeleteFoodItem(foodList, "Bak Kut Teh");
		assertTrue("Test if Food ID 2 is deleted", deleteItem2);
		
		boolean deleteItem3 = mainAdmin.DeleteFoodItem(foodList, "Roti Plata");
		assertTrue("Test if Food ID 3 is deleted", deleteItem3);
		
		boolean deleteItem4 = mainAdmin.DeleteFoodItem(foodList, "Nasi Lemak");
		assertTrue("Test if Food ID 4 is deleted", deleteItem4);
	}
	
	@Test
	public void testDoUpdateFoodList() {
		//boundary
		assertNotNull("Test if there is valid Food arraylist to add to", foodList);
		mainAdmin.AddFoodItem(foodList, f1);
		//error
		Boolean isUpdated = mainAdmin.doUpdateFoodItem(foodList, "Tuna Salad");
		assertFalse("Test if available Food Salmon Sushi is returned -false?", isUpdated);		
		//normal
		mainAdmin.AddFoodItem(foodList, f2);
		f2.setPromotion(false);
		isUpdated = mainAdmin.doUpdateFoodItem(foodList, "Bak Kut Teh");
		assertTrue("Test if Food Bak Kut Teh is returned- true", isUpdated);
		//error
		isUpdated = mainAdmin.doUpdateFoodItem(foodList, "Roti Plata");
		assertFalse("Test if non-existing Food Roti Plata is returned - false?", isUpdated);
		
	}
	
	@After
	public void tearDown() throws Exception {
		f1 = null;
		f2 = null;
		f3 = null;
		f4 = null;
		foodList = null;

	}

	
	
	
	
	
	
	
	
	// =============================================================== OPERATOR TEST =================================================================
	
	// @Test
	private mainOperator operator;
	private IngredientOrder order1;
	private IngredientOrder order2;
	private Promotion promotion1;
	private Promotion promotion2;
	
	@Before
	public void initOperator() throws ParseException {
		
		operator = new mainOperator();
		operator.listadd();
		order1 = new IngredientOrder(9, "Tea", true);
		order2 = new IngredientOrder(10, "Coffee", false);
		Date promoDate1=new SimpleDateFormat("dd/MM/yyyy").parse("08/12/2020");
		Date promoDate2=new SimpleDateFormat("dd/MM/yyyy").parse("08/12/2020");
		promotion1 = new Promotion(4, 6.00, promoDate1);
		promotion2 = new Promotion(5, 6.00, promoDate2);
		
	}
	
	@Test
	public void addIngredientNull() {
		
		assertFalse(operator.addIngredient(null));
		assertEquals(5, operator.getOrders().size());
		
	}
	
	@Test
	public void addIngredient_1() {

		assertEquals(5, operator.getOrders().size());
		assertTrue(operator.addIngredient(order1));
		assertEquals(6, operator.getOrders().size());
		
	}
	
	@Test
	public void addIngredient_2() {

		assertEquals(5, operator.getOrders().size());
		assertTrue(operator.addIngredient(order1));
		assertTrue(operator.addIngredient(order2));
		assertEquals(7, operator.getOrders().size());
		
	}

	@Test
	public void removeIngredientInvalid() {
		
		assertFalse(operator.removeIngredient(-1));
		assertFalse(operator.removeIngredient(0));
		
	}

	@Test
	public void removeIngredient_1() {
		
		assertTrue(operator.addIngredient(order1));
		
		assertTrue(operator.removeIngredient(1));
		assertFalse(operator.removeIngredient(1));
		
	}

	@Test
	public void removeIngredient_2() {
		
		assertTrue(operator.addIngredient(order1));
		assertTrue(operator.addIngredient(order2));
		
		assertTrue(operator.removeIngredient(1));
		assertFalse(operator.removeIngredient(1));
		
		assertTrue(operator.removeIngredient(2));
		assertFalse(operator.removeIngredient(1));
		assertFalse(operator.removeIngredient(2));
		
	}
	
	@Test
	public void viewIngredient_Default() {
		
		assertEquals("ID    Name       orderStatus\n"
				+ "1     Rice       false     \n"
				+ "2     Fish       false     \n"
				+ "3     Peanut     false     \n"
				+ "4     Flour      false     \n"
				+ "5     Prawn      false     \n", operator.viewAllIngredients());
		
	}
	
	@Test
	public void viewIngredient_1() {
		
		assertTrue(operator.addIngredient(order1));
		assertEquals("ID    Name       orderStatus\n"
				+ "1     Rice       false     \n"
				+ "2     Fish       false     \n"
				+ "3     Peanut     false     \n"
				+ "4     Flour      false     \n"
				+ "5     Prawn      false     \n"
				+ "9     Tea        true      \n", operator.viewAllIngredients());
		
	}
	
	@Test
	public void viewIngredient_2() {
		
		assertTrue(operator.addIngredient(order1));
		assertTrue(operator.addIngredient(order2));
		assertEquals("ID    Name       orderStatus\n"
				+ "1     Rice       false     \n"
				+ "2     Fish       false     \n"
				+ "3     Peanut     false     \n"
				+ "4     Flour      false     \n"
				+ "5     Prawn      false     \n"
				+ "9     Tea        true      \n"
				+ "10    Coffee     false     \n", operator.viewAllIngredients());
	
	}
	
	//Promotion
	@Test
	public void addPromotionNull() {
		
		assertFalse(operator.addPromotion(null));
		assertEquals(5, operator.getOrders().size());
		
	}
	
	@Test
	public void addPromotion_1() {

		assertEquals(3, operator.getPromotions().size());
		assertTrue(operator.addPromotion(promotion1));
		assertEquals(4, operator.getPromotions().size());
		
	}
	
	@Test
	public void addPromotion_2() {

		assertEquals(3, operator.getPromotions().size());
		assertTrue(operator.addPromotion(promotion1));
		assertTrue(operator.addPromotion(promotion2));
		assertEquals(5, operator.getPromotions().size());
		
	}
	
	@Test
	public void removePromotionInvalid() {
		
		assertFalse(operator.removePromotion(-1));
		assertFalse(operator.removePromotion(0));
		
	}

	@Test
	public void removePromotion_1() {
		
		assertTrue(operator.addPromotion(promotion1));
		assertTrue(operator.removePromotion(1));
		assertFalse(operator.removePromotion(1));
		
	}

	@Test
	public void removePromotion_2() {
		
		assertTrue(operator.addPromotion(promotion1));
		assertTrue(operator.addPromotion(promotion2));
		
		assertTrue(operator.removePromotion(1));
		assertFalse(operator.removePromotion(1));
		
		assertTrue(operator.removePromotion(2));
		assertFalse(operator.removePromotion(1));
		assertFalse(operator.removePromotion(2));
		
	}
	
	@Test
	public void viewPromotion_Default() {
		
		assertEquals("ID    promoPrice promoDate\n"
				+ "1     $6.00       Mon Jun 08 00:00:00 SGT 2020\n"
				+ "2     $6.00       Thu Oct 08 00:00:00 SGT 2020\n"
				+ "3     $6.00       Tue Dec 08 00:00:00 SGT 2020\n", operator.viewAllPromotions());
		
	}
	
	@Test
	public void viewPromotion_1() {
		
		assertTrue(operator.addPromotion(promotion1));
		assertEquals("ID    promoPrice promoDate\n"
				+ "1     $6.00       Mon Jun 08 00:00:00 SGT 2020\n"
				+ "2     $6.00       Thu Oct 08 00:00:00 SGT 2020\n"
				+ "3     $6.00       Tue Dec 08 00:00:00 SGT 2020\n"
				+ "4     $6.00       Tue Dec 08 00:00:00 SGT 2020\n", operator.viewAllPromotions());
		
	}
	
	@Test
	public void viewPromotion_2() {
		
		assertTrue(operator.addPromotion(promotion1));
		assertTrue(operator.addPromotion(promotion2));
		assertEquals("ID    promoPrice promoDate\n"
				+ "1     $6.00       Mon Jun 08 00:00:00 SGT 2020\n"
				+ "2     $6.00       Thu Oct 08 00:00:00 SGT 2020\n"
				+ "3     $6.00       Tue Dec 08 00:00:00 SGT 2020\n"
				+ "4     $6.00       Tue Dec 08 00:00:00 SGT 2020\n"
				+ "5     $6.00       Tue Dec 08 00:00:00 SGT 2020\n", operator.viewAllPromotions());
	
	}
	
	
	// @After
	public void destroyOperator() {
		operator = null;
	}
	
	
	
	
	
	
	
	// =============================================================== CUSTOMER TEST =================================================================
	
	@Test
	public void testViewAllStalls() {
		// Test if stallList is not null but empty
		assertNotNull("Test that Stall List are valid", stallList);
		
		// Test if stalls are retrieved from the stallList
		String allStalls = mainCanteen.retrieveAllStalls(stallList);
		String testOutput = "";
		assertEquals("Check ViewAllStalls", testOutput, allStalls);
		
		// Test if expected output display is the same as the displayed output
		allStalls = mainCanteen.retrieveAllStalls(stallList);
		
		testOutput = String.format("%-7s %-20s %-20s %-20s %-20s\n", 001, "Japanese Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Lee");
		testOutput += String.format("%-7s %-20s %-20s %-20s %-20s\n", 002, "Chinese Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Wee");
		
		assertEquals("Check ViewAllStalls", testOutput, allStalls);
	}
	
	public void testViewAllFoodMenu() {
		// Test if foodList is not null but empty
		assertNotNull("Test that Food List are valid", foodList);
		
		// Test if food menu are retrieved from the foodList
		String allFood = mainCanteen.retrieveAllFoodMenu(foodList);
		String testOutput = "";
		assertEquals("Check ViewAllFoodMenu", testOutput, allFood);
		
		// Test if expected output display is the same as the displayed output
		allFood = mainCanteen.retrieveAllFoodMenu(foodList);
		
		testOutput = String.format("%-7s %-20s %-5s %-10s %-25s %-20s\n", 001, "Salmon Sushi", 9, false, 6, LocalDate.of(2020, Month.JANUARY, 8));
		testOutput += String.format("%-7s %-20s %-5s %-10s %-25s %-20s\n", 002, "Bak Kut Teh", 9, false, 6, LocalDate.of(2020, Month.JANUARY, 8));
		
		assertEquals("Check ViewAllFoodMenu", testOutput, allFood);
	}
	
	public void testViewAllOrders() {
		// Test if orderList is not null but empty
		assertNotNull("Test that Order List are valid", orderList);
		
		// Test if orders are retrieved from the orderList
		String allOrders = mainCanteen.retrieveAllOrders(orderList);
		String testOutput = "";
		assertEquals("Check ViewAllOrders", testOutput, allOrders);
		
		// Test if expected output display is the same as the displayed output
		allOrders = mainCanteen.retrieveAllOrders(orderList);
		
		testOutput = String.format("%-7s %-20s %-25s %-10s\n", 001, "Japanese Food Stall", "Salmon Sushi", 9, true);
		testOutput += String.format("%-7s %-20s %-25s %-10s\n", 002, "Malay Food Stall", "Nasi Lemak", 9, true);
		
		assertEquals("Check ViewAllOrders", testOutput, allOrders);
	}
	
	public void testAddOrders() {
		// Test if order list is not null, so new items can be added
		assertNotNull("Test if there is valid orderList to add items", orderList);
		
		// Given an empty order list, when one item is added, the size of the list will be 1
		mainCanteen.retrieveAddOrders(orderList, o1, 001);
		assertEquals("Test if orderList size is now 1", 1, orderList.size());
		
		// Check if item is duplicated
		assertSame("Test that order added is duplicated", o1, orderList.get(0));
		
		// Test if another item is added, the size of the list will be 2
		mainCanteen.retrieveAddOrders(orderList, o2, 002);
		mainCanteen.retrieveAddOrders(orderList, o3, 003);
		assertEquals("Test if orderList size is now 3", 3, orderList.size());
		assertSame("Test that order added is the same as the 3rd item in the list", o3, orderList.get(2));
	}
	
	public void testRemoveOrders() {
		assertNotNull("Test if items are valid for removal", orderList);
		
		mainCanteen.retrieveAddOrders(orderList, o1, 001);
		mainCanteen.retrieveAddOrders(orderList, o2, 002);
		mainCanteen.retrieveAddOrders(orderList, o3, 003);
		mainCanteen.retrieveAddOrders(orderList, o4, 004);
		
		boolean removeItem001 = mainCanteen.checkRemovedOrders(orderList, 001);
		assertTrue("Check if order 001 is removed", removeItem001);
		
		boolean removeItem002 = mainCanteen.checkRemovedOrders(orderList, 002);
		assertTrue("Check if order 002 is removed", removeItem002);
		
		boolean removeItem003 = mainCanteen.checkRemovedOrders(orderList, 003);
		assertTrue("Check if order 003 is removed", removeItem003);
		
		boolean removeItem004 = mainCanteen.checkRemovedOrders(orderList, 004);
		assertTrue("Check if order 001 is removed", removeItem004);
	}
	
	public void testUpdateOrders() {
		assertNotNull("Test if orderList have only maximum of 5 items", orderList);
		mainCanteen.retrieveAddOrders(orderList, o1, 001);
		mainCanteen.retrieveAddOrders(orderList, o2, 002);
		mainCanteen.retrieveAddOrders(orderList, o3, 003);
		mainCanteen.retrieveAddOrders(orderList, o4, 004);
		
		boolean isUpdated = mainCanteen.checkUpdateOrders(orderList, 4);
		assertTrue("Check if order items is less than 5", isUpdated);
		assertFalse("Test if order quantity is updated", isUpdated);
		
	}

	
	@After
	public void tearDown1() throws Exception {
		o1 = null;
		o2 = null;
		o3 = null;
		o4 = null;
		orderList = null;
	}
}