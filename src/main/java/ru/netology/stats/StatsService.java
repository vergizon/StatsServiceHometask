package ru.netology.stats;

public class StatsService {
    public int sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum = (int) (sum + sale);
        }
        return sum;

    }

    public double averageSumSales(long[] sales) {
        double averageSum = sumSales(sales) / 12;
        return averageSum;
    }

    public int maxMonthSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minMonthSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthsBelowAverageSumSales(long[] sales) {
        int worseMonth = 0;
        for (long sale : sales) {
            if (sale < averageSumSales(sales)) {
                worseMonth++;
            }
        }
        return worseMonth;
    }

    public int monthsHigherAverageSumSales(long[] sales) {
        int betterMonth = 0;
        for (long sale : sales) {
            if (sale > averageSumSales(sales)) {
                betterMonth++;
            }
        }
        return betterMonth;
    }


}
