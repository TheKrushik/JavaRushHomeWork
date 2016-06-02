package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;
import java.util.Arrays;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int maximum;
        {
            int count = -1;

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for (; count < 0 ;)
            {
//                System.out.print("Введите кол-во чисел N:");
                count = Integer.parseInt(reader.readLine());
                if (count <= 0)
                    System.out.println("кол-во должно быть больше 0!");
            }

            maximum = Integer.parseInt(reader.readLine());

            for (int i = 0; i < count-1; i++)
            {
                int a= Integer.parseInt(reader.readLine());
                maximum = maximum > a? maximum: a;
            }
        }
        System.out.println(maximum);
    }
}

