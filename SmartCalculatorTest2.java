package Case_tools_assignments;

import static org.junit.Assert.*;
import org.junit.Test;

public class SmartCalculatorTest2 {

    @Test
    public void testCalculateSimpleInterest() {
        SmartCalculator calculator = new SmartCalculator();
        //calculator.setPrincipal(1000);
        //calculator.setRate(5);
        //calculator.setTime(2);
        assertEquals(100.0, calculator.calculateSimpleInterest(), 0.001);
    }

    @Test
    public void testCalculateCompoundInterest() {
        SmartCalculator calculator = new SmartCalculator();
        //calculator.setPrincipal(1500);
        //calculator.setRate(7.5);
        //calculator.setTime(3);
        assertEquals(372.181, calculator.calculateCompoundInterest(), 0.001);
    }

    @Test
    public void testCalculateMean() {
        SmartCalculator calculator = new SmartCalculator();
       // calculator.setNumbers(new double[] { 10, 20, 30, 40, 50 });
        assertEquals(30.0, calculator.calculateMean(), 0.001);
    }

    @Test
    public void testCalculateFactorial() {
        SmartCalculator calculator = new SmartCalculator();
        assertEquals(120.0, calculator.calculateFactorial(5), 0.001);
    }

    @Test
    public void testCalculatePercentage() {
        SmartCalculator calculator = new SmartCalculator();
        //calculator.setTotalMarks(500);
        //calculator.setMarksObtained(450);
        assertEquals(90.0, calculator.calculatePercentage(), 0.001);
    }
}

