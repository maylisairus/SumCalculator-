import org.example.SumCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumCalculatorTests {
    public static SumCalculator calculator;
    @BeforeEach
    public void configure (){
        calculator = new SumCalculator();
    }
    @Test
    public void testAdd1(){
        assertEquals(1, calculator.add(1));
    }
    @Test
    public void testAdd3(){
        assertEquals(6, calculator.add(3));
    }
    @Test
    public void  testAdd0(){
        Exception exception = assertThrows(IllegalArgumentException.class,()->{calculator.add(0);});
        assertEquals("n can not be zero", exception.getMessage());
    }
}
