package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    public String Name;
    public int Weight;
    public int Age;
    public String Color;
    public String Adress;

    public Cat(int weight, String color, String adress) {
        Weight = weight;
        Color = color;
        Adress = adress;
    }

    public Cat(int weight, String color) {

        Weight = weight;
        Color = color;
    }

    public Cat(String name) {
        Name = name;
    }

    public Cat(String name, int weight, int age) {
        Name = name;
        Weight = weight;
        Age = age;
    }

    public Cat(String name, int age) {
        Name = name;
        Age = age;
    }
}
