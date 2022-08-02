import java.sql.Time;
import java.util.Date;

public class Stall {
	
	private int id;
	private String name;
	private Date startOperatingDate;
	private Time operatingTime;
	private String Category;
	private String OperatorStall;
	
	public Stall(int id, String name, Date startOperatingDate, Time operatingTime, String category, String operatorStall) {
		super();
		this.id = id;
		this.name = name;
		this.startOperatingDate = startOperatingDate;
		this.operatingTime = operatingTime;
		Category = category;
		OperatorStall = operatorStall;
	}
	
	//getters

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getStartOperatingDate() {
		return startOperatingDate;
	}

	public Time getOperatingTime() {
		return operatingTime;
	}

	public String getCategory() {
		return Category;
	}

	public String getOperatorStall() {
		return OperatorStall;
	}
	
	//setters

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStartOperatingDate(Date startOperatingDate) {
		this.startOperatingDate = startOperatingDate;
	}

	public void setOperatingTime(Time operatingTime) {
		this.operatingTime = operatingTime;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public void setOperatorStall(String operatorStall) {
		OperatorStall = operatorStall;
	}
	
	
	
	
	
	
	

}
