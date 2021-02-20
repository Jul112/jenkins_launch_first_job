import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions.fail;

public class SimpleTests {
    @Test
    @DisplayName("Simle positive test")
    void simplePositiveTest() {
        assertThat(true, is(true)); //with hamcrest or assertEquals(true,true)=with JUnit5 Assertions
    }
    @Test
    @DisplayName("Simle negative test")
    void negativeTest() {
        assertThat(true, is(false));
    }
}
