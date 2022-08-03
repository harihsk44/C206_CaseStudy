import java.time.LocalDate;
import java.util.Date;

public class Promotion {
	private int id;
	private LocalDate promotionDate;
	
	//Constructor
	public Promotion(int id, LocalDate promotionDate) {
		super();
		this.id = id;
		this.promotionDate = promotionDate;
	}

	//getters
	public LocalDate getPromotionDate() {
		return promotionDate;
	}

	//setter
	public void setPromotionDate(LocalDate promotionDate) {
		this.promotionDate = promotionDate;
	}
	


}
