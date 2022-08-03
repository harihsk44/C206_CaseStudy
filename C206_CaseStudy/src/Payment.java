public class Payment {
	private int id;
	private String method; 
	private String foodpurchased;
	private int total;
	private String custName;
	
	public Payment(int id, String custName, String method, String foodpurchased, int total) {
		this.custName = custName;
		this.id = id;
		this.method = method;
		this.foodpurchased = foodpurchased;
		this.total = total;
	}
	
	public String getCustName() {
		return custName;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getFoodpurchased() {
		return foodpurchased;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public void setFoodpurchased(String foodpurchased) {
		this.foodpurchased = foodpurchased;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
