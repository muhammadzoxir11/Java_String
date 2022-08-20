package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setProperty;

public class StringTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Random random = new Random();
        int correctCount = 0;
        int incorrectCount = 0;

        System.out.println("Math Game ");
        for (int i = 1; i <= 5; i++) {


            int number1 = random.nextInt(20);
            int number2 = random.nextInt(10);
            int n = random.nextInt(4);
            int res = 0;
            switch (n) {
                case 0 -> {
                    res = number1 + number2;
                    System.out.print(number1 + " + " + number2 + " = ");
                }
                case 1 -> {
                    res = number1 - number2;
                    System.out.print(number1 + " - " + number2 + " = ");
                }
                case 2 -> {
                    res = number1 * number2;
                    System.out.print(number1 + " * " + number2 + " = ");
                }
                case 3 -> {
                    res = number1 / number2;
                    System.out.print(number1 + " / " + number2 + " = ");
                }

            }
            int answer = scanner.nextInt();
            if (answer == res) {

                correctCount++;
            } else {
                incorrectCount++;
            }

        }
        System.out.println("answers end correct " + correctCount);
        //2+4+6+8+10=30
        //11 22 33 44 55


    }


}
