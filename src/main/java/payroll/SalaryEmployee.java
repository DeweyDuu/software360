package payroll;

public class SalaryEmployee extends Employee {

	public SalaryEmployee(String name, double hourlyRate) {
		super(name, hourlyRate);
		// TODO Auto-generated constructor stub
	}
	public double getpaid() {
            return (40 * hourlyrate);
	}
}
