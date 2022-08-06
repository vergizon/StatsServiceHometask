package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StatsServiceTest {

    @Test

    public void findSumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumSales = 180;
        int actualSumSales = service.sumSales(sales);

        Assertions.assertEquals(expectedSumSales, actualSumSales);

    }

    @Test

    public void findAverageSumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expectedAverageSumSales = 15;
        double actualAverageSumSales = service.averageSumSales(sales);

        Assertions.assertEquals(expectedAverageSumSales, actualAverageSumSales);

    }

    @Test

    public void findMaxMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonthSales = 8;
        int actualMaxMonthSales = service.maxMonthSales(sales);

        Assertions.assertEquals(expectedMaxMonthSales, actualMaxMonthSales);

    }

    @Test

    public void findMinMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonthSales = 9;
        int actualMinMonthSales = service.minMonthSales(sales);

        Assertions.assertEquals(expectedMinMonthSales, actualMinMonthSales);

    }

    @Test

    public void monthsBelowAverageSumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthsBelowAverageSumSales = 5;
        int actualMonthsBelowAverageSumSales = service.monthsBelowAverageSumSales(sales);

        Assertions.assertEquals(expectedMonthsBelowAverageSumSales, actualMonthsBelowAverageSumSales);

    }

    @Test

    public void monthsHigherAverageSumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthsHigherAverageSumSales = 5;
        int actualMonthsHigherAverageSumSales = service.monthsHigherAverageSumSales(sales);

        Assertions.assertEquals(expectedMonthsHigherAverageSumSales, actualMonthsHigherAverageSumSales);

    }
}