import java.time.LocalDate;
import java.util.Date;

public class Promotion {
	private int id;
	private double promotionPrice;
	private Date promotionDate;
	 
	//Constructor
	public Promotion(int id, double promotionPrice, Date promotionDate) {
		super();
		this.id = id;
		this.promotionPrice = promotionPrice;
		this.promotionDate = promotionDate;
	}

	//getters
	public int getId() {
	    return id;
	}
	
	 public double getPromotionPrice() {
		return promotionPrice;
	}
	 
	public Date getPromotionDate() {
		return promotionDate;
	}

	//setter
	public void setPromotionDate(Date promotionDate) {
		this.promotionDate = promotionDate;
	}
	
	public void setPromotionPrice(double promotionPrice) {
		this.promotionPrice = promotionPrice;
	}
	
}
