package ru.sberbank.edu.impl;

import ru.sberbank.edu.Greeting;

public class GreetingImpl implements Greeting {
    @Override
    public String getBestHobby() {
        return "Привет! Меня зовут Радюшин Максим и я работаю в Сбербанке. Мое главное хобби - Футбол";
    }
}
