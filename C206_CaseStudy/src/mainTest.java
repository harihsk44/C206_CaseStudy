
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
 * 21029424, 5 Aug 2022 11:42:40 am
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
	
	// @Before
	// @Test
	// @After
	
	
	
	
	
	
	
	
	// =============================================================== CUSTOMER TEST =================================================================
	
	//@Test
	public void testViewAllStalls() {
		
	}
}