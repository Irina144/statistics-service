package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithMixedIncomes() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {10, 5, 12}; // сначала меньше (false), потом больше (true)
        long expected = 12;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }
}
