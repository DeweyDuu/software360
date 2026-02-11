package payroll;

import java.util.ArrayList;
import java.util.List;

public class AssignPay {
	private List<Employee> employees;
	
	public AssignPay() {
		employees=new ArrayList<>();
		
		// TODO Auto-generated constructor stub
	}
	public void addEmployee(Employee e) {
		employees.add(e);
		
	}
	public double[] finalpayrolls() {
		double[] payrolls=new double[employees.size()];
		for(int i=0;i<employees.size();i++) {
			payrolls[i]=employees.get(i).getpaid();
			
		}
		return payrolls;
		
		
	}
}
