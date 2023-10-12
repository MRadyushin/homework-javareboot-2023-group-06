package ru.sberbank.edu.impl;

import ru.sberbank.edu.Greeting;
/**
 * Класс GreetingImpl реализует интерфейс Greeting
 * @author Максим Радюшин{
 */
public class GreetingImpl implements Greeting {
    /**
     * @Override - переопределение метода
     * Метод возвращает информация обо мне
     */
    @Override
    public String getBestHobby() {
        return "Привет! Меня зовут Радюшин Максим и я работаю в Сбербанке. Мое главное хобби - Футбол";
    }
}
