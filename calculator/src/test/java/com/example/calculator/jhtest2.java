package com.example.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class jhtest2 {
    Calculator calc = new Calculator();
    @Test
    public void test_양수곱셈() {

        int result = calc.multiply(4, 2);

        assertEquals("두 곱셈의 값은 8이어야 합니다.", 8, result);
    }
}
