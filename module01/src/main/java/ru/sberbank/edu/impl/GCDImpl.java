package ru.sberbank.edu.impl;

import ru.sberbank.edu.CommonDivisor;

public class GCDImpl implements CommonDivisor {
    @Override
    public int getDivisor(int firstNumber, int secondNumber) {
        while (firstNumber != 0) {
            int remains = secondNumber % firstNumber;
            secondNumber = firstNumber;
            firstNumber = remains;
        }
        return secondNumber;
    }
}
