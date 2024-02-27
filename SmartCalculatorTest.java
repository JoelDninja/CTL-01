package Case_tools_assignments;

import junit.framework.TestCase;

public class SmartCalculatorTest extends TestCase {

	public void testCalculateSimpleInterest() {
		//fail("Not yet implemented");
		SmartCalculator calculator = new SmartCalculator();
        /*calculator.principal = 1000;
        calculator.rate = 5;
        calculator.time = 2;
        double ans = 100.0; // Calculation: (1000 * 5 * 2) / 100 = 100*/
		//double ans = calculator.principal * calculator.rate * calculator.time / 100;
        assertEquals(100, calculator.calculateSimpleInterest());
	}

	public void testCalculateCompoundInterest() {
		//fail("Not yet implemented");
		SmartCalculator calculator = new SmartCalculator();
        /*calculator.principal = 1000;
        calculator.rate = 5;
        calculator.time = 2;
        double expectedAns = 102.5; // Calculation: 1000 * (1 + 5/100)^2 - 1000 = 102.5*/
		//double expectedAns = calculator.principal * calculator.rate * calculator.time / 100;;
        assertEquals(102.5, calculator.getTime() - calculator.getPrincipal(), calculator.calculateCompoundInterest());
	}

	public void testCalculateMean() {
		//fail("Not yet implemented");
		SmartCalculator calculator = new SmartCalculator();
        /*calculator.numbers = new double[]{1, 2, 3, 4, 5};
        double ans = 3.0; // Mean: (1 + 2 + 3 + 4 + 5) / 5 = 3.0*/
        assertEquals(calculator.getNumbers().length, calculator.calculateMean());
	}

	public void testCalculateFactorial() {
		//fail("Not yet implemented");
		SmartCalculator calculator = new SmartCalculator();
        /*double number = 5;
        double ans = 120.0; // Factorial of 5 = 5 * 4 * 3 * 2 * 1 = 120*/
        assertEquals(calculator.calculateFactorial(calculator.number), calculator);
	}

	public void testCalculatePercentage() {
		//fail("Not yet implemented");
		SmartCalculator calculator = new SmartCalculator();
        /*calculator.totalMarks = 500;
        calculator.marksObtained = 400;
        double ans = 80.0; // Percentage: (400 / 500) * 100 = 80*/
        assertEquals((calculator.getMarksObtained() / calculator.getTotalMarks()) * 100, calculator.calculatePercentage());
	}

}
