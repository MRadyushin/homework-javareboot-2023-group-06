package ru.sberbank.edu.impl;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;


public class GreetingImplTest {
    private final String actual = new GreetingImpl().getBestHobby();

    @Test
    public void getBestHobbyTest() {
        String expected = "Привет! Меня зовут Радюшин Максим и я работаю в Сбербанке. Мое главное хобби - Футбол";
        Assert.assertEquals(expected, actual);
    }

}
