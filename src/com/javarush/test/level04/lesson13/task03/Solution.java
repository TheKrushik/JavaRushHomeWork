package com.javarush.test.level04.lesson13.task03;

import java.io.*;
import java.util.Scanner;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        int a = 8;
        for (int i = 1; i<=10; i++)
        {
            for (int j = i; j>0; j--)
            {
                System.out.print(a);
            }
            System.out.println();
        }

    }
}
