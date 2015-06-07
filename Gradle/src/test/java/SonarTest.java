import com.personal.amri.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amri on 6/7/2015.
 */
public class SonarTest {

    @Test
    public void add() {
        Calculator calc = new Calculator();
        int value = calc.add(1, 2);
        assertEquals(3, value);


    }
}
