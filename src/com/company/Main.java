package com.company;

import java.util.Scanner;

        public class Main {
            public static int multiplication(int num1, int num2) {
                int result = 0;
                boolean negative_num = (num1 < 0 && num2 >= 0) || (num2 < 0 && num1 >= 0);
                boolean positive_num = !negative_num;
                num1 = Math.abs(num1);
                for (int i = 0; i < num1; i++) {
                    if (negative_num && num2 > 0 || positive_num && num2 < 0)
                        result -= num2;
                    else
                        result += num2;
                }
                return result;
            }
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.print("Введите первое число: ");
                int num1 = in.nextInt();
                System.out.print("Введите второе число: ");
                int num2 = in.nextInt();
                System.out.println("\nОтвет: " + multiplication(num1,num2));
            }
        }
