package ru.netology.stats;

public class StatsService {
    public int calculateSumSales(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }
        return sum;
    }

    public int calculateAverageSales(int[] purchases) {
        int month = purchases.length;
        int average = calculateSumSales(purchases) / month;
        return average;
    }

    public int monthMaxSales(int[] values) {
        int month = 0, maxMonth = values[0], numberMonth = 0;
        for (int value : values) {
            month = month + 1;
            if (maxMonth <= value) {
                maxMonth = value;
                numberMonth = month;
            }
        }
        return numberMonth;
    }

    public int monthMinSales(int[] values) {
        int month = 0, minMonth = values[0], numberMonth = 0;
        for (int value : values) {
            month = month + 1;
            if (minMonth >= value) {
                minMonth = value;
                numberMonth = month;
            }
        }
        return numberMonth;
    }

    public int sumMonthMaxSales(int[] purchases) {
        int numberMonth = 0, average = calculateAverageSales(purchases);
        for (int a = 0; a < purchases.length; a++) {
            if (purchases[a] < average) {
                numberMonth++;
            }
        }
        return numberMonth;
    }

    public int sumMonthMinSales(int[] purchases) {
        int numberMonth = 0, average = calculateAverageSales(purchases);
        for (int a = 0; a < purchases.length; a++) {
            if (purchases[a] > average) {
                numberMonth++;
            }
        }
        return numberMonth;
    }
}
