import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Stall {
	
	private int id;
	private String name;
	private LocalDate startOperatingDate;
	private LocalTime operatingTime;
	private String OperatorStall;
	
	//Constructor
	public Stall(int id, String name, LocalDate startOperatingDate, LocalTime operatingTime, String operatorStall) {
		super();
		this.id = id;
		this.name = name;
		this.startOperatingDate = startOperatingDate;
		this.operatingTime = operatingTime;
		OperatorStall = operatorStall;
	}
	
	//getters

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getStartOperatingDate() {
		return startOperatingDate;
	}

	public LocalTime getOperatingTime() {
		return operatingTime;
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

	public void setStartOperatingDate(LocalDate startOperatingDate) {
		this.startOperatingDate = startOperatingDate;
	}

	public void setOperatingTime(LocalTime operatingTime) {
		this.operatingTime = operatingTime;
	}

	public void setOperatorStall(String operatorStall) {
		OperatorStall = operatorStall;
	}
	
	
	
	
	
	
	

}
