package com.example.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void test_양수덧셈() {
        int result = calc.add(5, 4);

        assertEquals("add 함수의 결과는 9이어야 합니다.", 9, result);
    }

    @Test
    public void test_음수덧셈() {
        int result = calc.add(-5, -4);

        assertEquals("add 함수의 결과는 -9이어야 합니다.", -9, result);
    }

    @Test
    public void test_양수덧셈2() {
        int result = calc.add(5, 4);

        assertNotEquals(0, result);
    }

    @Test
    public void test_정수나눗셈() {
        int result = calc.divide(10, 5);

        assertEquals(2, result);
    }

    @Test
    public void test_실수나눗셈() {
        double result = calc.divide(10.0, 4.0);

        assertEquals(2.5, result);
    }

    @Test(expected = ArithmeticException.class)
    public void test_0나눗셈() {
        double result = calc.divide(10, 0);

        assertEquals(0, result);
    }

    @Test
    public void test_양수뺄셈() {
        int result = calc.subtract(10, 5);

        assertEquals("두 뺄셈의 차는 5이어야 합니다.", 5, result);
    }

    @Test
    public void test_양수곱셈() {
        int result = calc.multiply(4, 2);

        assertEquals("두 곱셈의 값은 8이어야 합니다.", 8, result);
    }
}
