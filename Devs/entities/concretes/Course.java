package Kodlama.io.Devs.entities.concretes;

public class Course {
	private int id;
	private String name;
	private String instructorName;
	private double price;
	
	
	public Course() {
		
	}
	
	public Course(int id, String name, double price, String instructorName) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.instructorName = instructorName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getInstructorName() {
		return instructorName;
	}


	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	
	
	
	
}
