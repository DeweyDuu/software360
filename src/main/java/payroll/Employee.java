package payroll;

public abstract class Employee {
	String name;
	Double hourlyrate;
	Double workhours;

	public Employee(String name,Double hourlyrate) {
		
		this.name=name;
		this.hourlyrate=hourlyrate;
		
	}
	public void setWorkHours(Double hours) {
		this.workhours=hours;
		
	}
	public abstract double getpaid();
}
