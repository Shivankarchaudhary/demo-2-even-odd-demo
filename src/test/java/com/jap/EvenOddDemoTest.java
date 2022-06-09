package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddDemoTest {

    EvenOddDemo evenOddDemo;
    @Before
    public void setUp()  {
        evenOddDemo=new EvenOddDemo();
    }

    @After
    public void tearDown()  {
        evenOddDemo = null;
    }

    @Test
    public void givenPositiveNumberIsEven() {
        boolean actualResult = evenOddDemo.isEven(100000);
        assertTrue(actualResult);

    }
    @Test
    public void givenNegativeNumberIsEven() {
        boolean actualResult = evenOddDemo.isEven(-9023);
        assertFalse(actualResult);

    }

    @Test
    public void givenPositiveNumberIsPalindrome() {
        boolean actualResult = evenOddDemo.isPalindrome(100000);
        assertFalse(actualResult);

    }
    @Test
    public void givenNegativeNumberIsPalindrome() {
        boolean actualResult = evenOddDemo.isPalindrome(-123321);
        assertFalse(actualResult);

    }
}