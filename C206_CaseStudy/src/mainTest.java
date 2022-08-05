
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;

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
	
	//@Before
	public void setUp() throws Exception {
		// prepare test data
		s1 = new Stall(001, "Japanese Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Lee");
		s2 = new Stall(002, "Chinese Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Wee");
		s3 = new Stall(003, "Indian Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Kee");
		s4 = new Stall(004, "Malay Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Tee");
		s5 = new Stall(005, "Thai Food Stall", LocalDate.of(2020, Month.JANUARY, 8),  LocalTime.of(10,43,12), "Mr.Yee");
		
		f1 = new Food(001, "Salmon Sushi", 9, false, 6, LocalDate.of(2020, Month.JANUARY, 8));
		f2 = new Food(002, "Bak Kut Teh", 9, false, 6, LocalDate.of(2020, Month.JANUARY, 8));
		f3 = new Food(003, "Roti Plata", 9, false, 6, LocalDate.of(2020, Month.JANUARY, 8));
		f4 = new Food(004, "Nasi Lemak", 9, false, 6, LocalDate.of(2020, Month.JANUARY, 8));
		f5 = new Food(005, "Tomyam", 9, false, 6, LocalDate.of(2020, Month.JANUARY, 8));
		
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
		foodList = new ArrayList<Food>();
		orderList = new ArrayList<Order>();
		paymentList = new ArrayList<Payment>();
		promotionList = new ArrayList<Promotion>();
	}
	
	// =============================================================== ADMINISTRATOR TEST ============================================================
	
	// @Before
	// @Test
	// @After
	
	
	
	
	
	
	
	// =============================================================== OPERATOR TEST =================================================================
	
	// @Before
	// @Test
	// @After
	
	
	
	
	
	
	
	
	// =============================================================== CUSTOMER TEST =================================================================
	
	//@Test
	public void testViewAllStalls() {
		
	}
}