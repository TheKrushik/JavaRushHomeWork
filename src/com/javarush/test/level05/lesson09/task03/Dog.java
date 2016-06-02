package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    public String Name;
    public String Height;
    public String Color;

    public Dog(String name, String height, String color) {
        Name = name;
        Height = height;
        Color = color;
    }

    public Dog(String name, String height) {

        Name = name;
        Height = height;
    }

    public Dog(String name) {

        Name = name;
    }
}
