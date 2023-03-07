package AUD_00;

import org.junit.jupiter.api.Assertions;
// import org.junit.jupiter.api.Test;
import org.junit.Test;


public class ExampleTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void addition() {
        Assertions.assertEquals(2, calculator.addition.apply(1,1));
    }

    @Test
    public void subtraction() {
        Assertions.assertNotEquals(1, calculator.subtraction.apply(2,2));
    }
}

