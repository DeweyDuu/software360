package payroll;

public class Contractor extends Employee{

	public Contractor(String name, double hourlyRate) {
		super(name, hourlyRate);
		// TODO Auto-generated constructor stub
	}
	public double getpaid() {
		return hourlyrate*workhours;
	}

}
