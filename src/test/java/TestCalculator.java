import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    Calculator calculator;

    @Before
    public void Before(){
        calculator = new Calculator(2, 4);
    }


    @Test
    public void hasInteger1(){
        assertEquals( 2, calculator.getInteger1());

    }

    @Test
    public void hasInteger2() {
        assertEquals(4, calculator.getInteger2());
    }

    @Test
    public void AddTest() {
        assertEquals(6, calculator.add(2, 4));
    }

    @Test
    public void SubtractTest() {
        assertEquals(-2, calculator.subtract(2, 4));

    }

    @Test
    public void MultiplyTest() {
        assertEquals(8, calculator.multiply(2, 4));
    }

    @Test
    public void DivideTest() {
        assertEquals(0.5, calculator.divide(2, 4), 0.01);
    }
}
