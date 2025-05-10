import org.junit.jupiter.api.Test;
import statistic.MaxNumber;

import static org.junit.jupiter.api.Assertions.*;
import statistic.MaxNumber;

public class MaxNumberTest {

    @Test
    void whenAIsGreaterThanB() {
        MaxNumber service = new MaxNumber();
        assertEquals(5, service.maxNumber(5, 3)); // ветка: a >= b
    }

    @Test
    void whenAIsLessThanB() {
        MaxNumber service = new MaxNumber();
        assertEquals(10, service.maxNumber(2, 10)); // ветка: a < b
    }
}