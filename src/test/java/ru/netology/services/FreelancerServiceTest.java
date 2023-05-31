package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class FreelancerServiceTest {

    @ParameterizedTest
   @CsvFileSource(files = "src/test/resources/testparam")
    public void calculateShouldReturnCorrectNumberOfMonths(int expected, int income, int expenses, int threshold) {
        FreelancerService service = new FreelancerService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}