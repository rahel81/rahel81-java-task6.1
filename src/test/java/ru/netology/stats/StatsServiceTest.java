package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSumSales() {
        StatsService service = new StatsService();

        int expected = 180;

        int actual = service.calculateSumSales(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageSales() {
        StatsService service = new StatsService();

        int expected = 15;

        int actual = service.calculateAverageSales(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void monthMaxSales() {
        StatsService service = new StatsService();

        int expected = 8;

        int actual = service.monthMaxSales(values);

        assertEquals(expected, actual);
    }

    @Test
    void monthMinSales() {
        StatsService service = new StatsService();

        int expected = 9;

        int actual = service.monthMinSales(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void sumMonthMaxSales() {
        StatsService service = new StatsService();

        int expected = 5;

        int actual = service.sumMonthMaxSales(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void sumMonthMinSales() {
        StatsService service = new StatsService();

        int expected = 5;

        int actual = service.sumMonthMinSales(purchases);

        assertEquals(expected, actual);
    }
}