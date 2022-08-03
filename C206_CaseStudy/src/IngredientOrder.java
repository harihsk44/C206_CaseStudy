
public class IngredientOrder {
	
	private int id;
	private String name;
	private boolean orderStatus;
	private String order;
	
	//Constructor
	public IngredientOrder(int id, String name, boolean orderStatus, String order) {
		this.id = id;
		this.name = name;
		this.orderStatus = orderStatus;
		this.order = order;
	}
	
	//getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean isOrderStatus() {
		return orderStatus;
	}

	public String getOrder() {
		return order;
	}

	//setters
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOrderStatus(boolean orderStatus) {
		this.orderStatus = orderStatus;
	}

	public void setOrder(String order) {
		this.order = order;
	}
	
	

	
	
	
}