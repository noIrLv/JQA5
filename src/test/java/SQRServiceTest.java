package ru.netology.HWJQ5.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test
    public void test() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(100, 10000);
        int expected = 90;

        assertEquals(expected, actual);
    }
}


