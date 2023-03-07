package AUD_00;

import org.junit.jupiter.api.Assertions;
// import org.junit.jupiter.api.Test;
import org.junit.Test;

public class SecondExampleTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void division() {
        Assertions.assertEquals(5, calculator.division.apply(30,6));
    }
}
