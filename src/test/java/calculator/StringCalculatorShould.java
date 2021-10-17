package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {
    private StringCalculator stringCalculator;
    
     @Rule
    public ExpectedException thrown = ExpectedException.none();
    
    @Before
    public void initialize() {
        stringCalculator = new StringCalculator();
    }


    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
      @Test
    public void numbersCommaDelimitedShouldBeSummed() {
        assertEquals(calculator.add("1,2"), 3);
        assertEquals(25, stringCalculator.add("10,15"));
    }
    
    @Test
    public void numbersNewlineDelimitedShouldBeSummed() {
        assertEquals(stringCalculator.add("1\n2"), 3);
        assertEquals(stringCalculator.add("11\n13"), 24);
    }
}
