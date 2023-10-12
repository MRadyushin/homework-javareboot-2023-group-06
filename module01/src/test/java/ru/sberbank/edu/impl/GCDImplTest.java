package ru.sberbank.edu.impl;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class GCDImplTest {
    private final int firstNumber = 15;
    private final int secondNumber = 9;
    private final int expected = 3;

    @Test
    public void getDivisorTest(){
        GCDImpl gcd = new GCDImpl();
        int actual = gcd.getDivisor(firstNumber,secondNumber);
        Assert.assertEquals(expected,actual);
    }
}
