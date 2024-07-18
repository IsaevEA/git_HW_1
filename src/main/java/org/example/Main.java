package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадайте за 5 попыток число от 1 до 100");
        int count = 0;
        for (int i = 0; i < 5; i++) {
            count++;
            System.out.println("Попытка " + count);
            int num2 = scanner.nextInt();
            if (num2 == num1){
                System.out.println("Игра закончена");
                break;
            } else if (num2> num1) {
                System.out.println("ваше число больше чем мое");
            } else {
                System.out.println("ваше число меньше чем мое");
            }
        }
        System.out.println("Загаданное число " + num1);
    }
}