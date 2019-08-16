package com.example.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(5, 4);

        System.out.println("result = " + result);
        if (result == 9) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }

    }
}
