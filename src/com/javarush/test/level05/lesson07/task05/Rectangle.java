package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //напишите тут ваш код
    private int top;
    private int left;
    private int wedth;
    private int height;

    public void initialize(int top, int left, int wedth, int height){
        this.top = top;
        this.left = left;
        this.wedth = wedth;
        this.height = height;
    }
    public void initialize(int top, int left){
        this.top = top;
        this.left = left;
    }
    public void initialize(int top, int left, int wedth){
        this.top = top;
        this.left = left;
        this.wedth = wedth;

    }

    public void initialize(Rectangle rect)
    {
        this.top = rect.top;
    }
}
