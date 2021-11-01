package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

  @Test
  void findMax() {
    StatisticsService service = new StatisticsService();

    long[] incomesInBillions = {5, 15, 8, 4, 0, 3, 8, 0, 11, 11, 12};
    long expected = 15;

    long actual = service.findMax(incomesInBillions);

    assertEquals(expected, actual);
  }
  @Test
  void findMin() {
    StatisticsService service = new StatisticsService();

    long[] incomesInBillions = {12, 5, 8, 4, 0, 3, 8, 0, 11, 11, 12};
    long expected = 0;

    long actual = service.findMin(incomesInBillions);

    assertEquals(expected, actual);
  }
}