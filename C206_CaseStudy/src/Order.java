
public class Order {
	
	private int id;
	private String stall;
	private String food;
	private int price;
	private boolean placeStatus;
	
	
	//Constructor
	public Order(int id,  String stall, String food, int price, boolean placeStatus) {
		super();
		this.id = id;
		this.stall = stall;
		this.food = food;
		this.price = price;
		this.placeStatus = placeStatus;
	}
	
	//getters
	public int getId() {
		return id;
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
	
	public boolean getStatus() {
		return placeStatus;
	}
	
	//setters
	public void setId(int id) {
		this.id = id;
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
	
	public void setStatus(boolean status) {
		this.placeStatus = status;
	}
	
	
	
	

}
