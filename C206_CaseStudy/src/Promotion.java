import java.time.LocalDate;

public class Promotion {
	private int id;
	private int promotionPrice;
	private LocalDate promotionDate;
	
	//Constructor
	public Promotion(int id, int promotionPrice, LocalDate promotionDate) {
		super();
		this.id = id;
		this.promotionPrice = promotionPrice;
		this.promotionDate = promotionDate;
	}

	//getters
	public int getId() {
	    return id;
	}
	
	 public int getPromotionPrice() {
		return promotionPrice;
	}
	 
	public LocalDate getPromotionDate() {
		return promotionDate;
	}

	//setter
	public void setPromotionDate(LocalDate promotionDate) {
		this.promotionDate = promotionDate;
	}
	
}
