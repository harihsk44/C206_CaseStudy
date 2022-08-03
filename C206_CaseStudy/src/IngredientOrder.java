
public class IngredientOrder {
	private int id;
	private String ingredientName;
	private boolean orderStatus;
	
	//Constructor
	public IngredientOrder(int id, String ingredientName, boolean orderStatus) {
		this.id = id;
		this.ingredientName = ingredientName;
		this.orderStatus = orderStatus; 
	}
	
	//getters
	public int getId() {
		return id;
	}

	public String getIngredientName() {
		return ingredientName;
	}

	public boolean isOrderStatus() {
		return orderStatus;
	}


	//setters
	public void setId(int id) {
		this.id = id;
	}

	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}

	public void setOrderStatus(boolean orderStatus) {
		this.orderStatus = orderStatus;
	}		
}