import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestFizzBuzz {

    @BeforeEach
    private FizzBuzz initFizzBuzzInstance() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        return fizzbuzz;
    }

    @Test
    public void shouldPrintFizzForMultipleOfThree(){
        assertThat(initFizzBuzzInstance().print((byte) 3),is("Fizz"));
    }

    @Test
    public void shouldPrintBuzzForMultipleOfFive(){
        assertThat(initFizzBuzzInstance().print((byte) 5),is("Buzz"));
    }

    @Test
    public void shouldPrintFizzBuzzForMultipleOfThreeAndFive(){
        assertThat(initFizzBuzzInstance().print((byte) 15),is("FizzBuzz"));
    }

    @Test
    public void shouldPrintNumberIfNotMultiple(){
        assertThat(initFizzBuzzInstance().print((byte) 17),is("17"));
    }

}
