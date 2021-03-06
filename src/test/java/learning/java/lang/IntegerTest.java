package learning.java.lang;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class IntegerTest {

    @Test
    public void test() {
        assertThat(3 / 2, is(1));
        assertThat(3 / 2 * 10, is(10));
        assertThat(3.0 / 2.0 * 10.0, is(15.0));
    }
}
