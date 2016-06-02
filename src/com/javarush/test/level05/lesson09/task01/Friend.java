package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend{
    //напишите тут ваш код
    public String Name;
    public int Age;
    public String Sex;

    public Friend(String name, int age, String sex) {
        Name = name;
        Age = age;
        Sex = sex;
    }

    public Friend(String name, int age) {
        Name = name;
        Age = age;
    }

    public Friend(String name) {

        Name = name;
    }
}