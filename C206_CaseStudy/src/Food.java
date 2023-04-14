import java.time.LocalDate;
import java.util.Date;

public class Food {
	
	private int id;
	private String name;
	private int price;
	private boolean isPromotion;
	private int promotionPrice;
	private LocalDate promotionDate;
	 
	//Constructor
	public Food(int id, String name, int price, boolean isPromotion, int promotionPrice, LocalDate promotionDate) {
		//super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.isPromotion = isPromotion;
		this.promotionPrice = promotionPrice;
		this.promotionDate = promotionDate;
	}
	//getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public boolean isPromotion() {
		return isPromotion;
	}

	public int getPromotionPrice() {
		return promotionPrice;
	}

	public LocalDate getPromotionDate() {
		return promotionDate;
	}
	
	//getters
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPromotion(boolean isPromotion) {
		this.isPromotion = isPromotion;
	}
	public void setPromotionPrice(int promotionPrice) {
		this.promotionPrice = promotionPrice;
	}
	public void setPromotionDate(LocalDate promotionDate) {
		this.promotionDate = promotionDate;
	}
	
	

	
	
	
}
