package com.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Không thể chia cho 0");
        }
        return a / b;
    }

    // Hàm này chúng ta sẽ tạm thời "quên" viết test để xem JaCoCo báo thấp coverage
    public String getStatus(int score) {
        if (score >= 50) {
            return "Đạt";
        } else {
            return "Trượt";
        }
    }
}