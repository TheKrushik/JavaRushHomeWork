package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = 0;
        int mid = 0;
        int min = 0;
        if(a>=b && a>=c){
            max = a;
            if (b >= c){
                mid = b;
                min = c;
            }
            else{
                mid = c;
                min = b;
            }
        }else if(b>=a && b>=c){
            max = b;
            if (a >= c){
                mid = a;
                min = c;
            }
            else{
                mid = c;
                min = a;
            }
        }else if(c>=a && c>=b){
            max = c;
            if (a >= b){
                mid = a;
                min = b;
            }
            else{
                mid = b;
                min = a;
            }
        }

        System.out.println(max);
        System.out.println(mid);
        System.out.println(min);

    }
}
