import java.time.LocalDate;
import java.util.Date;

public class Promotion {
	private int id;
	private int promotionPrice;
	private Date promotionDate;
	
	//Constructor
	public Promotion(int id, int promotionPrice, Date promotionDate) {
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
	 
	public Date getPromotionDate() {
		return promotionDate;
	}

	//setter
	public void setPromotionDate(Date promotionDate) {
		this.promotionDate = promotionDate;
	}
	
	public void setPromotionPrice(int promotionPrice) {
		this.promotionPrice = promotionPrice;
	}
	
}
