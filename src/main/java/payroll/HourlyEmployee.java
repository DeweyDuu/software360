package payroll;

public class HourlyEmployee extends Employee {

	public HourlyEmployee(String name, double hourlyRate) {
		super(name, hourlyRate);
		
		// TODO Auto-generated constructor stub
	}
	public double getpaid() {
		if (workhours <= 40) {
            return workhours * hourlyrate;
        } else {
            double extrahours = workhours - 40;
            return (40 * hourlyrate) + (extrahours * hourlyrate * 1.5);
        }
	}

}
