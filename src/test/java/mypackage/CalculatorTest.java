package mypackage;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void twoAndThreeIsFive() throws Exception {
        final long result = new Calculator().addFucn(2, 3);
        assertThat(result, is(5L));
    }

    @Test
    public void threeMinusTwoIsOne() throws Exception {
        final long result = new Calculator().subFucn(3, 2);
        assertThat(result, is(1L));
    }
    
    @Test
    public void threeXThreeIsNine() throws Exception {
        final long result = new Calculator().mulFucn(3, 3);
        assertThat(result, is(9L));
    } 
    @Test
    public void threeDividesThreeIsOne() throws Exception {
        final float result = new Calculator().divFucn(3, 3);
        assertThat(result, is(1.0F));
    }
    @Test
    public void threeAverageThreeIsThree() throws Exception {
        final float result = new Calculator().avgFucn(3, 3);
        assertThat(result, is(3.0F));
    }
    @Test
    public void threeModulusTwoIsOne() throws Exception {
        final long result = new Calculator().modFucn(3, 2);
        assertThat(result, is(1L));
    }	
 
}
