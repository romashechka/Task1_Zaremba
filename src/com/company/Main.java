package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Приветствовать пользователя по имени
        System.out.print("Enter your name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hellow, "+name);
        System.out.println();
        //scan.close();

     // Ввести пароль исравнить его с существующим
        System.out.print("Enter password: ");

        String pas = scan.next();

       if (pas.equals("1111"))
           System.out.println("good pas");
       else System.out.println("wrong pass");


     //6. ести с консоли n целых чисел.
        int n = 5;
        System.out.println("Введите " + n +" целых чисел: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Четные числа: ");

        for (int i = 0; i < n; i++) {
            if (arr[i]%2==0)
            System.out.print(arr[i] + " ");

        }
        System.out.println();

        System.out.println("Нечетные числа: ");

        for (int i = 0; i < n; i++) {
            if (arr[i]%2 > 0)
                System.out.print(arr[i] + " ");

        }
        System.out.println();
     //Числа, которые делятся на 3 или  9

        System.out.println("Числа, которые делятся на 3 или  9: ");

        for (int i = 0; i < n; i++) {
            if ((arr[i]%3==0)||((arr[i]%9==0)))
                System.out.print(arr[i] + " ");
        }
        System.out.println();

     // Числа, которые делятся на 5 и  7
        System.out.println("Числа, которые делятся на 5 и  7: ");

        for (int i = 0; i < n; i++) {
            if ((arr[i]%5==0)&&((arr[i]%7==0)))
                System.out.print(arr[i] + " ");
        }
        System.out.println();
     //Элементы, которые равны полусумме соседних элементов.
        System.out.println("Элементы, которые равны полусумме соседних элементов: ");
        for (int i = 0; i < n-2; i++) {
            if (arr[i+1] == (arr[i]+arr[i+2])/2)
                System.out.print(arr[i+1] + " ");
        }
        System.out.println();

     //Наибольшее число
        int max = 0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i]>arr[i+1]){
                max = arr[i];
            }
        }
        System.out.println("Наибольшее число: " + max);
        System.out.println();


    }
}
