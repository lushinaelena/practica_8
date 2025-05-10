import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import statistic.StatisticsService;

public class StatisticsServiceTest {

    @Test
    void findMaxWhenLastIsMax() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {3, 5, 7, 10}; // максимум — последний элемент
        long expected = 10;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMiddleIsMax() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {2, 15, 3}; // максимум — середина
        long expected = 15;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenFirstIsMax() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {20, 10, 5}; // максимум — первый элемент
        long expected = 20;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenAllAreEqual() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {5, 5, 5, 5};
        long expected = 5;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }
}

