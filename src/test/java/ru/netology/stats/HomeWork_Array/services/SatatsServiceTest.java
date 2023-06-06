package ru.netology.stats.HomeWork_Array.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.stats.HomeWork_Array.services.SatatsService;

public class SatatsServiceTest {

    @Test
    public void testShouldFindSumAllSales() {
        SatatsService service = new SatatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println("Сумма всех продаж = " + service.sumSales(sales));
        //int expectedsum = 180;
        //int actualsum = (int) service.sumSales(sales);
        //Assertions.assertEquals(expectedsum,actualsum);
    }


    @Test
    public void testShouldFindMidlSumSales() {
        SatatsService service = new SatatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println("Средняя сумма продаж = " + service.midlelSales(sales));
    }


    @Test
    public void testShouldFindMonthMinSales() {
        SatatsService service = new SatatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println("Номер месяца с минимальными продажами = " + service.monthMinSales(sales));
    }


    @Test
    public void testShouldFindMonthMaxSales() {
        SatatsService service = new SatatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println("Номер месяца с максимальными продажами = " + service.monthMaxSales(sales));
    }

    @Test
    public void testShouldFindminmonthSales() {
        SatatsService service = new SatatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.minMonthSales(sales);
        Assertions.assertEquals(expected, actual);
        //System.out.println("Кол-во месяцев с продажами ниже среднего: " + service.minMonthSales(sales));

    }

    @Test
    public void testShouldFindmaxnmonthSales() {
        SatatsService service = new SatatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.maxMonthSales(sales);
        Assertions.assertEquals(expected, actual);

    }
}
