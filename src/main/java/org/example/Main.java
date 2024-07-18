package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Угадай число от 1 до 100");
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
        System.out.println("как то так?");
    }
}