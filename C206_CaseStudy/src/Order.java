
public class Order {
	
	private int id;
	private String name;
	private String stall;
	private String food;
	private int price;
	
	//Constructor
	public Order(int id, String name, String stall, String food, int price) {
		super();
		this.id = id;
		this.name = name;
		this.stall = stall;
		this.food = food;
		this.price = price;
	}
	
	//getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getStall() {
		return stall;
	}

	public String getFood() {
		return food;
	}

	public int getPrice() {
		return price;
	}
	
	//setters
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStall(String stall) {
		this.stall = stall;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

}