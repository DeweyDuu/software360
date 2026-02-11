package payroll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AssignPayTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
        AssignPay check = new AssignPay();

        Employee dew = new Contractor("Dew", 10.0);
        dew.setWorkHours(45.0);
        
        Employee omar = new HourlyEmployee("Omar", 10.0);
        omar.setWorkHours(45.0);

        Employee tong = new SalaryEmployee("Tong", 10.0);
        tong.setWorkHours(15.0);    

        check.addEmployee(dew);
        check.addEmployee(omar);
        check.addEmployee(tong);

        double[] results = check.finalpayrolls();
        assertEquals(450.0, results[0]);
        assertEquals(475.0, results[1]);
        assertEquals(400.0, results[2]);
    
	}

}
