package ru.sberbank.edu.impl;

import ru.sberbank.edu.CommonDivisor;

/**
 * Класс GCDImpl реализует интерфейс CommonDivisor
 * @author Максим Радюшин{
 */
public class GCDImpl implements CommonDivisor {
    /**
     * @Override - переопределение метода
     * Метод возвращает наибольший делитель 2-ух чисел. (Алгоритм Евклида)
     * @param firstNumber - Первое число
     * @param secondNumber - Второе число
     * @return - наибольший делитель
     */
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
