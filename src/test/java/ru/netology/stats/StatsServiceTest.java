package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test
    public void testSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverages() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.average(sales);
        long expected = 180 / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxDay() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.getMaxSaleMonth(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinDay() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.getMinSaleMonth(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSalesBellowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.salesBellowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSalesAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.salesAboveAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}