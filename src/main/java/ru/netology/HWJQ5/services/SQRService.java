package ru.netology.HWJQ5.services;

public class SQRService {
    public int calcSqrt(int x, int y) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqrt = i * i;
            if (sqrt >= x) {
                if (sqrt <= y) {
                    count++;
                }
            }

        }
        return count;
    }
}