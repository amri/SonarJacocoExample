import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amri on 6/4/2015.
 */
public class Test1 {

    @Test
    public void testTrue() {
        assertEquals(true, Main.isEven(2));
    }

    @Test
    public void testFalse() {
        assertEquals(false, Main.isEven(3));
    }
}
