package ru.netology.stats.HomeWork_Array.services;

public class StatsService {

    public int sumSales(int[] sales) {
        int sum = 0;

        for (int s = 0; s < sales.length; s++) {
            sum = sum + sales[s];
        }
        return sum;

    }

    public int midlelSales(int[] sales) {
        int sum = 0;

        for (int s = 0; s < sales.length; s++) {
            sum = sum + sales[s];
        }
        int midleSum = sum / sales.length;
        return midleSum;
    }

    public int monthMinSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1

    }

    public int monthMaxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minMonthSales(int[] sales) {
        int min = 0;
        for (int sale : sales) {
            if (sale < midlelSales(sales)) {
                min++;
            }
        }
        return min;
    }


    public int maxMonthSales(int[] sales) {
        int max = 0;
        for (int sale : sales) {
            if (sale > midlelSales(sales)) {
                max++;
            }
        }
        return max;
    }
}



