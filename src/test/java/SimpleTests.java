import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class SimpleTests {
    @Test
    void positiveTest() {
        assertTrue(true); //=assertEquals(true, true)
    }
    @Test
    void negativeTest() {
        fail(); //=assertEquals(true, false)
    }
}
